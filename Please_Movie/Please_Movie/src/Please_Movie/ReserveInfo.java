package Please_Movie;
import ShowInfo.*;
public class ReserveInfo {
	//�ʵ�
	private int manCount; //�ο���
	private int charge; //���� �ݾ�
	private String selectedseat; //���õ� �¼� ����
	private Show_info show_info;//Show_infoŬ���� import
	
	//�޼ҵ�
	public void setCharge(int charge) { //�ݾ� �Է� �Լ�
		this.charge = charge;
	}
	public int getCharge() { //�ݾ� ��ȯ �Լ�
		return charge;
	}
	public void setManCount(int manCount) { //�ο��� �Է� �Լ�
		this.manCount = manCount;
	}
	public int getManCount() { //�ο��� ��ȯ �Լ�
		return manCount;
	}
	public void newMobileTicket() { //�޸��ڿ� ����� Ƽ�� ����
		
	}
	
}
