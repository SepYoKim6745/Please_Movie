package Please_Movie;
import java.awt.*;
import javax.swing.*;

public class SettingDisplay extends JFrame {
    public SettingDisplay(String name) {
        super("영화를 부탁해");
        Container con = getContentPane();
        Icon poster = new ImageIcon();
        con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		con.add(new ImageIcon());
        con.add(new JTextField(20));
		con.add(new JButton("1"));
		con.add(new JButton("1"));
		con.add(new JButton("1"));
		con.add(new JButton("1"));
        /*
		setSize(600,900);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
        super("영화를 부탁해");
		JPanel p1 = new JPanel();
		if(name.equals("1")) {
            p1.setBackground(Color.BLUE);
		}
		else if(name.equals("2")) {
            p1.setBackground(Color.RED);
		}
		else {
			p1.setBackground(Color.BLACK);
		}	
		
		setSize(400,600);
		add(p1);
		setVisible(true);
        */
	}
}
