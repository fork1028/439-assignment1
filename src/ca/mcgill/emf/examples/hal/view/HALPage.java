package ca.mcgill.emf.examples.hal.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import ca.mcgill.emf.examples.hal.controller.HALController;
import ca.mcgill.emf.examples.hal.controller.TORoom;

public class HALPage extends JFrame {

	private static final long serialVersionUID = -4426310869335015542L;

	// UI elements
	private JLabel errorMessage = new JLabel();
	// room
	private JComboBox<String> roomsList = new JComboBox<String>(new String[0]);
	private JButton showRoomButton = new JButton();
	private JButton deleteRoomButton = new JButton();
	private JButton clearRoomButton = new JButton();
	private JLabel roomNameLabel = new JLabel();
	private JLabel roomNameText = new JLabel();
	private JLabel newRoomNameLabel = new JLabel();
	private JTextField newRoomNameTextField = new JTextField();
	private JButton addRoomButton = new JButton();
	private JButton updateRoomButton = new JButton();
	// room's devices
	private JLabel removeDeviceLabel = new JLabel();
	private JTable devicesTable = new JTable();
	private JScrollPane devicesScrollPane = new JScrollPane(devicesTable);
	private JLabel newDeviceNameLabel = new JLabel();
	private JTextField newDeviceNameTextField = new JTextField();
	private JComboBox<String> deviceTypeList = new JComboBox<String>(new String[0]);
	private JButton addDeviceButton = new JButton();
	// data elements
	private String error = null;
	// room's devices
	private DefaultTableModel devicesDtm;
	private String devicesColumnNames[] = { "Device Name", "Device Type" };
	private static final int HEIGHT_DEVICES_TABLE = 100;

	public HALPage() {
		initComponents();
		refreshData(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 */
	@SuppressWarnings("serial")
	private void initComponents() {
		// elements for error message
		errorMessage.setForeground(Color.RED);

		// elements for room
		initializeButton(showRoomButton, "Show", this::showRoomButtonActionPerformed);
		initializeButton(deleteRoomButton, "Delete", this::deleteRoomButtonActionPerformed);
		initializeButton(clearRoomButton, "Clear", this::clearRoomButtonActionPerformed);
		roomNameLabel.setText("Room Name:");
		roomNameText.setText("");
		newRoomNameLabel.setText("New Room Name:");
		initializeButton(addRoomButton, "Add", this::addRoomButtonActionPerformed);
		initializeButton(updateRoomButton, "Update", this::updateRoomButtonActionPerformed);

		// elements for room's sensor devices
		removeDeviceLabel.setText("Select a row in the table and hit the tab key to remove a device");
		this.add(devicesScrollPane);
		Dimension sd = devicesTable.getPreferredSize();
		devicesScrollPane.setPreferredSize(new Dimension(sd.width, HEIGHT_DEVICES_TABLE));
		devicesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		devicesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// enable delete key in table to remove a row (sensor device)
		InputMap inputMap = devicesTable.getInputMap(JComponent.WHEN_FOCUSED);
		ActionMap actionMap = devicesTable.getActionMap();
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "delete");
		actionMap.put("delete", new AbstractAction() {
			public void actionPerformed(ActionEvent deleteEvent) {
				sensorDevicesTableDeleteKeyActionPerformed(deleteEvent);
			}
		});
		newDeviceNameLabel.setText("New Device Name:");
		initializeButton(addDeviceButton, "Add Device", this::addDeviceButtonActionPerformed);

		// global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Home Automation Language (HAL) System");

		// horizontal line elements
		JSeparator horizontalLine = new JSeparator();

		// layout
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup()
				.addComponent(errorMessage)
				.addGroup(layout.createSequentialGroup().addComponent(roomsList, 200, 200, 400)
						.addComponent(showRoomButton).addComponent(deleteRoomButton).addComponent(clearRoomButton))
				.addComponent(horizontalLine)
				.addGroup(layout.createSequentialGroup().addComponent(roomNameLabel).addComponent(roomNameText))
				.addGroup(layout.createSequentialGroup().addComponent(newRoomNameLabel)
						.addComponent(newRoomNameTextField, 200, 200, 400).addComponent(addRoomButton)
						.addComponent(updateRoomButton))
				.addComponent(removeDeviceLabel).addComponent(devicesScrollPane)
				.addGroup(layout.createSequentialGroup().addComponent(newDeviceNameLabel)
						.addComponent(newDeviceNameTextField, 100, 100, 200).addComponent(deviceTypeList)
						.addComponent(addDeviceButton))));

		layout.setVerticalGroup(layout.createParallelGroup().addGroup(layout.createSequentialGroup()
				.addComponent(errorMessage)
				.addGroup(layout.createParallelGroup().addComponent(roomsList).addComponent(showRoomButton)
						.addComponent(deleteRoomButton).addComponent(clearRoomButton))
				.addComponent(horizontalLine)
				.addGroup(layout.createParallelGroup().addComponent(roomNameLabel).addComponent(roomNameText))
				.addGroup(layout.createParallelGroup().addComponent(newRoomNameLabel).addComponent(newRoomNameTextField)
						.addComponent(addRoomButton).addComponent(updateRoomButton))
				.addComponent(removeDeviceLabel).addComponent(devicesScrollPane)
				.addGroup(layout.createParallelGroup().addComponent(newDeviceNameLabel)
						.addComponent(newDeviceNameTextField).addComponent(deviceTypeList)
						.addComponent(addDeviceButton))));

		pack();
	}

	/**
	 * This method is called each time the page needs to be updated to the latest
	 * data. An empty page is shown if null is passed into the method.
	 */
	private void refreshData(String roomName) {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			// retrieve the room
			TORoom foundRoom = null;
			if (roomName != null) {
				foundRoom = HALController.getRoom(roomName);
			}
			// populate room list
			roomsList.removeAllItems();
			int index = 0, foundIndex = -1;
			for (String rName : HALController.getRooms()) {
				roomsList.addItem(rName);
				if (rName.equals(foundRoom == null ? null : foundRoom.getName())) {
					foundIndex = index;
				}
				index++;
			}
			;
			// populate device types list
			deviceTypeList.removeAllItems();
			for (String typeName : HALController.getAllDeviceTypes()) {
				deviceTypeList.addItem(typeName);
			}
			;
			// enable rooms list UI elements only if at least one group exist
			roomsList.setEnabled(index > 0);
			roomsList.setSelectedIndex(foundIndex);
			showRoomButton.setEnabled(index > 0);
			deleteRoomButton.setEnabled(index > 0);
			// populate other UI elements depending on whether a group was found or not
			if (foundIndex == -1) {
				foundRoom = null;
				// room
				roomNameText.setText("");
				newRoomNameTextField.setText("");
				// room's sensor devices
				populateDevicesTable(null);
				newDeviceNameTextField.setText("");
				// set allowed UI elements to enabled
				clearRoomButton.setEnabled(false);
				addRoomButton.setEnabled(true);
				updateRoomButton.setEnabled(false);
				newDeviceNameTextField.setEnabled(false);
				addDeviceButton.setEnabled(false);
			} else {
				// room
				roomNameText.setText(foundRoom.getName());
				newRoomNameTextField.setText(foundRoom.getName());
				// room's devices
				populateDevicesTable(foundRoom);
				newDeviceNameTextField.setText("");
				// set allowed UI elements to enabled
				clearRoomButton.setEnabled(true);
				addRoomButton.setEnabled(false);
				updateRoomButton.setEnabled(true);
				newDeviceNameTextField.setEnabled(true);
				addDeviceButton.setEnabled(true);
			}
			Dimension d = devicesTable.getPreferredSize();
			devicesScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_DEVICES_TABLE));
		}

		// this is needed because the size of the window changes depending on whether an
		// error message is shown or not
		pack();
	}

	/**
	 * The following ...ActionPerformed methods first call the Controller and then
	 * refresh the page with the desired group.
	 */

	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.addRoom(newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}

	private void clearRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData(null);
	}

	private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (roomsList.getSelectedIndex() != -1) {
			String roomName = (String) roomsList.getSelectedItem();
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete room " + roomName + "?",
					"Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) {
				error = HALController.deleteRoom(roomName);
				refreshData(null);
			}
		}
	}

	private void showRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData((String) roomsList.getSelectedItem());
	}

	private void updateRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HALController.updateRoom(roomNameText.getText(), newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}

	private void addDeviceButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (deviceTypeList.getSelectedItem().toString().equals("Temperature Sensor")
				|| deviceTypeList.getSelectedItem().toString().equals("Movement Sensor")
				|| deviceTypeList.getSelectedItem().toString().equals("Light Sensor")) {
			error = HALController.addSensor(roomNameText.getText(), newDeviceNameTextField.getText(),
					(String) deviceTypeList.getSelectedItem());
		} else {
			error = HALController.addActuator(roomNameText.getText(), newDeviceNameTextField.getText(),
					(String) deviceTypeList.getSelectedItem());
		}
		refreshData(roomNameText.getText());
	}

	private void sensorDevicesTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
		if (devicesTable.getSelectedRow() != -1) {
			String deviceName = (String) devicesTable.getModel().getValueAt(devicesTable.getSelectedRow(), 0);
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete sensor device " + deviceName + "?",
					"Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) {
				if (HALController.getActuatorDeviceTypeName(deviceName) != null
						&& (HALController.getActuatorDeviceTypeName(deviceName).equals("Heater")
								|| HALController.getActuatorDeviceTypeName(deviceName).equals("Lock")
								|| HALController.getActuatorDeviceTypeName(deviceName).equals("Light Switch"))) {
					error = HALController.deleteActuator(deviceName);
				} else if (HALController.getSensorDeviceTypeName(deviceName) != null
						&& (HALController.getSensorDeviceTypeName(deviceName).equals("Temperature Sensor")
								|| HALController.getSensorDeviceTypeName(deviceName).equals("Movement Sensor")
								|| HALController.getSensorDeviceTypeName(deviceName).equals("Light Sensor"))) {
					error = HALController.deleteSensor(deviceName);
				}

				refreshData(roomNameText.getText());
			}
		}
	}

	/**
	 * The following methods are helper methods to simplify the methods.
	 */

	private void initializeButton(JButton button, String text, ActionListener actionListener) {
		button.setText(text);
		button.addActionListener(actionListener);
	}

	private void populateDevicesTable(TORoom foundRoom) {
		devicesDtm = new DefaultTableModel(0, 0);
		devicesDtm.setColumnIdentifiers(devicesColumnNames);
		devicesTable.setModel(devicesDtm);
		if (foundRoom != null) {
			for (String sensorDeviceName : foundRoom.getSensorDeviceNames()) {
				Object[] obj = { sensorDeviceName, HALController.getSensorDeviceTypeName(sensorDeviceName) };
				devicesDtm.addRow(obj);
			}
			for (String actuatorDeviceName : foundRoom.getActuatorDeviceNames()) {
				Object[] obj = { actuatorDeviceName, HALController.getActuatorDeviceTypeName(actuatorDeviceName) };
				devicesDtm.addRow(obj);
			}
		}
	}

}
