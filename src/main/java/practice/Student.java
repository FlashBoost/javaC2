package practice;
/**
 * ѧ����
 * @author Administrator
 *
 */
public class Student {
	String name;
	private int Cre;
	private static String Local = "SH";
	//����Student����
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return getName();
	}
	//�ж��Ƿ�Ϊȫ����ѧ��
	public boolean iffullTime() {
		if (Cre >= 12) {
			return true;
		} else {
			return false;
		}
	}
	//���ѧ��
	public int getCredits() {
		return Cre;
	}
	//����ѧ��
	public int addCredits(int credits) {
		return Cre += credits;
	}
	//�ж��Ƿ�Ϊ����ѧ��
	public boolean isLocal() {
		if (Local.equals("SH")) {
			return true;
		} else {
			return false;
		}
	}
	//����ѧ������
	public void setLocation(String province) {
		Local = province;
	}

}
