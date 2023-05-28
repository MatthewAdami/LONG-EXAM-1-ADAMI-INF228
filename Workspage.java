package Myportfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Workspage extends HomePage{

	JFrame Worksframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Workspage window = new Workspage();
					window.Worksframe.setVisible(true);
					window.Worksframe.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Workspage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Worksframe = new JFrame();
		Worksframe.setResizable(false);
		Worksframe.getContentPane().setBackground(new Color(65, 105, 225));
		Worksframe.setBounds(100, 100, 841, 682);
		Worksframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Worksframe.getContentPane().setLayout(null);
		
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
		        // Dispose (close) the current Worksframe
		        Worksframe.dispose();
		    }
		});

		backlbl.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\previous (1).png"));
		backlbl.setBounds(10, 11, 31, 23);
		Worksframe.getContentPane().add(backlbl);
		
		JLabel nextlbl = new JLabel("");
		nextlbl.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        // Create a new instance of the WorkPage2 class
		        WorkPage2 window = new WorkPage2();
		        // Set the WorksSecondPageframe to be visible
		        window.WorksSecondPageframe.setVisible(true);		        
		        // Set the WorksSecondPageframe's location to the center of the screen
		        window.WorksSecondPageframe.setLocationRelativeTo(null);	        
		        // Dispose (close) the current Worksframe
		        Worksframe.dispose();
		    }
		});

		nextlbl.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\next (1).png"));
		nextlbl.setBounds(741, 599, 31, 23);
		Worksframe.getContentPane().add(nextlbl);
		
		JPanel panelfb = new JPanel();
		panelfb.setBackground(new Color(250, 128, 114));
		panelfb.setForeground(new Color(165, 42, 42));
		panelfb.setBounds(469, 33, 314, 257);
		Worksframe.getContentPane().add(panelfb);
		panelfb.setLayout(null);
		
		JLabel workslbl1 = new JLabel("");
		workslbl1.setBounds(10, 11, 286, 230);
		panelfb.add(workslbl1);
		workslbl1.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\fblog (2) (1).png"));
		
		JPanel paneldisney = new JPanel();
		paneldisney.setLayout(null);
		paneldisney.setForeground(new Color(165, 42, 42));
		paneldisney.setBackground(new Color(255, 215, 0));
		paneldisney.setBounds(48, 33, 314, 257);
		Worksframe.getContentPane().add(paneldisney);
		
		JLabel workslbl2 = new JLabel("");
		workslbl2.setBounds(10, 11, 286, 230);
		paneldisney.add(workslbl2);
		workslbl2.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\disney (2) (1) (1).png"));
		
		JPanel panelnu = new JPanel();
		panelnu.setLayout(null);
		panelnu.setForeground(new Color(165, 42, 42));
		panelnu.setBackground(new Color(250, 128, 114));
		panelnu.setBounds(257, 344, 314, 257);
		Worksframe.getContentPane().add(panelnu);
		
		JLabel workslbl3 = new JLabel("");
		workslbl3.setBounds(10, 11, 286, 230);
		panelnu.add(workslbl3);
		workslbl3.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\enrollm (2) (1).png"));
		
		JLabel Disneygui = new JLabel("DISNEY PLUS GUI");
		Disneygui.setForeground(new Color(255, 255, 255));
		Disneygui.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Disneygui.setBounds(70, 301, 256, 34);
		Worksframe.getContentPane().add(Disneygui);
		
		JLabel FBguilbl = new JLabel("FACEBOOK GUI");
		FBguilbl.setForeground(Color.WHITE);
		FBguilbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		FBguilbl.setBounds(500, 301, 256, 34);
		Worksframe.getContentPane().add(FBguilbl);
		
		JLabel NUenrollmentgui = new JLabel("NU ENROLLMENT GUI");
		NUenrollmentgui.setForeground(Color.WHITE);
		NUenrollmentgui.setFont(new Font("Times New Roman", Font.BOLD, 25));
		NUenrollmentgui.setBounds(267, 609, 304, 34);
		Worksframe.getContentPane().add(NUenrollmentgui);
	}
}