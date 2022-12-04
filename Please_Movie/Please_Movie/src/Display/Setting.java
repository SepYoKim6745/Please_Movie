package Display;

import Please_Movie.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class Setting extends JFrame {
	public Setting() {
		JButton[] NVButtons = new JButton[3];
		ImageIcon[] bar = new ImageIcon[3];
		JPanel p1, p2;

		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);

		setVisible(true);
		setTitle("영화를 부탁해");
		setSize(600, 900);

		for(int i = 0; i<bar.length;i++) {
			bar[i] = new ImageIcon("Please_Movie/src/image/Bar"+(i+1)+".jpg");
			Image barimage = bar[i].getImage();
			Image changeImg = barimage.getScaledInstance(60,40,Image.SCALE_SMOOTH);
			bar[i] = new ImageIcon(changeImg);
		}

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//mb : top menu
		JMenuBar mb = new JMenuBar(); //top
		mb.setBackground(crimson);

		JLabel la = new JLabel(" ");
		la.setFont(new Font("닉스곤체 B 2.0",Font.PLAIN, 25));
		mb.add(la);
		add(mb,"North");
		//mb end

		p1 = new JPanel();
		p2 = new JPanel();
		add(p1, "Center");
		add(p2, "South");

		//p1 : main
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		p1.setBackground(Color.white);
		ImageIcon um = new ImageIcon("Please_Movie/src/image/userlocation.jpg");

		Box appInfo = new Box(BoxLayout.Y_AXIS);
		JLabel appVersion = new JLabel("APP Info");
		JLabel appDay = new JLabel("since 2022.11.13");
		JLabel mapImage = new JLabel(um);
		JCheckBox usingGPS = new JCheckBox("위치사용",false);
		JLabel Address1 = new JLabel("천안시 동남구 병천면");
		JLabel Address2 = new JLabel("가전리 충절로 1600");
		Address1.setFont(MainFrame.nomone);
		Address2.setFont(MainFrame.nomone);
		JButton changeLoca = new JButton("위치변경");

		mapImage.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 30));

		Address2.setBorder(BorderFactory.createEmptyBorder(0, 20, 30, 0));
		usingGPS.setFont(new Font("닉스곤체 B 2.0", Font.PLAIN,30));

		usingGPS.setBackground(Color.GREEN);
		Address1.setAlignmentX(CENTER_ALIGNMENT);
		Address2.setAlignmentX(CENTER_ALIGNMENT);
		usingGPS.setAlignmentX(CENTER_ALIGNMENT);
		changeLoca.setBackground(Color.CYAN);
		changeLoca.setAlignmentX(CENTER_ALIGNMENT);
		changeLoca.setFont(MainFrame.nomone);
		
		Box LocaInfo = new Box(BoxLayout.X_AXIS);
		Box LocaTexts = new Box(BoxLayout.Y_AXIS);
		
		LocaTexts.add(Address1);
		LocaTexts.add(Address2);
		LocaTexts.add(usingGPS);
		LocaInfo.add(mapImage);
		LocaInfo.add(LocaTexts);

		appVersion.setFont(MainFrame.boldone);
		appDay.setFont(new Font("맑은고딕", Font.ITALIC,20));

		appInfo.setAlignmentX(CENTER_ALIGNMENT);
		appInfo.add(appVersion);
		appInfo.add(appDay);
		// mapImage.setAlignmentX(CENTER_ALIGNMENT);
		
		// p1.add(appVersion);
		p1.add(appInfo);
		p1.add(LocaInfo);
		p1.add(changeLoca);
		//p1 end
		
		//p2 : nav
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));
		p2.setBackground(brightGray);

		for (int i = 0; i < bar.length; i++) {
			NVButtons[i] = new JButton(bar[i]);
			NVButtons[i].setPreferredSize(new Dimension(60, 40));
			NVButtons[i].setBackground(brightGray);
			p2.add(NVButtons[i]);
		}
		NVButtons[0].addActionListener(new HomeAction()); // 홈화면 액션 리스너
		NVButtons[1].addActionListener(new MobileTicketAction()); // 모바일티켓 액션 리스너
		NVButtons[2].addActionListener(new SettingAction()); // setting 액션 리스너
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class BackMenuAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new MovieList();
			setVisible(false);
		}

	}
	class HomeAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new MovieList();
		}
	}

	class MobileTicketAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new MobileTicket();
		}

	}

	class SettingAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new Setting();
		}
	}
}