package Please_Movie;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Please_Movie.Setting;

class MovieList extends JFrame{
	JButton[] arButtons = new JButton[8];
	ImageIcon[] poster = new ImageIcon[8];
	JPanel p1,p2;
	public MovieList() {
		
		setVisible(true);
		setTitle("영화를 부탁해");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<poster.length;i++) {
			poster[i] = new ImageIcon("src/image/poster"+(i+1)+".jpg");
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
		p2.add(new JButton("1"));
		p2.add(new JButton("2"));
		p2.add(new JButton("3"));
		
		
		for(int i = 0; i<arButtons.length; i++) {
			arButtons[i] = new JButton(poster[i]);
			arButtons[i].setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
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
			new chooseDisplay(btnVal.getIcon());
			setVisible(false);
		}
		
	}
	
}



class chooseDisplay extends JFrame{ //실패.... 버튼 클릭 이벤트
	public chooseDisplay(Icon icon) {
		super("영화를 부탁해");
		System.out.println(icon);
		System.out.println("1");
		JPanel p1 = new JPanel();
		if(icon.equals("../../image/poster1.jpg\n")) {
			p1.setBackground(Color.BLUE);
		}
		else if(icon.equals("../../image/poster2.jpg\n")) {
			p1.setBackground(Color.RED);
		}
		else {
			p1.setBackground(Color.BLACK);
		}	
		
		setSize(400,600);
		add(p1);
		setVisible(true);
	}
	
	
}



public class MainFrame {
	private int page = 0;
	public static void main(String[] args) {
		movieListDisplay();
	}
	public static void movieListDisplay() {
		MovieList movielist = new MovieList();
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