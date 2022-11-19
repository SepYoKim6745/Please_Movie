package Please_Movie;
import java.awt.*;
import javax.swing.*;

class MovieList extends JFrame{
	JButton[] arButtons = new JButton[8];
	ImageIcon[] poster = new ImageIcon[8];
	JPanel p1,p2;
	public MovieList() {
		
		setVisible(true);
		setTitle("øµ»≠∏¶ ∫Œ≈π«ÿ");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<poster.length;i++) {
			poster[i] = new ImageIcon("./Please_Movie/image/poster"+(i+1)+".jpg");
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
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}




public class MainFrame {
	//ÔøΩ µÔøΩ
	private int page;
	
	//ÔøΩﬁº“µÔøΩ
	public static void main(String[] args) { //ÔøΩÔøΩÔøΩÔøΩ ÔøΩﬁº“µÔøΩ
		movieListDisplay();
	}
	public static void movieListDisplay() {
		MovieList movielist = new MovieList();
		System.out.println("Hello Please_Movie");
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
	public static void choseDisplay() {
		
	}
}
