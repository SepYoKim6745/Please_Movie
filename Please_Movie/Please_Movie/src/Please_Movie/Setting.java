package Please_Movie;

public class Setting {
	private String appinfo;
	private String userLocation = "코리아텍";
	private int curTime = 1200;
	public Setting(int time,String uLocation, String info) {
		this.appinfo = info;
		this.userLocation = uLocation;
		this.curTime = time;
	}
	public String getAppinfo(){
		return this.appinfo;
	}
	public void setUserLocation(String input) {
		this.userLocation = input;
	}
	public String getUserLocation() {
		return this.userLocation;
	}
	public void setTime(int input) {
		this.curTime = input;
	}
	public int getTime() {
		return this.curTime;
	}
	public void displaySetting(){
		//
	}
}