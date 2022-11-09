import java.awt.EventQueue;
import java.awt.Image;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class EmployeeInfo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JComboBox<String> comboBoxName;
	private JList<String> listName;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxSelect;
	private JLabel lblClock;

