package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rectangle_Test {

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

	@Test
	public void Rectangle_Test1() {
	try{	
		Rectangle r2 = new Rectangle(-5, -10);
		assertTrue(r2.ComputeArea() == 50);
	}
	catch(IllegalRectangle e){
		e.printStackTrace();
		System.out.println("Invalid input");}
	}
	
	@Test
	public void Rectangle_Test2() {
		
	
		Rectangle r2 = null;
		try {
			r2 = new Rectangle(-5, -10);
			assertTrue(r2.ComputeArea() == 50);
		} catch (IllegalRectangle e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid input");
		}
		
	}
	
	@Test
	public void Rectangle_Test3() {
		
	
		Rectangle r2 = null;
		try {
			r2 = new Rectangle(5, 10);
			assertTrue(r2.ComputeArea() == 50);
			System.out.println("valid input");
		} catch (IllegalRectangle e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Invalid input");
		}
		
	}
	

}
