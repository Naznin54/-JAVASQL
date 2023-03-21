package ustbatch3.DI_setterinjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml");  
    	Roles s=context.getBean("Roles",Roles.class);
    	
    	s.display();
    	ApplicationContext context1 =   
    		    new ClassPathXmlApplicationContext("applicationContext.xml"); 
Roles r=context1.getBean("Roles1",Roles.class);
    	
    	r.display();
    }
}
