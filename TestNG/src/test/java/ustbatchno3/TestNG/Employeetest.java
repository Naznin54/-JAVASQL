package ustbatchno3.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Employeetest {
	@Test
	public void  testEmployee(){
		
	Employee e=new Employee("NAZ",22,"test");
	assertEquals(e.getName(),"NAZ");
	

}
}