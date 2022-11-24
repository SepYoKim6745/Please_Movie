package Display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class MovieList extends JFrame{
	JButton[] MVButtons = new JButton[8];
	ImageIcon[] poster = new ImageIcon[8];
	JButton[] NVButtons = new JButton[3];
	ImageIcon[] bar = new ImageIcon[3];
	JPanel p1,p2;
	public MovieList() {
		
		setVisible(true);
		setTitle("��ȭ�� ��Ź��");
		setSize(600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i<poster.length;i++) {
			poster[i] = new ImageIcon("Please_Movie/src/image/poster"+(i+1)+".jpg");
			Image posterImage = poster[i].getImage();
			Image changeImg = posterImage.getScaledInstance(60,40,Image.SCALE_SMOOTH);
			poster[i] = new ImageIcon(changeImg);
		}
		
		for(int i = 0; i<bar.length;i++) {
			bar[i] = new ImageIcon("Please_Movie/src/image/Bar"+(i+1)+".jpg");
			Image barimage = bar[i].getImage();
			Image changeImg = barimage.getScaledInstance(60,40,Image.SCALE_SMOOTH);
			bar[i] = new ImageIcon(changeImg);
		}
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		add(p1,"Center");
		add(p2,"South");
		p1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,30,10));
		p1.setBackground(Color.white);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
		p2.setBackground(Color.gray);
		
		for(int i = 0; i<bar.length; i++) {
			NVButtons[i] = new JButton(bar[i]);
			NVButtons[i].setPreferredSize(new Dimension(60,40));
			NVButtons[i].setBackground(Color.gray);
			p2.add(NVButtons[i]);
		}
		
		for(int i = 0; i<MVButtons.length; i++) {
			MVButtons[i] = new JButton(poster[i]);
			MVButtons[i].setName(""+(i+1));
			MVButtons[i].setPreferredSize(new Dimension(142,200));
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
