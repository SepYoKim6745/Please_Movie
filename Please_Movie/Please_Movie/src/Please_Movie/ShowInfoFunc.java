package Please_Movie;

public class ShowInfoFunc extends Theater{
	private Movie movie;
	private int showTime;
	private String type;
	private String roomNumber;
	private int leftSeat;
	private int total;
	private int people;
	
	public ShowInfoFunc(int p) {
		//movieInfo에서 정보를 모두 가져옴  파일을 읽어옴
		people = p;
		
	}
	public Movie getMovie() {
		return movie;
	}
	
	public int getShowTime() {
		return showTime;
	}
	
	public String getType() {
		return type;
	}
	
	public String getRoomNum() {
		return roomNumber;
	}
	
	public int getLeftSeat() {
		return leftSeat;
	}
	
	public int getTotalSeat() {
		return total;
	}
}
