package Display;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import Display.Choose.HomeAction;
import Display.Choose.MobileTicketAction;
import Display.Choose.SettingAction;

public class MovieList extends JFrame{
	JButton[] MVButtons = new JButton[8];
	ImageIcon[] poster = new ImageIcon[8];
	JButton[] NVButtons = new JButton[3];
	ImageIcon[] bar = new ImageIcon[3];
	JPanel p1,p2;
	public MovieList() {
		
		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);
		
		setTitle("영화를 부탁해");
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<poster.length;i++) {
			poster[i] = new ImageIcon("Please_Movie/Please_Movie/src/image/poster"+(i+1)+".jpg");
			Image posterImage = poster[i].getImage();
			Image changeImg = posterImage.getScaledInstance(150,200,Image.SCALE_SMOOTH);
			poster[i] = new ImageIcon(changeImg);
		}
		
		for(int i = 0; i<bar.length;i++) {
			bar[i] = new ImageIcon("Please_Movie/Please_Movie/src/image/Bar"+(i+1)+".jpg");
			Image barimage = bar[i].getImage();
			Image changeImg = barimage.getScaledInstance(60,40,Image.SCALE_SMOOTH);
			bar[i] = new ImageIcon(changeImg);
		}
		
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JMenuBar mb = new JMenuBar();
		mb.setBackground(crimson);
		ImageIcon backButtonImage = new ImageIcon();
		backButtonImage = new ImageIcon("");
		
		JButton backButton = new JButton("<<---");
		backButton.setBackground(crimson);
		mb.add(backButton);
		add(mb,"North");
		
		p1 = new JPanel();
		p2 = new JPanel();
		contentPane.add(p1,"Center");
		contentPane.add(p2,"South");
		p1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		p1.setBackground(Color.white);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
		p2.setBackground(brightGray);
		
		for(int i = 0; i<bar.length; i++) {
			NVButtons[i] = new JButton(bar[i]);
			NVButtons[i].setPreferredSize(new Dimension(60,40));
			NVButtons[i].setBackground(brightGray);
			p2.add(NVButtons[i]);
		}
		
		for(int i = 0; i<MVButtons.length; i++) {
			MVButtons[i] = new JButton(poster[i]);
			MVButtons[i].setName("Please_Movie/Please_Movie/src/image/poster"+(i+1)+".jpg");
			MVButtons[i].setPreferredSize(new Dimension(150,200));
			p1.add(MVButtons[i]);
			MVButtons[i].addActionListener(new MyActionListener());
		}

		
		NVButtons[0].addActionListener(new HomeAction()); // �솃�솕硫� �븸�뀡 由ъ뒪�꼫
		NVButtons[1].addActionListener(new MobileTicketAction()); // 紐⑤컮�씪�떚耳� �븸�뀡 由ъ뒪�꼫
		NVButtons[2].addActionListener(new SettingAction()); // setting �븸�뀡 由ъ뒪�꼫
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
		contentPane.paint(contentPane.getGraphics());
	}
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btnVal = (JButton) e.getSource();
			String path = System.getProperty("user.dir");
		      System.out.println("Working Directory = " + path);
			new Choose(btnVal.getName());
			setVisible(false);
		}	
	}
	class BackMenuAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new MovieList();
			setVisible(false);
		}
		
	}
	
	class HomeAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new MovieList();
			setVisible(false);
		}
		
	}
	
	class MobileTicketAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new MobileTicket();
			setVisible(false);
		}
		
	}
	
	class SettingAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new Setting();
			setVisible(false);
		}
		
	}
}