package Please_Movie;
import ShowInfo.*;
public class ReserveInfo {
	//필드
	private int manCount; //인원수
	private int charge; //결제 금액
	private String selectedseat; //선택된 좌석 정보
	private Show_info show_info;//Show_info클래스 import
	
	//메소드
	public void setCharge(int charge) { //금액 입력 함수
		this.charge = charge;
	}
	public int getCharge() { //금액 반환 함수
		return charge;
	}
	public void setManCount(int manCount) { //인원수 입력 함수
		this.manCount = manCount;
	}
	public int getManCount() { //인원수 반환 함수
		return manCount;
	}
	public void newMobileTicket() { //메모자에 모바일 티켓 쓰기
		
	}
	
}
