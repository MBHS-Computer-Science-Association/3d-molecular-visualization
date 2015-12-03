package simulation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridLayout;

import javax.swing.BoxLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JLabel;



public class LauncherJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LauncherJFrame frame = new LauncherJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LauncherJFrame() {
		
		boolean program = true;
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");	
			} catch (Exception e) {
			e.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
				JButton btnStart = new JButton("Start");
				btnStart.setBounds(10, 521, 151, 29);
				btnStart.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
					btnStart.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								MolecularSimulation.startSimulation();
								btnStart.setEnabled(false);
						}
					});
					contentPane.setLayout(null);
					contentPane.add(btnStart);
					
					textField = new JTextField();
					textField.setBounds(20, 50, 50, 20);
					contentPane.add(textField);
					textField.setColumns(10);
					
					JLabel lblSampleUserEntry = new JLabel("Element Symbol");
					lblSampleUserEntry.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lblSampleUserEntry.setBounds(20, 25, 143, 20);
					contentPane.add(lblSampleUserEntry);
	}
}
