package Myportfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Achievements extends HomePage {

	JFrame achievementsframe;
	JLabel Jlabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Achievements window = new Achievements();
					window.achievementsframe.setVisible(true);
					window.achievementsframe.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Achievements() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		achievementsframe = new JFrame();
		achievementsframe.getContentPane().setBackground(new Color(65, 105, 225));
		achievementsframe.setBounds(100, 100, 841, 682);
		achievementsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		achievementsframe.getContentPane().setLayout(null);

		JLabel achivementlbl = new JLabel("Achievements");
		achivementlbl.setForeground(new Color(255, 255, 255));
		achivementlbl.setFont(new Font("Lucida Calligraphy", Font.BOLD, 35));
		achivementlbl.setBounds(282, 11, 293, 54);
		achievementsframe.getContentPane().add(achivementlbl);

		JLabel backlbl = new JLabel("");
		backlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Create a new instance of the HomePage class
				HomePage window = new HomePage();
				// Set the window to be visible
				window.setVisible(true);
				// Set the window's location to the center of the screen
				window.setLocationRelativeTo(null);
				// Dispose (close) the current achievementsframe
				achievementsframe.dispose();
			}
		});

		backlbl.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\previous (1).png"));
		backlbl.setBounds(10, 11, 31, 23);
		achievementsframe.getContentPane().add(backlbl);

		JLabel grade10label = new JLabel("- Grade 10 With Honors");
		grade10label.setForeground(new Color(255, 255, 255));
		grade10label.setFont(new Font("Times New Roman", Font.BOLD, 38));
		grade10label.setBounds(53, 120, 444, 79);
		achievementsframe.getContentPane().add(grade10label);

		JLabel application = new JLabel("- Student Choice Application Award");
		application.setForeground(new Color(255, 255, 255));
		application.setBackground(new Color(255, 255, 255));
		application.setFont(new Font("Times New Roman", Font.BOLD, 38));
		application.setBounds(53, 210, 725, 79);
		achievementsframe.getContentPane().add(application);

		JLabel deanslister = new JLabel("- 1st  Honor Deans  Lister 1st Term");
		deanslister.setForeground(new Color(255, 255, 255));
		deanslister.setFont(new Font("Times New Roman", Font.BOLD, 38));
		deanslister.setBounds(53, 306, 643, 79);
		achievementsframe.getContentPane().add(deanslister);
	}
}
