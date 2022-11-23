package Please_Movie;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MovieList extends JFrame{
	JButton[] arButtons = new JButton[8];
	ImageIcon[] poster = new ImageIcon[8];
	
	JPanel p1,p2;
	public MovieList() {
		
		setVisible(true);
		setTitle("영화를 부탁해");
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<poster.length;i++) {
			poster[i] = new ImageIcon("Please_Movie/src/image/poster"+(i+1)+".jpg");
		}				
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		add(p1,"Center");
		add(p2,"South");
		p1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		p1.setLayout(new GridLayout(2,4,10,10));
		p1.setBackground(Color.white);
		p2.setLayout(new FlowLayout());
		p2.setBackground(Color.gray);
		
		JButton MLButton = new JButton("MovieList");//MovieList 버튼
		MLButton.setName("MovieList");
		MLButton.addActionListener(new MyActionListener());
		p2.add(MLButton);
		
		
		JButton MTButton = new JButton("MobileTicket");//MobileTicket 버튼
		MTButton.setName("MobileTicket");
		MTButton.addActionListener(new MyActionListener());
		p2.add(MTButton);
		
		JButton SetButton = new JButton("Setting");//Setting 버튼
		SetButton.setName("Setting");
		SetButton.addActionListener(new MyActionListener());
		p2.add(SetButton);
		
		for(int i = 0; i<arButtons.length; i++) {
			arButtons[i] = new JButton(poster[i]);
			arButtons[i].setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
			arButtons[i].setName(""+(i+1));
			p1.add(arButtons[i]);
			arButtons[i].addActionListener(new MyActionListener());
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btnVal = (JButton) e.getSource();
			new chooseDisplay(btnVal.getName());
			setVisible(false);
		}
		
	}
	
}

class chooseDisplay extends JFrame{ //실패.... 버튼 클릭 이벤트
	public chooseDisplay(String name) {
		super("영화를 부탁해");
		System.out.println(name);
		JPanel p1 = new JPanel();
		setSize(600,900);
		add(p1);
		setVisible(true);
		if(name.equals("1")) {
			p1.setBackground(Color.BLUE);
		}
		else if(name.equals("2")) {
			p1.setBackground(Color.RED);
		}
		else if(name.equals("3")) {
			p1.setBackground(Color.BLACK);
		}
		
		if(name.equals("MovieList")) {
			p1.setBackground(Color.WHITE);
		}
		else if(name.equals("MobileTicket")) {
			p1.setBackground(Color.ORANGE);
		}
		else if(name.equals("Setting")) {
			p1.setBackground(Color.YELLOW);
		}
	}
	
	
}


public class MainFrame {
	private int page = 0;
	public static void main(String[] args) {
		movieListDisplay();
	}
	public static void movieListDisplay() {
		new MovieList();
	}
	public static void mobileTicketDisplay() {
		
	}
	public static void settingDisplay() {
	
	}
	public static void showInfoDisplay() {
	
	}
	public static void reserveInfoDisplay() {
	
	}
	public static void seatInfoDisplay() {
		
	}
	public static void chooseDisplay() {
		
	}
}