package Display;
import Display.SeatInfo;
import Please_Movie.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.*;
import java.util.*;

import javax.swing.*;

import Display.MovieInfo.BackMenuAction;
import Display.MovieList.MyActionListener;

class MyDialog extends JDialog{
	String location;
	String brand;
	String time;
	String selectPeople;
	JComboBox peopleComboBox;
	int select;
	public MyDialog(JFrame frame, String title, String location, String brand, String time){
		super(frame, title);
		String[] people = {"1명", "2명", "3명","4명"};
		this.location = location;
		this.brand = brand;
		this.time = time;
		this.setLayout(new BorderLayout());
		this.setSize(400, 600);
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		this.add(p1,"North");
		JLabel info = new JLabel(location + brand + "/" +time);
		Font titleFont = new Font("굴림", Font.BOLD, 25);
		info.setFont(titleFont);
		p1.add(info);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		this.add(centerPanel,"Center");
		JLabel subInfo = new JLabel("<html>상영관 : 8관 <br> 잔여 좌석 : 15<br><br><br><br></html>");
		JPanel subNorthPanel = new JPanel();
		subNorthPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0));
		centerPanel.add(subNorthPanel,"North");
		subInfo.setForeground(Color.gray);
		subNorthPanel.add(subInfo);
		JPanel centerContent = new JPanel();
		centerContent.setLayout(new FlowLayout(FlowLayout.LEFT, 80,0));
		centerPanel.add(centerContent, "Center");
		JLabel job = new JLabel("<html>직업 <br></html>");
		JLabel job_detail = new JLabel("<html>- 군인<br><br>- 국가유공자<br><br>- 어린이<br><br></html>");
		JLabel p  = new JLabel("<html>인원<br></html>");
		peopleComboBox = new JComboBox(people);
		JLabel br  = new JLabel("<html> <br><br><br><br><br><br><br><br><br><br><br><br></html>");
		//JLabel saleTimePart = new JLabel("<html>- 군인<br><br>- 국가유공자<br><br>- 어린이<br><br></html>");
		job.setFont(titleFont);
		job.setForeground(Color.gray);
		p.setFont(titleFont);
		p.setForeground(Color.gray);
		centerContent.add(job);
		centerContent.add(job_detail);
		centerContent.add(br);
		centerContent.add(p);
		centerContent.add(peopleComboBox);
		//centerContent.add(saleTime);
		//centerContent.add(saleTimePart);
		JPanel footer = new JPanel();
		footer.setLayout(new FlowLayout(FlowLayout.RIGHT, 30,0));
		this.add(footer, "South");
		JButton nextButton = new JButton("좌석 선택하기");
		nextButton.addActionListener(new nextButton());
		footer.add(nextButton);
		
	}
	class nextButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			selectPeople = peopleComboBox.getSelectedItem().toString();
			selectPeople = selectPeople.substring(0, 1);
			select = Integer.parseInt(selectPeople);
			SeatInfo selectData = new SeatInfo(select);
			setVisible(false);
		}
		
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
			bar[i] = new ImageIcon("Please_Movie/src/image/Bar"+(i+1)+".jpg");
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
				dialog.setVisible(true);
			}
		});
		
		thaterInfo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
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
				dialog.setVisible(true);
			}
		});
		
		thaterInfo2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dialog.setVisible(true);
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
				dialog.setVisible(true);
			}
		});
		thaterInfo3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dialog.setVisible(true);
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
				dialog.setVisible(true);
			}
		});
		
		thaterInfo4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dialog.setVisible(true);
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
				dialog.setVisible(true);
			}
		});
		
		thaterInfo5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dialog.setVisible(true);
			}
		});
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
		
		
		//메뉴바 생성 
		JMenuBar mb = new JMenuBar();
		mb.setBackground(crimson);
		ImageIcon arrow = new ImageIcon("Please_Movie/src/image/arrow.png");
		Image arrowImage = arrow.getImage();
		arrowImage = arrowImage.getScaledInstance(50,20,Image.SCALE_SMOOTH);
		ImageIcon aRrow = new ImageIcon(arrowImage);
		JButton backButton = new JButton(aRrow);
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
			new MovieInfo(movieUrl);
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