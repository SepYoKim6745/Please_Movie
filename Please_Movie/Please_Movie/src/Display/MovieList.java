package Display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovieList extends JFrame{
	JButton[] MVButtons = new JButton[8];
	ImageIcon[] poster = new ImageIcon[8];
	JButton[] NVButtons = new JButton[3];
	ImageIcon[] bar = new ImageIcon[3];
	JPanel p1,p2;
	public MovieList() {
		
		setVisible(true);
		setTitle("영화를 부탁해");
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<poster.length;i++) {
			poster[i] = new ImageIcon("Please_Movie/src/image/poster"+(i+1)+".jpg");
		}
		
		for(int i = 0; i<bar.length;i++) {
			bar[i] = new ImageIcon("Please_Movie/src/image/Bar"+(i+1)+".jpg");
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
		
		for(int i = 0; i<bar.length; i++) {
			NVButtons[i] = new JButton(bar[i]);
			p2.add(NVButtons[i]);
		}
		
		for(int i = 0; i<MVButtons.length; i++) {
			MVButtons[i] = new JButton(poster[i]);
			MVButtons[i].setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
			MVButtons[i].setName(""+(i+1));
			p1.add(MVButtons[i]);
			MVButtons[i].addActionListener(new MyActionListener());
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton btnVal = (JButton) e.getSource();
			
		}
		
	}
	
}
