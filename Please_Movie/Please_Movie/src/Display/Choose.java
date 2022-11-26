package Display;
import Please_Movie.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Display.MovieList.MyActionListener;

public class Choose extends JFrame{
	public Choose(String name) {
		
		JButton[] NVButtons = new JButton[3];
		ImageIcon[] bar = new ImageIcon[3];
		JPanel p1,p2;
		
		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);
		
		setVisible(true);
		setTitle("영화를 부탁해");
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<bar.length;i++) {
			bar[i] = new ImageIcon("Please_Movie/src/image/Bar"+(i+1)+".jpg");
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
		backButton.addActionListener(new BackMenuAction());
		backButton.setBackground(crimson);
		mb.add(backButton);
		add(mb,"North");
		
		p1 = new JPanel();
		p2 = new JPanel();
		add(p1,"Center");
		add(p2,"South");
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
		NVButtons[0].addActionListener(new HomeAction()); // 홈화면 액션 리스너
		NVButtons[1].addActionListener(new MobileTicketAction()); // 모바일티켓 액션 리스너
		NVButtons[2].addActionListener(new SettingAction()); // setting 액션 리스너
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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