package Display;

import Please_Movie.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MovieInfo extends JFrame {
	public MovieInfo(String posterAddress) {
		JButton[] NVButtons = new JButton[3];
		ImageIcon[] bar = new ImageIcon[3];
		JPanel p1, p2;
        //System.out.println(posterAddress.substring(29, 30));
        int movieNum = Integer.parseInt(posterAddress.substring(29, 30));

		Color crimson = new Color(0xFF4f55);
		Color brightGray = new Color(0xbebebe);

		setTitle("영화를 부탁해");
		setSize(600, 900);

		for(int i = 0; i<bar.length;i++) {
			bar[i] = new ImageIcon("Please_Movie/src/image/Bar"+(i+1)+".jpg");
			Image barimage = bar[i].getImage();
			Image changeImg = barimage.getScaledInstance(60,40,Image.SCALE_SMOOTH);
			bar[i] = new ImageIcon(changeImg);
		}

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//mb : top menu
		JMenuBar mb = new JMenuBar(); //top
		mb.setBackground(crimson);
		ImageIcon arrow = new ImageIcon("Please_Movie/src/image/arrow.png");
		Image arrowImage = arrow.getImage();
		arrowImage = arrowImage.getScaledInstance(50,20,Image.SCALE_SMOOTH);
		ImageIcon aRrow = new ImageIcon(arrowImage);
		JButton backButton = new JButton(aRrow);
		backButton.addActionListener(new BackMenuAction());
		backButton.setBackground(crimson);
		mb.add(backButton);
		add(mb, "North");
		//mb end

		p1 = new JPanel();
		p2 = new JPanel();
		add(p1, "Center");
		add(p2, "South");
		
		// p1.add(appVersion);
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        //포스터 이미지
        ImageIcon Poster = new ImageIcon(posterAddress);
        Image tmpImage = Poster.getImage();
        tmpImage = tmpImage.getScaledInstance(120,160,Image.SCALE_SMOOTH);
        ImageIcon PosterImg = new ImageIcon(tmpImage);
        JLabel pImg = new JLabel(PosterImg);
        //비디오 이미지
        ImageIcon Video = new ImageIcon("Please_Movie/src/image/video.jpg");
        tmpImage = Video.getImage();
        tmpImage = tmpImage.getScaledInstance(470,270,Image.SCALE_SMOOTH);
        ImageIcon VideoImg = new ImageIcon(tmpImage);
        JLabel vImg = new JLabel(VideoImg);
        //영화제목
        String[] titleList = {"데시벨","와칸다 포에버","동감","폴:600미터",
                            "자백","올빼미","에브리씽에브리웨어올앳원스","인생은 아름다워"};
        JLabel title = new JLabel(titleList[movieNum - 1]);
		title.setFont(MainFrame.boldone);
        //상세정보
        String[] detailList = {"감독 : 은재민","장르 : 스릴러", "RunTime:115분"};
        JLabel detail = new JLabel("<html><body>"+ detailList[0] +"<br>"+ detailList[1] +"<br>"+ detailList[2] +"<br></body></html>");
        detail.setFont(MainFrame.nomone);
		//줄거리
        String story = "들어보라, 청춘의 피는 끓는다. 끓는 피에 뛰노는 심장은 거선의 기관과 같이 힘있다. 이것이다...";
        JLabel ItisStory = new JLabel("<html>줄거리</html>");
		ItisStory.setFont(new Font("닉스곤체 B 2.0",Font.PLAIN, 30));
        JTextPane StoryPane = new JTextPane();
		StoryPane.setFont(MainFrame.lightone);
		StoryPane.setText(story);
        //이동버튼
        JButton toChoose = new JButton("예매하기>");
		toChoose.setFont(MainFrame.nomone);
        //////////////////
        pImg.setBounds(60,30,120,160);
        title.setBounds(235,30,200,50);
        detail.setBounds(240,100,250,90);
        vImg.setBounds(60,220,470,270);
        ItisStory.setBounds(70,520,460,40);
        StoryPane.setBounds(70,575,460,100);
        toChoose.setBounds(330,660,200,80);

        p1.add(pImg);
        p1.add(detail);
        p1.add(title);
        p1.add(vImg);
        p1.add(ItisStory);
        p1.add(StoryPane);
        p1.add(toChoose);
		//p1 end
		
		//p2 : nav
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));
		p2.setBackground(brightGray);
		for (int i = 0; i < bar.length; i++) {
            NVButtons[i] = new JButton(bar[i]);
			NVButtons[i].setPreferredSize(new Dimension(60, 40));
			NVButtons[i].setBackground(brightGray);
			p2.add(NVButtons[i]);
		}
        toChoose.setName(posterAddress);
        toChoose.addActionListener(new toChooseAction());

		NVButtons[0].addActionListener(new HomeAction()); // 홈화면 액션 리스너
		NVButtons[1].addActionListener(new MobileTicketAction()); // 모바일티켓 액션 리스너
		NVButtons[2].addActionListener(new SettingAction()); // setting 액션 리스너
		
		setVisible(true);
		contentPane.paint(contentPane.getGraphics());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
    class toChooseAction implements ActionListener {
        @Override
		public void actionPerformed(ActionEvent e) {
			JButton btnVal = (JButton) e.getSource();
			new Choose(btnVal.getName());
			setVisible(false);
		}
    }
	class BackMenuAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new MovieList();
			setVisible(false);
		}

	}
	class HomeAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new MovieList();
		}
	}

	class MobileTicketAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new MobileTicket();
		}

	}

	class SettingAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			new Setting();
		}
	}
}