package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * �γ��࣬�����γ̵����Ժ�ע��ע��ÿγ̵�ѧ��
 * @author Administrator
 *
 */
public class CourseSession {
	String department;
	String number;
	private int studentCount = 0;
	List<Student> stu = new ArrayList<>();
	private Date openCourse;
	Date endCourse;
	private static String str = "yyyy-MM-dd";
	private static int count;
	//����CourseSession����
	public static CourseSession create(String department, String number) {
		return new CourseSession(department, number);
	}

	public static CourseSession create(String department, String number, Date openCourse) {
		return new CourseSession(department, number, openCourse);
	}
	//���ؿγ�����
	public int getCount() {
		return count;
	}
	
	private CourseSession(String department, String number) {
		this(department, number, null);
	}

	private CourseSession(String department, String number, Date openCourse) {
		this.department = department;
		this.number = number;
		this.openCourse = openCourse;
		incrementCount();
	}

	public String getDepartment() {
		return department;
	}
	//���ؿγ�����
	public String getNumber() {
		return number;
	}
	//ѧ��ע��
	public void enroll(Student student) {
		stu.add(student);
		studentCount++;

	}
	//����ѧ������
	public int getNumberOfStudents() {
		return studentCount;
	}
	//����һ��ѧ������
	public Student getIndex(int index) {
		return stu.get(index);
	}
	//���ؿ�������
	public Date getStartDate() throws Exception {
		DateFormat df = DateFormat.getDateInstance();
		String start = df.format(openCourse);
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		Date startDate = sdf.parse(start);
		return startDate;
	}
	//���ؽ������
	@SuppressWarnings("deprecation")
	public Date getEndDate() throws Exception {
		openCourse.setMonth(openCourse.getMonth() + 6);
		DateFormat df1 = DateFormat.getDateInstance();
		String end = df1.format(openCourse);
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		Date endDate = sdf.parse(end);
		return endDate;
	}
	//����γ���������
	private static void incrementCount() {
		count++;
	}
}
