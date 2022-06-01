package lab4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GradesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		/**
//		 * default implemenation that always gives the fail result, to remind deveoplers to add some test cases  
//		 */
//		fail("Not yet implemented"); // TODO
//	}
	
	/**
	 * input the invalid grade numbers
	 */
	@Test
	public void invalidNumberTest() {
		Grades grade = new Grades();
		assertThrows(IllegalArgumentException.class, () -> {
			grade.gradeResult(105);
		});
	}
	
	/**
	 * if the grade number is under 60, the test reuslt will pass, otherwise, fail.
	 */
	@Test
	public void fGradeTest() {
		Grades grade = new Grades();
		assertEquals("F", grade.gradeResult(80));
	}
	
	/**
	 * if the grade number is under 70, the test reuslt will pass, otherwise, fail.
	 */
	@Test
	public void dGradeTest() {
		Grades grade = new Grades();
		assertEquals("D", grade.gradeResult(67));
	}
	
	/**
	 * if the grade number is under 80, the test reuslt will pass, otherwise, fail.
	 */
	@Test
	public void cGradeTest() {
		Grades grade = new Grades();
		assertEquals("C", grade.gradeResult(78));
	}
	
	/**
	 * if the grade number is under 90, the test reuslt will pass, otherwise, fail.
	 */
	@Test
	public void bGradeTest() {
		Grades grade = new Grades();
		assertEquals("B", grade.gradeResult(80));
	}
	
	/**
	 * if the grade number is under 100, the test reuslt will pass, otherwise, fail.
	 */
	@Test
	public void aGradeTest() {
		Grades grade = new Grades();
		assertEquals("A", grade.gradeResult(98));
	}
}
