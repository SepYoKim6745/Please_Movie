package Please_Movie;

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
			new ChooseDisplay(btnVal.getName());
			setVisible(false);
		}
		
	}
	
}
