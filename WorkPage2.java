package Myportfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class WorkPage2 extends Workspage{

	JFrame WorksSecondPageframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkPage2 window = new WorkPage2();
					window.WorksSecondPageframe.setVisible(true);
					window.WorksSecondPageframe.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WorkPage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		WorksSecondPageframe = new JFrame();
		WorksSecondPageframe.setResizable(false);
		WorksSecondPageframe.getContentPane().setBackground(new Color(65, 105, 225));
		WorksSecondPageframe.getContentPane().setLayout(null);
		
		JPanel apppanel = new JPanel();
		apppanel.setBackground(new Color(128, 0, 0));
		apppanel.setBounds(47, 43, 716, 236);
		WorksSecondPageframe.getContentPane().add(apppanel);
		apppanel.setLayout(null);
		
		JLabel applabel = new JLabel("");
		applabel.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\APP (2).png"));
		applabel.setBounds(22, 11, 684, 214);
		apppanel.add(applabel);
		
		JPanel htmlpanel = new JPanel();
		htmlpanel.setBackground(new Color(60, 179, 113));
		htmlpanel.setBounds(256, 335, 292, 244);
		WorksSecondPageframe.getContentPane().add(htmlpanel);
		htmlpanel.setLayout(null);
		
		JLabel html = new JLabel("");
		html.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\htmlpng (3).png"));
		html.setBounds(10, 11, 272, 222);
		htmlpanel.add(html);
		
		JLabel backbttn = new JLabel("");
		backbttn.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        // Create a new instance of the Workspage class
		        Workspage window = new Workspage();		   
		        // Set the Worksframe of the new Workspage window to be visible
		        window.Worksframe.setVisible(true);		        
		        // Set the location of the Worksframe to the center of the screen
		        window.Worksframe.setLocationRelativeTo(null);		        
		        // Dispose (close) the current WorksSecondPageframe
		        WorksSecondPageframe.dispose();
		    }
		});

		backbttn.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\previous (1).png"));
		backbttn.setBounds(10, 11, 31, 23);
		WorksSecondPageframe.getContentPane().add(backbttn);
		
		JLabel Applicationlbl = new JLabel("CREATING APPLICATION IMMERSION");
		Applicationlbl.setForeground(Color.WHITE);
		Applicationlbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Applicationlbl.setBounds(166, 290, 489, 34);
		WorksSecondPageframe.getContentPane().add(Applicationlbl);
		
		JLabel htmllbl = new JLabel("CREATING HTML MOVIE DESCRIPTION");
		htmllbl.setForeground(Color.WHITE);
		htmllbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		htmllbl.setBounds(179, 590, 506, 34);
		WorksSecondPageframe.getContentPane().add(htmllbl);
		WorksSecondPageframe.setBounds(100, 100, 841, 682);
		WorksSecondPageframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
