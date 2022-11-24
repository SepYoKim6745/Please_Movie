package Please_Movie;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ChooseDisplay extends JFrame{
	public ChooseDisplay(String name) {
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
	}
}
