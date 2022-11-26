package Display;
import Please_Movie.*;
import java.awt.*;

import javax.swing.*;


public class Setting extends JFrame{
	public Setting() {
//        super("영화를 부탁해");
//        Container con = getContentPane();
//        Icon poster = new ImageIcon();
//        con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
//		//con.add(new ImageIcon());
//        con.add(new JTextField(20));
//		con.add(new JButton("1"));
//		con.add(new JButton("1"));
//		con.add(new JButton("1"));
//		con.add(new JButton("1"));
        super("영화를 부탁해");
		setSize(600,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel p1 = new JPanel();
        p1.setBackground(Color.BLUE);
		add(p1);
		setVisible(true);
       
	}
}
