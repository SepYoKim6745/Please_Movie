package Please_Movie;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Please_Movie.*;
import Display.*;

	
public class MainFrame {
	public static Font boldone = new Font("닉스곤체 B 2.0",Font.PLAIN, 50);
	public static Font nomone = new Font("닉스곤체 M 2.0",Font.PLAIN, 30);
	public static Font lightone = new Font("닉스곤체 L 2.0",Font.PLAIN, 20);
	public int page = 0;
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