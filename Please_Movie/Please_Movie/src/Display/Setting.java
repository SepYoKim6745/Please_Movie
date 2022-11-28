package Display;

import Please_Movie.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
// import javax.swing.border.*;
import javax.swing.border.TitledBorder;

<<<<<<< HEAD
=======
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

		for (int i = 0; i < bar.length; i++) {
			bar[i] = new ImageIcon("Please_Movie/src/image/Bar" + (i + 1) + ".jpg");
			Image barimage = bar[i].getImage();
			Image changeImg = barimage.getScaledInstance(60, 40, Image.SCALE_SMOOTH);
			bar[i] = new ImageIcon(changeImg);
		}

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//mb : top menu
		JMenuBar mb = new JMenuBar(); //top
		mb.setBackground(crimson);
		ImageIcon backButtonImage = new ImageIcon();
		backButtonImage = new ImageIcon("");

		JButton backButton = new JButton("<<---");
		backButton.addActionListener(new BackMenuAction());
		backButton.setBackground(crimson);
		mb.add(backButton);
		add(mb, "North");
		//mb end

		p1 = new JPanel();
		p2 = new JPanel();
		add(p1, "Center");
		add(p2, "South");

		//p1 : main
		p1.setBackground(Color.WHITE);
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		ImageIcon um = new ImageIcon("Please_Movie/Please_Movie/src/image/userlocation.jpg");
		JLabel space = new JLabel("\n\n");
		space.setPreferredSize(new Dimension(100,100));

		JLabel appVersion = new JLabel("현재 버전 : v1.0.0");
		JLabel mapImage = new JLabel(um);
		JCheckBox usingGPS = new JCheckBox("사용자 현재위치 허용",false);

		appVersion.setBackground(brightGray);
		appVersion.setFont(new Font("맑은고딕", Font.BOLD,30));
		appVersion.setPreferredSize(new Dimension(200,100));
		appVersion.setAlignmentX(CENTER_ALIGNMENT);
		
		mapImage.setAlignmentX(CENTER_ALIGNMENT);
		
		usingGPS.setFont(new Font("맑은고딕", Font.BOLD,30));
		usingGPS.setAlignmentX(CENTER_ALIGNMENT);
		p1.add(appVersion);
		p1.add(space);
		p1.add(mapImage);
		p1.add(space);
		p1.add(usingGPS);
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
>>>>>>> 8032f75c9efdfb77c609484872451a00af1ecd6d
}