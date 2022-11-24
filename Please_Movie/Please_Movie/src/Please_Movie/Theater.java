package Please_Movie;

public class Theater {
	private String brand;
	private String location;
	private double distance;
	private boolean disCountInfo[] = new boolean[3];
	
	public Theater() {
		//브랜드를 기준으로 파일을 읽고 정보를 받아서 초기화
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getLocation() {
		return location;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public boolean[] getDiscount_i() {
		return disCountInfo;
	}
}
