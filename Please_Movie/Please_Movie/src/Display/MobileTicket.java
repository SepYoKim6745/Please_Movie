package Display;
import javax.swing.*;

import Display.Choose.HomeAction;
import Display.Choose.MobileTicketAction;
import Display.Choose.SettingAction;
import Display.MovieList.MyActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MobileTicket extends JFrame{
	public MobileTicket() {
		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);
		
		JButton[] NVButtons = new JButton[3];
		ImageIcon[] bar = new ImageIcon[3];
		
		setVisible(true);
		setTitle("영화를 부탁해");
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
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
		
		JPanel p1,p2;
		p1 = new JPanel();
		p2 = new JPanel();
		contentPane.add(p1,"Center");
		contentPane.add(p2,"South");
		p1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		p1.setBackground(Color.white);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
		p2.setBackground(brightGray);
		
		p2.setBackground(brightGray);
		
		for(int i = 0; i<bar.length; i++) {
			NVButtons[i] = new JButton(bar[i]);
			NVButtons[i].setPreferredSize(new Dimension(60,40));
			NVButtons[i].setBackground(brightGray);
			p2.add(NVButtons[i]);
		}
		NVButtons[0].addActionListener(new HomeAction()); // �솃�솕硫� �븸�뀡 由ъ뒪�꼫
		NVButtons[1].addActionListener(new MobileTicketAction()); // 紐⑤컮�씪�떚耳� �븸�뀡 由ъ뒪�꼫
		NVButtons[2].addActionListener(new SettingAction()); // setting �븸�뀡 由ъ뒪�꼫
		
		
		
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
