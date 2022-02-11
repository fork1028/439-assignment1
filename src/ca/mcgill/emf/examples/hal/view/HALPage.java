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
	// room's sensor devices
	private JLabel removeSensorDeviceLabel = new JLabel();
	private JTable sensorDevicesTable = new JTable();
	private JScrollPane sensorDevicesScrollPane = new JScrollPane(sensorDevicesTable);
	private JLabel newSensorDeviceNameLabel = new JLabel();
	private JTextField newSensorDeviceNameTextField = new JTextField();
	private JComboBox<String> sensorDeviceTypeList = new JComboBox<String>(new String[0]);
	private JButton addSensorDeviceButton = new JButton();

	// data elements
	private String error = null;
	// room's sensor devices
	private DefaultTableModel sensorDevicesDtm;
	private String sensorDevicesColumnNames[] = { "Sensor Device" };
	private static final int HEIGHT_TEAMS_TABLE = 100;

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

//		// elements for group's teams
//		removeTeamLabel.setText("Select a row in the table and hit the delete key to remove a team");
//		this.add(teamsScrollPane);
//		Dimension d = teamsTable.getPreferredSize();
//		teamsScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
//		teamsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		teamsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		// enable delete key in table to remove a row (team)
//		InputMap inputMap = teamsTable.getInputMap(JComponent.WHEN_FOCUSED);
//		ActionMap actionMap = teamsTable.getActionMap();
//		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
//		actionMap.put("delete", new AbstractAction() {
//			public void actionPerformed(ActionEvent deleteEvent) {
//				teamsTableDeleteKeyActionPerformed(deleteEvent);
//			}
//		});
//		newTeamNameLabel.setText("New Team Name:");
//		initializeButton(addTeamButton, "Add Team", this::addTeamButtonActionPerformed);

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
				.addComponent(removeSensorDeviceLabel).addComponent(sensorDevicesScrollPane)
				.addGroup(layout.createSequentialGroup().addComponent(newSensorDeviceNameLabel)
						.addComponent(newSensorDeviceNameTextField, 200, 200, 400).addComponent(addSensorDeviceButton))));

		layout.setVerticalGroup(layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup().addComponent(errorMessage)
						.addGroup(layout.createParallelGroup().addComponent(roomsList).addComponent(showRoomButton)
								.addComponent(deleteRoomButton).addComponent(clearRoomButton))
						.addComponent(horizontalLine)
						.addGroup(layout.createParallelGroup().addComponent(roomNameLabel).addComponent(roomNameText))
						.addGroup(layout.createParallelGroup().addComponent(newRoomNameLabel)
								.addComponent(newRoomNameTextField).addComponent(addRoomButton)
								.addComponent(updateRoomButton))
						.addComponent(removeSensorDeviceLabel).addComponent(sensorDevicesScrollPane)
						.addGroup(layout.createParallelGroup().addComponent(newSensorDeviceNameLabel)
								.addComponent(newSensorDeviceNameTextField).addComponent(addSensorDeviceButton))));

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
				populateSensorDevicesTable(null);
				newSensorDeviceNameTextField.setText("");
				// set allowed UI elements to enabled
				clearRoomButton.setEnabled(false);
				addRoomButton.setEnabled(true);
				updateRoomButton.setEnabled(false);
				newSensorDeviceNameTextField.setEnabled(false);
				addSensorDeviceButton.setEnabled(false);
			} else {
				// room
				roomNameText.setText(foundRoom.getName());
				newRoomNameTextField.setText(foundRoom.getName());
				// room's sensor devices
				populateSensorDevicesTable(foundRoom);
				newSensorDeviceNameTextField.setText("");
				// set allowed UI elements to enabled
				clearRoomButton.setEnabled(true);
				addRoomButton.setEnabled(false);
				updateRoomButton.setEnabled(true);
				newSensorDeviceNameTextField.setEnabled(true);
				addSensorDeviceButton.setEnabled(true);
			}
			Dimension d = sensorDevicesTable.getPreferredSize();
			sensorDevicesScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
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

//	private void addSensorDeviceButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		error = HALController.addSensor(roomNameText.getText(), newSensorDeviceNameTextField.getText());
//		refreshData(roomNameText.getText());
//	}

	private void sensorDevicesTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
		if (sensorDevicesTable.getSelectedRow() != -1) {
			String sensorDeviceName = (String) sensorDevicesTable.getModel().getValueAt(sensorDevicesTable.getSelectedRow(), 0);
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete sensor device " + sensorDeviceName + "?",
					"Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) {
				error = HALController.deleteSensor(sensorDeviceName);
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

	private void populateSensorDevicesTable(TORoom foundRoom) {
		sensorDevicesDtm = new DefaultTableModel(0, 0);
		sensorDevicesDtm.setColumnIdentifiers(sensorDevicesColumnNames);
		sensorDevicesTable.setModel(sensorDevicesDtm);
		if (foundRoom != null) {
			for (String sensorDeviceName : foundRoom.getSensorDeviceNames()) {
				Object[] obj = { sensorDeviceName };
				sensorDevicesDtm.addRow(obj);
			}
		}
	}

}
