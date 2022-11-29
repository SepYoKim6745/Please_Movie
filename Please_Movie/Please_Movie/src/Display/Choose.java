package Display;
import Please_Movie.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.*;
import java.util.*;

import javax.swing.*;

import Display.MovieList.MyActionListener;

class MyDialog extends JDialog{
	String location;
	String brand;
	String time;
	public MyDialog(JFrame frame, String title, String location, String brand, String time){
		super(frame, title);
		this.location = location;
		this.brand = brand;
		this.time = time;
		this.setLayout(new BorderLayout());
		this.setSize(500, 600);
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		this.add(p1,"North");
		JLabel info = new JLabel(location + brand + "/" +time);
		Font titleFont = new Font("굴림", Font.BOLD, 25);
		info.setFont(titleFont);
		p1.add(info);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		this.add(centerPanel,"Center");
		JLabel subInfo = new JLabel("<html><br><br>상영관 : 8관 <br> 잔여 좌석 : 15</html>");
		subInfo.setForeground(Color.gray);
		centerPanel.add(subInfo, "North");
		
	}
}



public class Choose extends JFrame{
	private String movieUrl;
	MyDialog dialog;
	public Choose(String string) {
		JButton[] NVButtons = new JButton[3];
		ImageIcon[] bar = new ImageIcon[3];
		JPanel p1,p2;
		movieUrl = string;
		
		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);
		
		setVisible(true);
		setTitle("영화를 부탁해");
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<bar.length;i++) {
			bar[i] = new ImageIcon("Please_Movie/Please_Movie/src/image/Bar"+(i+1)+".jpg");
			Image barimage = bar[i].getImage();
			Image changeImg = barimage.getScaledInstance(60,40,Image.SCALE_SMOOTH);
			bar[i] = new ImageIcon(changeImg);
		}
		
		//컨텐트팬 생성 
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(0,0));
		
		//패널 생성 (레이아웃 만들기) 
		p1 = new JPanel();
		add(p1,"Center");
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,40,10));
		p1.setBackground(Color.white);
		
		Image img;
		Image updateImg;
		ImageIcon updateIcon;
		
		JLabel imgLabel = new JLabel();
		ImageIcon moviePoster = new ImageIcon(movieUrl);
		img = moviePoster.getImage();
		updateImg = img.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
		updateIcon = new ImageIcon(updateImg);
		imgLabel.setIcon(updateIcon);
		JLabel thaterInfo = new JLabel("CGV - 천안 신부점 / 22:20 상영관: 8관 / 잔여 좌석: 15석 / 거 리 : 240M");
		
		dialog = new MyDialog(this, "영화를 부탁해", "천안 신부점", "CGV", "22:20");
		
		imgLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//new Setting();
				dialog.setVisible(true);
			}
		});
		
		thaterInfo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//new Setting();
				dialog.setVisible(true);
			}
		});
		
		
		
		JLabel imgLabel2 = new JLabel();
		ImageIcon moviePoster2 = new ImageIcon(movieUrl);
		img = moviePoster.getImage();
		updateImg = img.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
		updateIcon = new ImageIcon(updateImg);
		imgLabel2.setIcon(updateIcon);
		JLabel thaterInfo2 = new JLabel("CGV - 천안 신부점 / 22:20 상영관: 8관 / 잔여 좌석: 15석 / 거 리 : 240M");
		
		imgLabel2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		thaterInfo2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		
		JLabel imgLabel3 = new JLabel();
		ImageIcon moviePoster3 = new ImageIcon(movieUrl);
		img = moviePoster.getImage();
		updateImg = img.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
		updateIcon = new ImageIcon(updateImg);
		imgLabel3.setIcon(updateIcon);
		JLabel thaterInfo3 = new JLabel("CGV - 천안 신부점 / 22:20 상영관: 8관 / 잔여 좌석: 15석 / 거 리 : 240M");
		
		imgLabel3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		thaterInfo3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		
		JLabel imgLabel4 = new JLabel();
		ImageIcon moviePoster4 = new ImageIcon(movieUrl);
		img = moviePoster.getImage();
		updateImg = img.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
		updateIcon = new ImageIcon(updateImg);
		imgLabel4.setIcon(updateIcon);
		JLabel thaterInfo4 = new JLabel("CGV - 천안 신부점 / 22:20 상영관: 8관 / 잔여 좌석: 15석 / 거 리 : 240M");
		
		imgLabel4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		thaterInfo4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		JLabel imgLabel5 = new JLabel();
		ImageIcon moviePoster5 = new ImageIcon(movieUrl);
		img = moviePoster.getImage();
		updateImg = img.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
		updateIcon = new ImageIcon(updateImg);
		imgLabel5.setIcon(updateIcon);
		JLabel thaterInfo5 = new JLabel("CGV - 천안 신부점 / 22:20 상영관: 8관 / 잔여 좌석: 15석 / 거 리 : 240M");
		
		imgLabel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		thaterInfo5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				new Setting();
				setVisible(false);
			}
		});
		
		
//		JLabel imgLabel6 = new JLabel();
//		ImageIcon moviePoster6 = new ImageIcon(movieUrl);
//		img = moviePoster.getImage();
//		updateImg = img.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
//		updateIcon = new ImageIcon(updateImg);
//		imgLabel6.setIcon(updateIcon);
//		JLabel thaterInfo6 = new JLabel("CGV - 천안 신부점 / 22:20 상영관: 8관 / 잔여 좌석: 15석 / 거 리 : 240M");
		
//		JLabel imgLabelArr[] = new JLabel[8];
//		ImageIcon moviePosterArr[] = new ImageIcon[8];
//		JLabel thaterInfoArr[] = new JLabel[8];
//		for(int i = 0; i < 8; i++) {
//			moviePosterArr[i] = new ImageIcon(movieUrl);
//			img = moviePosterArr[i].getImage();
//			updateImg = img.getScaledInstance(90, 120, Image.SCALE_SMOOTH);
//			updateIcon = new ImageIcon(updateImg);
//			imgLabelArr[i].setIcon(updateIcon);
//			thaterInfoArr[i] = new JLabel("CGV - 천안 신부점 / 22:20 상영관: 8관 / 잔여 좌석: 15석 / 거 리 : 240M");
//			
//		}
		
		
        //imgLabel.setBounds(0, 0, 0, 0);
		JPanel filterPanel = new JPanel();
		filterPanel.setLayout(new FlowLayout(FlowLayout.LEFT,80,10));
		filterPanel.setBackground(Color.white);
		JLabel location = new JLabel("천안시 동남구");
		JLabel date = new JLabel("11.16(화)");
		String[] brand = {"CGV", "MegaBox", "롯데시네마"};
		JComboBox filterBrand = new  JComboBox(brand);
		filterPanel.add(location);
		filterPanel.add(date);
		filterPanel.add(filterBrand);
		JPanel centerPanel = new JPanel();
		centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add("North", filterPanel);
		p1.add("Center", centerPanel);
		p1.add(imgLabel);
		p1.add(thaterInfo);
		p1.add(imgLabel2);
		p1.add(thaterInfo2);
		p1.add(imgLabel3);
		p1.add(thaterInfo3);
		p1.add(imgLabel4);
		p1.add(thaterInfo4);
		p1.add(imgLabel5);
		p1.add(thaterInfo5);
//		p1.add(imgLabel6);
//		p1.add(thaterInfo6);
//		for(int i = 0; i < 8; i++) {
//			p1.add(imgLabelArr[i]);
//			p1.add(thaterInfoArr[i]);
//		}
		
		
		//메뉴바 생성 
		JMenuBar mb = new JMenuBar();
		mb.setBackground(crimson);
		ImageIcon backButtonImage = new ImageIcon();
		
		//뒤로가기 버튼 생성 
		backButtonImage = new ImageIcon("");
		JButton backButton = new JButton("<<---");
		backButton.addActionListener(new BackMenuAction());
		backButton.setBackground(crimson);
		mb.add(backButton);
		add(mb,"North");
		
		//네비게이션
		p2 = new JPanel();
		add(p2,"South");
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