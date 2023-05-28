package Myportfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
	import java.awt.Desktop;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class HomePage extends JFrame {
   
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomePage window = new HomePage();
                    window.setVisible(true);
                    window.setLocationRelativeTo(null);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public HomePage() {
        initialize();
    }
    
    // Rest of the code...

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 841, 682); // Set the position and size of the JFrame window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify the default close operation
		getContentPane().setLayout(null); // Set the layout of the content pane to null
		
		JPanel Aboutme = new JPanel();
		Aboutme.setBackground(new Color(0, 0, 0));
		Aboutme.setBounds(-2, 0, 246, 643);
		getContentPane().add(Aboutme);
		Aboutme.setLayout(null);
		//Input formal picture
		JLabel profilelbl = new JLabel("");
		profilelbl.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\Profileprot-modified (1).png"));
		profilelbl.setBounds(25, 11, 179, 171);
		Aboutme.add(profilelbl);
		//Add education information
		JLabel educlbl = new JLabel("Education");
		educlbl.setForeground(new Color(240, 255, 240));
		educlbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		educlbl.setBounds(25, 193, 91, 14);
		Aboutme.add(educlbl);
		
		JSeparator seperatoreduc = new JSeparator();
		seperatoreduc.setBounds(10, 215, 232, 2);
		Aboutme.add(seperatoreduc);
		
		JLabel elemlbl = new JLabel("Elementary");
		elemlbl.setForeground(new Color(65, 105, 225));
		elemlbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		elemlbl.setBounds(25, 218, 91, 22);
		Aboutme.add(elemlbl);
		
		JLabel elemschool = new JLabel("General Roxas Elementary School");
		elemschool.setForeground(new Color(240, 255, 240));
		elemschool.setFont(new Font("Times New Roman", Font.BOLD, 14));
		elemschool.setBounds(25, 240, 217, 14);
		Aboutme.add(elemschool);
		
		JLabel elemyear = new JLabel("2011-2016");
		elemyear.setFont(new Font("Times New Roman", Font.BOLD, 15));
		elemyear.setForeground(new Color(240, 255, 240));
		elemyear.setBounds(25, 254, 79, 14);
		Aboutme.add(elemyear);
		
		JLabel Highschoollbl = new JLabel("Junior Highschool");
		Highschoollbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Highschoollbl.setForeground(new Color(65, 105, 225));
		Highschoollbl.setBounds(25, 279, 131, 22);
		Aboutme.add(Highschoollbl);
		
		JLabel schooljuniorlbl = new JLabel("Manuel A. Roxas Highschool");
		schooljuniorlbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		schooljuniorlbl.setForeground(new Color(240, 255, 240));
		schooljuniorlbl.setBounds(25, 299, 217, 22);
		Aboutme.add(schooljuniorlbl);
		
		JLabel JHSyearlbl = new JLabel("2016-2020");
		JHSyearlbl.setForeground(new Color(240, 255, 240));
		JHSyearlbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		JHSyearlbl.setBounds(25, 318, 79, 14);
		Aboutme.add(JHSyearlbl);
		
		JLabel SHSlbl = new JLabel("Senior Highschool");
		SHSlbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		SHSlbl.setForeground(new Color(65, 105, 225));
		SHSlbl.setBounds(25, 357, 131, 14);
		Aboutme.add(SHSlbl);
		
		JLabel NSNUlbl = new JLabel("NU Nazareth School");
		NSNUlbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		NSNUlbl.setForeground(new Color(240, 255, 240));
		NSNUlbl.setBounds(25, 375, 142, 14);
		Aboutme.add(NSNUlbl);
		
		JLabel SHSyearlbl = new JLabel("2020-2022");
		SHSyearlbl.setForeground(new Color(240, 255, 240));
		SHSyearlbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		SHSyearlbl.setBounds(25, 386, 79, 22);
		Aboutme.add(SHSyearlbl);
		//Display Contacts
		JLabel Contactslbl = new JLabel("Contacts");
		Contactslbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Contactslbl.setForeground(new Color(240, 255, 240));
		Contactslbl.setBounds(25, 419, 114, 29);
		Aboutme.add(Contactslbl);
		
		JSeparator seperatoreduc_1 = new JSeparator();
		seperatoreduc_1.setBounds(10, 450, 232, 2);
		Aboutme.add(seperatoreduc_1);
		
		JLabel phonenumber = new JLabel("Phone Number");
		phonenumber.setForeground(new Color(65, 105, 225));
		phonenumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		phonenumber.setBounds(25, 459, 131, 14);
		Aboutme.add(phonenumber);
		
		JLabel number = new JLabel("09983027269");
		number.setForeground(new Color(240, 255, 240));
		number.setFont(new Font("Times New Roman", Font.BOLD, 15));
		number.setBounds(25, 480, 131, 22);
		Aboutme.add(number);
		
		JLabel PersonalEmailbl = new JLabel("Personal Email");
		PersonalEmailbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		PersonalEmailbl.setForeground(new Color(65, 105, 225));
		PersonalEmailbl.setBounds(25, 513, 114, 22);
		Aboutme.add(PersonalEmailbl);
		
		JLabel emaillbl = new JLabel("adamimatthew57@gmail.com");
		emaillbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		emaillbl.setForeground(new Color(240, 255, 240));
		emaillbl.setBounds(25, 530, 217, 22);
		Aboutme.add(emaillbl);
		
		JLabel fblbl = new JLabel("");
		fblbl.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        try {
		            Desktop.getDesktop().browse(new URL("https://www.facebook.com/mattadami30").toURI());
		        }
		        catch(Exception E1) {
		            // Handle any exception that occurs when opening the URL
		        }
		    }
		});

		fblbl.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\fb2 (1) (1) (1).png"));
		fblbl.setBounds(23, 573, 46, 41);
		Aboutme.add(fblbl);
		
		JLabel instagramlbl = new JLabel("New label");
		instagramlbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/adamimatt/").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		instagramlbl.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\Instagram-Icon (1) (1).png"));
		instagramlbl.setBounds(93, 573, 46, 41);
		Aboutme.add(instagramlbl);
		
		JLabel githubblbl = new JLabel("");
		githubblbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/MatthewAdami").toURI());
				}
				catch(Exception E1) {
					
				}
			}
		});
		githubblbl.setIcon(new ImageIcon("C:\\Users\\mateo\\Downloads\\GitHub-Mark-modified (1) (1).png"));
		githubblbl.setBounds(171, 573, 46, 41);
		Aboutme.add(githubblbl);
		
		JPanel title = new JPanel();
		title.setBackground(new Color(65, 105, 225));
		title.setBounds(244, 0, 582, 217);
		getContentPane().add(title);
		title.setLayout(null);
		
		JLabel Workslbl = new JLabel("Works"); // Create a new JLabel with the text "Works"
		Workslbl.addMouseListener(new MouseAdapter() { // Add a mouse listener to the label
		    @Override
		    public void mouseClicked(MouseEvent e) { // Implement the mouseClicked method
		        Workspage window = new Workspage(); // Create a new instance of the Workspage class
		        window.Worksframe.setVisible(true); // Set the Worksframe (presumably a JFrame) to be visible
		        window.Worksframe.setLocationRelativeTo(null);
		        dispose(); // Dispose of the current frame (presumably the one containing this code)
		    }
		});

		Workslbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Workslbl.setForeground(new Color(240, 255, 240));
		Workslbl.setBounds(305, 11, 65, 21);
		title.add(Workslbl);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(218, 30, 46, 2);
		title.add(separator);
		
		JLabel Homelbl = new JLabel("Home");
		Homelbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Homelbl.setForeground(new Color(240, 255, 240));
		Homelbl.setBounds(218, 14, 65, 14);
		title.add(Homelbl);
		
		JLabel Namelbl = new JLabel("MATTHEW VALENCIA ADAMI");
		Namelbl.setFont(new Font("Times New Roman", Font.BOLD, 22));
		Namelbl.setForeground(new Color(240, 255, 240));
		Namelbl.setBounds(23, 86, 414, 57);
		title.add(Namelbl);
		
		JLabel firststyrstudentlbl = new JLabel("1ST YEAR COLLEGE STUDENT");
		firststyrstudentlbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		firststyrstudentlbl.setForeground(new Color(240, 255, 240));
		firststyrstudentlbl.setBounds(21, 127, 338, 46);
		title.add(firststyrstudentlbl);
		
		JLabel hellolbl = new JLabel("Hello! I'm");
		hellolbl.setFont(new Font("Times New Roman", Font.BOLD, 22));
		hellolbl.setForeground(new Color(240, 255, 240));
		hellolbl.setBounds(23, 46, 177, 46);
		title.add(hellolbl);
		
		JLabel Compscititle = new JLabel("COMPUTER SCIENCE - MACHINE LEARNING");
		Compscititle.setForeground(new Color(240, 255, 240));
		Compscititle.setBackground(new Color(240, 255, 240));
		Compscititle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Compscititle.setBounds(23, 173, 447, 33);
		title.add(Compscititle);
		
		
		JLabel achievemmmentlbl = new JLabel("Achivements");
		achievemmmentlbl.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        // Create an instance of the Achievements class
		        Achievements window = new Achievements();
		        
		        // Make the achievements frame visible
		        window.achievementsframe.setVisible(true);
		        window.setLocationRelativeTo(null);
		        // Close the current window
		        dispose();
		    }
		});

		achievemmmentlbl.setForeground(new Color(255, 255, 255));
		achievemmmentlbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		achievemmmentlbl.setBounds(380, 11, 109, 21);
		title.add(achievemmmentlbl);
		
		JLabel aboutmetitle = new JLabel("About Me");
		aboutmetitle.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		aboutmetitle.setBounds(254, 215, 174, 46);
		getContentPane().add(aboutmetitle);
		
		JLabel hobbieslbl = new JLabel("Hobbies");
		hobbieslbl.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		hobbieslbl.setBounds(254, 396, 174, 46);
		getContentPane().add(hobbieslbl);
		
		JLabel playingGameslbl = new JLabel("- Playing Games");
		playingGameslbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		playingGameslbl.setBounds(254, 436, 156, 33);
		getContentPane().add(playingGameslbl);
		
		JLabel listeninglbl = new JLabel("- Listening to Music");
		listeninglbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		listeninglbl.setBounds(254, 468, 174, 33);
		getContentPane().add(listeninglbl);
		
		JLabel watchinglbl = new JLabel("- Watching Movies or Documentaries");
		watchinglbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		watchinglbl.setBounds(254, 496, 340, 33);
		getContentPane().add(watchinglbl);
		
		JLabel firstsentence = new JLabel("I'm Matthew V. Adami, a 19-year-old first-year Computer ");
		firstsentence.setFont(new Font("Times New Roman", Font.BOLD, 20));
		firstsentence.setBounds(264, 261, 534, 24);
		getContentPane().add(firstsentence);
		
		JLabel secondsentence = new JLabel("Science student at National University. I have a strong ");
		secondsentence.setFont(new Font("Times New Roman", Font.BOLD, 20));
		secondsentence.setBounds(262, 286, 473, 24);
		getContentPane().add(secondsentence);
		
		JLabel thirdsentence = new JLabel("passion for computer and technology. I'm always eager");
		thirdsentence.setFont(new Font("Times New Roman", Font.BOLD, 20));
		thirdsentence.setBounds(264, 311, 486, 24);
		getContentPane().add(thirdsentence);
		
		JLabel fourthsentence = new JLabel("to learn more about the field. I have a particular interest");
		fourthsentence.setFont(new Font("Times New Roman", Font.BOLD, 20));
		fourthsentence.setBounds(264, 334, 486, 24);
		getContentPane().add(fourthsentence);
		
		JLabel Fifthsentence = new JLabel("in game development.");
		Fifthsentence.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Fifthsentence.setBounds(262, 361, 473, 24);
		getContentPane().add(Fifthsentence);
		
		JLabel skillslbl = new JLabel("Skills");
		skillslbl.setBounds(254, 540, 116, 33);
		getContentPane().add(skillslbl);
		skillslbl.setForeground(new Color(0, 0, 0));
		skillslbl.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));
		
		JLabel skill_onelabel = new JLabel("- Java");
		skill_onelabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		skill_onelabel.setBounds(254, 568, 76, 24);
		getContentPane().add(skill_onelabel);
		
		JLabel skill_twolabel = new JLabel("- Video Editing");
		skill_twolabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		skill_twolabel.setBounds(254, 601, 156, 31);
		getContentPane().add(skill_twolabel);
	}
	
}
	 
