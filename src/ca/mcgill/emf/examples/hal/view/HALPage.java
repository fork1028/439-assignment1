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

//	private static final long serialVersionUID = -4426310869335015542L;
//
//	// UI elements
//	private JLabel errorMessage = new JLabel();
//	// group
//	private JComboBox<String> groupsList = new JComboBox<String>(new String[0]);
//	private JButton showGroupButton = new JButton();
//	private JButton deleteGroupButton = new JButton();
//	private JButton clearGroupButton = new JButton();
//	private JLabel groupNameLabel = new JLabel();
//	private JLabel groupNameText = new JLabel();
//	private JLabel newGroupNameLabel = new JLabel();
//	private JTextField newGroupNameTextField = new JTextField();
//	private JButton addGroupButton = new JButton();
//	private JButton updateGroupButton = new JButton();
//	// group's teams
//	private JLabel removeTeamLabel = new JLabel();
//	private JTable teamsTable = new JTable();
//	private JScrollPane teamsScrollPane = new JScrollPane(teamsTable);
//	private JLabel newTeamNameLabel = new JLabel();
//	private JTextField newTeamNameTextField = new JTextField();
//	private JButton addTeamButton = new JButton();
//
//	// data elements
//	private String error = null;
//	// group's teams
//	private DefaultTableModel teamsDtm;
//	private String teamsColumnNames[] = { "Team" };
//	private static final int HEIGHT_TEAMS_TABLE = 100;
//
//	public HALPage() {
//		initComponents();
//		refreshData(null);
//	}
//
//	/**
//	 * This method is called from within the constructor to initialize the form.
//	 */
//	@SuppressWarnings("serial")
//	private void initComponents() {
//		// elements for error message
//		errorMessage.setForeground(Color.RED);
//
//		// elements for group
//		initializeButton(showGroupButton, "Show", this::showGroupButtonActionPerformed);
//		initializeButton(deleteGroupButton, "Delete", this::deleteGroupButtonActionPerformed);
//		initializeButton(clearGroupButton, "Clear", this::clearGroupButtonActionPerformed);
//		groupNameLabel.setText("Group Name:");
//		groupNameText.setText("");
//		newGroupNameLabel.setText("New Group Name:");
//		initializeButton(addGroupButton, "Add", this::addGroupButtonActionPerformed);
//		initializeButton(updateGroupButton, "Update", this::updateGroupButtonActionPerformed);
//
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
//
//		// global settings and listeners
//		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		setTitle("Tournament System: Group Management");
//
//		// horizontal line elements
//		JSeparator horizontalLine = new JSeparator();
//
//		// layout
//		GroupLayout layout = new GroupLayout(getContentPane());
//		getContentPane().setLayout(layout);
//		layout.setAutoCreateGaps(true);
//		layout.setAutoCreateContainerGaps(true);
//		layout.setHorizontalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup()
//				.addComponent(errorMessage)
//				.addGroup(layout.createSequentialGroup().addComponent(groupsList, 200, 200, 400)
//						.addComponent(showGroupButton).addComponent(deleteGroupButton).addComponent(clearGroupButton))
//				.addComponent(horizontalLine)
//				.addGroup(layout.createSequentialGroup().addComponent(groupNameLabel).addComponent(groupNameText))
//				.addGroup(layout.createSequentialGroup().addComponent(newGroupNameLabel)
//						.addComponent(newGroupNameTextField, 200, 200, 400).addComponent(addGroupButton)
//						.addComponent(updateGroupButton))
//				.addComponent(removeTeamLabel).addComponent(teamsScrollPane)
//				.addGroup(layout.createSequentialGroup().addComponent(newTeamNameLabel)
//						.addComponent(newTeamNameTextField, 200, 200, 400).addComponent(addTeamButton))));
//
//		layout.setVerticalGroup(layout.createParallelGroup()
//				.addGroup(layout.createSequentialGroup().addComponent(errorMessage)
//						.addGroup(layout.createParallelGroup().addComponent(groupsList).addComponent(showGroupButton)
//								.addComponent(deleteGroupButton).addComponent(clearGroupButton))
//						.addComponent(horizontalLine)
//						.addGroup(layout.createParallelGroup().addComponent(groupNameLabel).addComponent(groupNameText))
//						.addGroup(layout.createParallelGroup().addComponent(newGroupNameLabel)
//								.addComponent(newGroupNameTextField).addComponent(addGroupButton)
//								.addComponent(updateGroupButton))
//						.addComponent(removeTeamLabel).addComponent(teamsScrollPane)
//						.addGroup(layout.createParallelGroup().addComponent(newTeamNameLabel)
//								.addComponent(newTeamNameTextField).addComponent(addTeamButton))));
//
//		pack();
//	}
//
//	/**
//	 * This method is called each time the page needs to be updated to the latest
//	 * data. An empty page is shown if null is passed into the method.
//	 */
//	private void refreshData(String groupName) {
//		// error
//		errorMessage.setText(error);
//		if (error == null || error.length() == 0) {
//			// retrieve the group
//			TOGroup foundGroup = null;
//			if (groupName != null) {
//				foundGroup = TournamentController.getGroup(groupName);
//			}
//			// populate group list
//			groupsList.removeAllItems();
//			int index = 0, foundIndex = -1;
//			for (String gName : TournamentController.getGroups()) {
//				groupsList.addItem(gName);
//				if (gName.equals(foundGroup == null ? null : foundGroup.getName())) {
//					foundIndex = index;
//				}
//				index++;
//			}
//			;
//			// enable groups list UI elements only if at least one group exist
//			groupsList.setEnabled(index > 0);
//			groupsList.setSelectedIndex(foundIndex);
//			showGroupButton.setEnabled(index > 0);
//			deleteGroupButton.setEnabled(index > 0);
//			// populate other UI elements depending on whether a group was found or not
//			if (foundIndex == -1) {
//				foundGroup = null;
//				// group
//				groupNameText.setText("");
//				newGroupNameTextField.setText("");
//				// group's teams
//				populateTeamsTable(null);
//				newTeamNameTextField.setText("");
//				// set allowed UI elements to enabled
//				clearGroupButton.setEnabled(false);
//				addGroupButton.setEnabled(true);
//				updateGroupButton.setEnabled(false);
//				newTeamNameTextField.setEnabled(false);
//				addTeamButton.setEnabled(false);
//			} else {
//				// group
//				groupNameText.setText(foundGroup.getName());
//				newGroupNameTextField.setText(foundGroup.getName());
//				// group's teams
//				populateTeamsTable(foundGroup);
//				newTeamNameTextField.setText("");
//				// set allowed UI elements to enabled
//				clearGroupButton.setEnabled(true);
//				addGroupButton.setEnabled(false);
//				updateGroupButton.setEnabled(true);
//				newTeamNameTextField.setEnabled(true);
//				addTeamButton.setEnabled(true);
//			}
//			Dimension d = teamsTable.getPreferredSize();
//			teamsScrollPane.setPreferredSize(new Dimension(d.width, HEIGHT_TEAMS_TABLE));
//		}
//
//		// this is needed because the size of the window changes depending on whether an
//		// error message is shown or not
//		pack();
//	}
//
//	/**
//	 * The following ...ActionPerformed methods first call the Controller and then
//	 * refresh the page with the desired group.
//	 */
//
//	private void addGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		error = TournamentController.addGroup(newGroupNameTextField.getText());
//		refreshData(newGroupNameTextField.getText());
//	}
//
//	private void clearGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		error = null;
//		refreshData(null);
//	}
//
//	private void deleteGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		if (groupsList.getSelectedIndex() != -1) {
//			String groupName = (String) groupsList.getSelectedItem();
//			int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete group " + groupName + "?",
//					"Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//			if (choice == 0) {
//				error = TournamentController.deleteGroup(groupName);
//				refreshData(null);
//			}
//		}
//	}
//
//	private void showGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		error = null;
//		refreshData((String) groupsList.getSelectedItem());
//	}
//
//	private void updateGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		error = TournamentController.updateGroup(groupNameText.getText(), newGroupNameTextField.getText());
//		refreshData(newGroupNameTextField.getText());
//	}
//
//	private void addTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {
//		error = TournamentController.addTeam(groupNameText.getText(), newTeamNameTextField.getText());
//		refreshData(groupNameText.getText());
//	}
//
//	private void teamsTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
//		if (teamsTable.getSelectedRow() != -1) {
//			String teamName = (String) teamsTable.getModel().getValueAt(teamsTable.getSelectedRow(), 0);
//			int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete team " + teamName + "?",
//					"Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//			if (choice == 0) {
//				error = TournamentController.removeTeam(teamName);
//				refreshData(groupNameText.getText());
//			}
//		}
//	}
//
//	/**
//	 * The following methods are helper methods to simplify the methods.
//	 */
//
//	private void initializeButton(JButton button, String text, ActionListener actionListener) {
//		button.setText(text);
//		button.addActionListener(actionListener);
//	}
//
//	private void populateTeamsTable(TOGroup foundGroup) {
//		teamsDtm = new DefaultTableModel(0, 0);
//		teamsDtm.setColumnIdentifiers(teamsColumnNames);
//		teamsTable.setModel(teamsDtm);
//		if (foundGroup != null) {
//			for (String teamName : foundGroup.getTeamNames()) {
//				Object[] obj = { teamName };
//				teamsDtm.addRow(obj);
//			}
//		}
//	}

}
