import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import mission.Story;
import javax.swing.JPanel;

public class GuiFrame1 {

	private JFrame frame;
	private JTextField txtFldChapter;
	private JTextField txtFldStage;
	private JTextField txtFrequency;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiFrame1 window = new GuiFrame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiFrame1() throws InterruptedException, FindFailed {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws InterruptedException, FindFailed {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRunMissions = new JLabel("Run Missions.");
		lblRunMissions.setBounds(10, 11, 81, 14);
		frame.getContentPane().add(lblRunMissions);
		
		txtFldChapter = new JTextField();
		txtFldChapter.setToolTipText("Enter the Chapter Number");
		txtFldChapter.setBounds(153, 8, 31, 20);
		frame.getContentPane().add(txtFldChapter);
		txtFldChapter.setColumns(10);
		
		JLabel lblChapter = new JLabel("Chapter #");
		lblChapter.setBounds(86, 11, 57, 14);
		frame.getContentPane().add(lblChapter);
		
		JLabel lblStage = new JLabel("Stage #");
		lblStage.setBounds(194, 11, 46, 14);
		frame.getContentPane().add(lblStage);
		
		txtFldStage = new JTextField();
		txtFldStage.setBounds(239, 8, 31, 20);
		frame.getContentPane().add(txtFldStage);
		txtFldStage.setColumns(10);
		
		JButton btnStartMissions = new JButton("Start Missions");
		btnStartMissions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Starting Missions");
				
				int chapter = Integer.parseInt(txtFldChapter.getText()); 
				int stage = Integer.parseInt(txtFldStage.getText());
				int frequency = Integer.parseInt(txtFrequency.getText());
			
				System.out.println("Chapter #: " + chapter);
				System.out.println("Stage #: " + stage);
				System.out.println("Frequency: " + frequency);

				new Thread(() -> {
					try {
						Story.runStoryMissions(chapter, stage, frequency, 0);
					} catch (FindFailed | InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}).start();



			}
		});
		btnStartMissions.setBounds(320, 39, 89, 23);
		frame.getContentPane().add(btnStartMissions);
		
		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setBounds(280, 11, 57, 14);
		frame.getContentPane().add(lblFrequency);
		
		txtFrequency = new JTextField();
		txtFrequency.setColumns(10);
		txtFrequency.setBounds(347, 8, 31, 20);
		frame.getContentPane().add(txtFrequency);
	}
}
