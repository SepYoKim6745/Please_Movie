package Display;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MyDialog extends JDialog{
	String location;
	String brand;
	String time;
	String selectPeople;
	JComboBox peopleComboBox;
	int select;
	JFrame frame;
	public MyDialog(JFrame frame, String title, String location, String brand, String time){
		super(frame, title);
		this.frame = frame;
		String[] people = {"1명", "2명", "3명","4명"};
		this.location = location;
		this.brand = brand;
		this.time = time;
		this.setLayout(new BorderLayout());
		this.setSize(400, 600);
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		this.add(p1,"North");
		JLabel info = new JLabel(location + brand + "/" +time);
		Font titleFont = new Font("굴림", Font.BOLD, 25);
		info.setFont(titleFont);
		p1.add(info);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout());
		this.add(centerPanel,"Center");
		JLabel subInfo = new JLabel("<html>상영관 : 8관 <br> 잔여 좌석 : 15<br><br><br><br></html>");
		JPanel subNorthPanel = new JPanel();
		subNorthPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0));
		centerPanel.add(subNorthPanel,"North");
		subInfo.setForeground(Color.gray);
		subNorthPanel.add(subInfo);
		JPanel centerContent = new JPanel();
		centerContent.setLayout(new FlowLayout(FlowLayout.LEFT, 80,0));
		centerPanel.add(centerContent, "Center");
		JLabel job = new JLabel("<html>직업 <br></html>");
		JLabel job_detail = new JLabel("<html>- 군인<br><br>- 국가유공자<br><br>- 어린이<br><br></html>");
		JLabel p  = new JLabel("<html>인원<br></html>");
		peopleComboBox = new JComboBox(people);
		JLabel br  = new JLabel("<html> <br><br><br><br><br><br><br><br><br><br><br><br></html>");
		//JLabel saleTimePart = new JLabel("<html>- 군인<br><br>- 국가유공자<br><br>- 어린이<br><br></html>");
		job.setFont(titleFont);
		job.setForeground(Color.gray);
		p.setFont(titleFont);
		p.setForeground(Color.gray);
		centerContent.add(job);
		centerContent.add(job_detail);
		centerContent.add(br);
		centerContent.add(p);
		centerContent.add(peopleComboBox);
		//centerContent.add(saleTime);
		//centerContent.add(saleTimePart);
		JPanel footer = new JPanel();
		footer.setLayout(new FlowLayout(FlowLayout.RIGHT, 30,0));
		this.add(footer, "South");
		JButton nextButton = new JButton("좌석 선택하기");
		nextButton.addActionListener(new nextButton());
		footer.add(nextButton);
		
	}
	class nextButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			selectPeople = peopleComboBox.getSelectedItem().toString();
			selectPeople = selectPeople.substring(0, 1);
			select = Integer.parseInt(selectPeople);
			SeatInfo selectData = new SeatInfo(select);
			setVisible(false);
			frame.setVisible(false);
		}
	}
}