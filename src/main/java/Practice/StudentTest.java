package Practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
	@Test
	public void testCreateStudent() {
		Student leon = new Student("Leon");
		
		Assert.assertEquals("Leon", leon.getName());
	}

	@Test
	public void testCreateLesson() {
		CourseSession session = new CourseSession("102", "English");
		Assert.assertEquals("102", session.getNumber());
		Assert.assertEquals("English", session.getDepartment());
	}

	/** 新的测试case，创建一个English的课程，assert默认getNumberOfStudents()返回值为0 */
	// @Test
	// public void testGetNumberOfStudents() {
	// CourseSession lesson = new CourseSession();
	// lesson.setDepartment("English");
	// Assert.assertEquals(lesson.getNumberOfStudents(), 0);
	// }

	/** 新的测试case，创建一个English的课程，给这门课程使用enroll(student)方法注册两名学生，assert方法getNumberOfStudents()返回2. */
	// @Test
	// public void testGetNumberOfStudents2() {
	// CourseSession lesson = new CourseSession();
	// lesson.setDepartment("English");
	// Student namee = new Student();
	// namee.setName("xiaohong");
	// lesson.enroll(namee);
	// namee.setName("xiaoming");
	// lesson.enroll(namee);
	// Assert.assertEquals(lesson.getNumberOfStudents(), 2);
	// }

	/** 新的测试case，创建一个English的课程，给这门课程使用enroll(student)方法注册两名学生，然后通过getAllStudents()取得所有学生，assert返回的学生的对象就是你注册的两个。 */
	// @Test
	// public void testGetNumberOfStudents3() {
	// CourseSession lesson = new CourseSession();
	// lesson.setDepartment("English");
	// Student namea = new Student();
	// namea.setName("xiaohong");
	// lesson.enroll(namea);
	// namea.setName("xiaoming");
	// lesson.enroll(namea);
	//
	// Student namee = new Student();
	// namee.setName("xiaohong");
	// List<Student> stu = new ArrayList<Student>();
	// stu.add(namee);
	// namee.setName("xiaoming");
	// stu.add(namee);
	// Assert.assertEquals(stu, lesson.getAllStudents(namea));
	// }

	/** 新的测试case，创建一个English的课程，给这门课程使用enroll(student)方法注册3名学生，通过get(2)获取学生，assert和你enroll的第三个学生是不是同一个。 */
	@Test
	public void testGetNumberOfStudents4() {

	}

	/**
	 * 添加测试方法，需要测试的几个点是： 使用两个参数的构造函数生成的课程对象，开始日期getStartDate()是当前月的下一个月的第一天
	 * 使用三个参数的构造函数生成的课程对象，开始日期getStartDate()是传入的日期，结束日期getEndDate()是传入日期六个月之后
	 */
	public void testDate() {

	}

	/**
	 * 继续修改课程类
	 * 
	 * 添加一个静态字段count来统计总共有的课程数。
	 * 添加一个case，创建三个课程对象，然后assert看看CourseSession.count是否等于3
	 * 定义一个静态方法getCount(),来获取总的课程数。
	 * 添加一个case，创建三个课程对象，然后assert看看CourseSession.getCount()是否等于3
	 * 这个时候将静态字段count设置为private，同时删除报错的case。 //
	 */
	// @Test
	// public void testCount() {
	// CourseSession testCount = new CourseSession();
	// testCount.setDepartment("lesson1");
	// testCount.setDepartment("lesson2");
	// testCount.setDepartment("lesson3");
	//
	// Assert.assertEquals(CourseSession.count, 3);
	//
	// }
}
