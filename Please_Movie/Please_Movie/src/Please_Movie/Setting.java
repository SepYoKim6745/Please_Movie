package Please_Movie;

public class Setting {
	private String appinfo;
	private String userLocation = "�ڸ�����";
	private int curTime = 1200;
	public Setting(int input) {
		this.curTime = input;
	}
	public void setUserLocation(String input) {
		this.userLocation = input;
	}
}