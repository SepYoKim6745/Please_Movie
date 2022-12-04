package Display;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class SeatInfo extends JFrame {
	int num =0;
	public static int mancount;
	boolean op_sw = false;
	//JButton [] seleted_but = new JButton[4];
	ArrayList <JButton> selected_but = new ArrayList<JButton>();
	public SeatInfo(int people) {							// SeatInfo클래스 생성자 시작
		/////////////////////////   기본 네비게이션바, 뒤로가기 버튼 , 후면 레이아웃   /////////////////////////////////////////////////////////////////////////////
		//this.mancount = people;
		mancount = people;
		JButton[] NVButtons = new JButton[3];
		ImageIcon[] bar = new ImageIcon[3];
		JPanel p1,p2, p3, p4, p5, p6 ,p7;
		JPanel seatPanel[] = new JPanel[3];

		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);
		Color realGray = new Color(0xECEFF1);

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
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,300,100));
		p1.setBackground(Color.white);
		
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
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		p3 = new JPanel(new FlowLayout());
		p1.add(p3,"North");
		p3.setLayout(new BorderLayout());
		p3.setBackground(realGray);
		
		
		
		p7 = new JPanel(new BorderLayout());
		p3.add(p7,"North");
		p7.setLayout(new FlowLayout(FlowLayout.CENTER,50,200));
		p7.setBackground(realGray);
		
		JPanel more_Op = new JPanel();
		p3.add(more_Op);
		more_Op.setLayout(new FlowLayout(FlowLayout.RIGHT,100,30 ));
		more_Op.setBackground(realGray);
		JButton btn_Op = new JButton();
		btn_Op.setPreferredSize(new Dimension(100, 28));
		btn_Op.setName("default");
		btn_Op.setText("시야각");
		btn_Op.setBackground(null);
		btn_Op.addActionListener(new OptionListener());
		more_Op.add(btn_Op);
		
		
		int seat_num = 96;
		String[] loca = {"East", "Center", "West"};
		JButton[] btn= new JButton[seat_num];
		ImageIcon icon = new ImageIcon("Please_Movie/Please_Movie/src/image/seat.jpg");
		for(int i = 0; i < 3; i++) {
			seatPanel[i] = new JPanel();
			p7.add(seatPanel[i],loca[i]);
			seatPanel[i].setLayout(new GridLayout(6,(i==1?8:4)));
			seatPanel[i].setBackground(realGray);
		}
		
		int seat_i = 0;
		int tmp = 0;
		String seat_number = "";
		for(int j = 0; j<3; j++) {
			tmp += 24;
			if(j==1)tmp+=24;
			for(int i = seat_i; i < tmp; i++ ) {
				btn[i] = new JButton(icon);
				btn[i].setPreferredSize(new Dimension(27, 28));
				if(i < 24) {
					seat_number += (char)((i / 4) + 65);
					seat_number += "열";
					seat_number += Integer.toString((i % 4)+1);
					seat_number += "번";
				}
				else if(i < 72) {
					int n = i - 24;
					seat_number += (char)((n / 8) + 65);
					seat_number += "열";
					seat_number += Integer.toString((n % 4)+5);
					seat_number += "번";
				}
				else if(i < 96) {
					int k = i - 72;
					seat_number += (char)((k / 4) + 65);
					seat_number += "열";
					seat_number += Integer.toString((k % 4)+13);
					seat_number += "번";
				}
				btn[i].setName("0"+ seat_number);
				seat_number = "";
				btn[i].addActionListener(new MyActionListener()); //이벤트 리스너 인스턴스 생성
			    seatPanel[j].add(btn[i]); //버튼을 프레임에 얹음
				btn[i].setBackground(Color.WHITE);
			}
			seat_i = tmp;
		}
		
	    setVisible(true);		//프레임을 보일지 설정
	} 							// SeatInfo클래스 생성자 끝
	public class select_dial extends JFrame {
		 
	    public select_dial() {
	    	String movie_select = "";
	    	int count =0;
	    	Color crimson = new Color(0xFF4f55);
	    	setTitle("영화를 부탁해");
			setSize(660,600);
	    	Container contentPane = getContentPane();
	    	contentPane.setLayout(new BorderLayout(0,0));
	    	JPanel P1 = new JPanel();
	    	JPanel P2 = new JPanel();
	    	P1.setLayout(new FlowLayout(FlowLayout.CENTER,40,100));
	    	P2.setLayout(new FlowLayout(FlowLayout.CENTER,40,50));
	    	add(P2,"North");
	    	add(P1,"Center");
	    	for (JButton A : selected_but) {
	    		movie_select += A.getName().substring(1) + " ";
				
	    		System.out.println(movie_select);
	    		count++;
	    	}
			
	    	JLabel L1 = new JLabel("총 인원 "+count+"명 "+ movie_select +"자리로 선택하시겠습니까?");
	    	L1.setFont(new Font("닉스곤체 B 2.0",Font.PLAIN, 18));
	    	P2.add(L1,"North");
	    	JButton btn = new JButton("네");
	    	btn.setBackground(crimson);
	    	
			btn.setPreferredSize(new Dimension(90, 30));
			btn.addActionListener(new MobileTicketAction()); //이벤트 리스너 인스턴스 생성
			btn.addActionListener(new DialCutListener()); //이벤트 리스너 인스턴스 생성
		    P1.add(btn); //버튼을 프레임에 얹음
		    
		    JButton btn1 = new JButton("아니요");
		    btn1.setBackground(crimson);
			btn1.setPreferredSize(new Dimension(90, 30));
			
			btn1.addActionListener(new SelectListener()); //이벤트 리스너 인스턴스 생성
			
		    P1.add(btn1); //버튼을 프레임에 얹음
	    	
	        
	        setLocation(100, 100);
	        setVisible(true);
	 
	    }
		
	    class SelectListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource(); 
				//사용자가 어떤 버튼을 눌렀는지 알아내기
				String tmp = b.getText();
				if(tmp.equals("네")) {	
					dispose();
					for(JButton A : selected_but) {
						// A.setBackground(null);
						String temp = (A.getName()).substring(1);
						A.setName("0"+temp);
					}
					selected_but.clear();
					num = 0;
					dispose();
				}
				else {
					for(JButton A : selected_but) {
						A.setBackground(Color.WHITE);
						String temp = (A.getName()).substring(1);
						A.setName("0"+temp);
					}
					selected_but.clear();
					num = 0;
					dispose();
				}
				
			}
		}
	 
	}
	public class DialogTest extends JFrame {
		 
	    public DialogTest() {
	    	setTitle("영화를 부탁해");
			setSize(500,500);
	    	Container contentPane = getContentPane();
	    	contentPane.setLayout(new BorderLayout());
	    	
	    	ImageIcon icon = new ImageIcon("Please_Movie/src/image/view.png");
	        Image im = icon.getImage();
	        Image im2 = im.getScaledInstance(500, 250, Image.SCALE_DEFAULT);
	    	ImageIcon icon2 = new ImageIcon(im2);
	    	JLabel img = new JLabel(icon2);
	    	
			contentPane.add(img);
	        
	        setLocation(100, 100);
	        setVisible(true);
	 
	    }
	 
	}
	class DialCutListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			setVisible(false);
		}
	}

	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();  //사용자가 특정 버튼을 action 했을 때 , 그 버튼을 b라는 다른 버튼 인스턴스에 복사 
			//사용자가 어떤 버튼을 눌렀는지 알아내기
			String tmp = b.getName();
			if(op_sw) {
				DialogTest dialog= new DialogTest();
			}
			else {
				if(tmp.charAt(0) == '0') {	//버튼 b의 텍스트가 "Action"인지 비교 	
					b.setName("1".concat(tmp.substring(1)));
					b.setBackground(new Color(0xFF4f55));
					System.out.println("change cannot");
					selected_but.add(b);
					System.out.println(b.getName());
					num++;
				}
				else {
					b.setName("0".concat(tmp.substring(1)));
					b.setBackground(null);
					System.out.println("change can");
					selected_but.remove(b);
					if (num > 0)
					num--;
				}

				if(num==mancount) {
					num = 0;
					new select_dial();
				}
			}
		}
	}
	class OptionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource(); 
			//사용자가 어떤 버튼을 눌렀는지 알아내기
			String tmp = b.getName();
			if(tmp.equals("default")) {	
				b.setName("true");
				b.setBackground(Color.orange);
				op_sw = true;
			}
			else {
				b.setName("default");
				b.setBackground(null);
				op_sw = false;
			}
			
			if(num==4) {
				new select_dial();
			}
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
