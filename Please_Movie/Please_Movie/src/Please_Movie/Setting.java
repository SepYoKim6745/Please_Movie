package Please_Movie;

public class Setting {
	
	//필드
	private String appinfo;//앱 정보
	private String userLocation = "肄붾━�븘�뀓";//사용자 위치 정보
	private int curTime = 1200; //현재 시각

	//메소드
	public Setting(int time,String uLocation, String info) {//생성자 함수
		this.appinfo = info;
		this.userLocation = uLocation;
		this.curTime = time;
	}
	public String getAppinfo(){ //앱 정보 반환 함수
		return this.appinfo;
	}
	public void setUserLocation(String input) { //사용자 위치 입력 함수
		this.userLocation = input;
	}
	public String getUserLocation() { //사용자 위치 반환 함수
		return this.userLocation;
	}
	public void setTime(int input) { //현재 시각 입력 함수
		this.curTime = input;
	}
	public int getTime() { //현재 시각 반환 함수
		return this.curTime;
	}
	public void displaySetting(){ //화면 출력 설정 함수(미정)
		//
	}
}