package Display;
import javax.swing.*;

import Display.*;

import java.awt.*;
import java.awt.event.*;

public class MobileTicket extends JFrame{
	public MobileTicket() {
		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);
		Color white1 = new Color(0xF2F2F2);
		Color gray1 = new Color(0x828282);
		
		JButton[] NVButtons = new JButton[3];
		ImageIcon[] bar = new ImageIcon[3];
		
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
		
		JLabel la = new JLabel(" ");
		la.setFont(new Font("닉스곤체 B 2.0",Font.PLAIN, 25));
		mb.add(la);
		
		contentPane.add(mb,"North");
		
		JPanel p1,p2;
		p1 = new JPanel();
		p2 = new JPanel();
		contentPane.add(p1,"Center");
		contentPane.add(p2,"South");
		p1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		p1.setLayout(new FlowLayout());
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
		
		JPanel ticket = new JPanel();
		ticket.setBackground(white1);
		ticket.setLayout(null);
		ticket.setPreferredSize(new Dimension(500,700));
		p1.add(ticket);
		
		ImageIcon poster = new ImageIcon("Please_Movie/src/image/poster1.jpg");
		JLabel posterLabel = new JLabel(poster);
		posterLabel.setBounds(50,50,150,200);
		ticket.add(posterLabel);
		
		JLabel movieName = new JLabel("데시벨");
		movieName.setBounds(230,50,200,50);
		movieName.setFont(new Font("닉스곤체 B 2.0", Font.BOLD,30));
		ticket.add(movieName);
		
		JLabel str1 = new JLabel("상영정보");
		str1.setBounds(50,280,150,50);
		str1.setFont(new Font("닉스곤체 M 2.0", Font.BOLD,30));
		ticket.add(str1);
		
		JLabel str2 = new JLabel("예매번호 : 123456789");
		str2.setBounds(200,285,300,50);
		str2.setFont(new Font("닉스곤체 M 2.0", Font.PLAIN,20));
		str2.setForeground(gray1);
		ticket.add(str2);
		
		JLabel str3 = new JLabel("CGV - 천안 신부점");
		str3.setBounds(50,330,200,50);
		str3.setFont(new Font("닉스곤체 M 2.0", Font.PLAIN,20));
		str3.setForeground(gray1);
		ticket.add(str3);
		
		JLabel str4 = new JLabel("상영관 : 8관 ");
		str4.setBounds(50,360,200,50);
		str4.setFont(new Font("닉스곤체 M 2.0", Font.PLAIN,20));
		str4.setForeground(gray1);
		ticket.add(str4);
		
		JLabel str5 = new JLabel("좌석 : A-1");
		str5.setBounds(50,390,200,50);
		str5.setFont(new Font("닉스곤체 M 2.0", Font.PLAIN,20));
		str5.setForeground(gray1);
		ticket.add(str5);
		
		JLabel str6 = new JLabel("상영 날짜/시간 : 2022-11-14 / 22:20");
		str6.setBounds(50,420,500,50);
		str6.setFont(new Font("닉스곤체 M 2.0", Font.PLAIN,20));
		str6.setForeground(gray1);
		ticket.add(str6);
		
		ImageIcon QR = new ImageIcon("Please_Movie/src/image/QR.jpg");
		Image QRImage = QR.getImage();
		Image changeImg = QRImage.getScaledInstance(150,150,Image.SCALE_SMOOTH);
		ImageIcon QR1 = new ImageIcon(changeImg);
		JLabel QRLabel = new JLabel(QR1);
		QRLabel.setBounds(100,390,300,300);
		ticket.add(QRLabel);
		
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