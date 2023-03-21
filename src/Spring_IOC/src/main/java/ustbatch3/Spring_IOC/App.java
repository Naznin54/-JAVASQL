package ustbatch3.Spring_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml");  
    	Sim s=context.getBean("Sim",Sim.class);
    	s.calling();
    	s.dialing();
    	
    	
    }
}
