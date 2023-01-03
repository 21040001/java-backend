package spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
		
		CustomerService manger = context.getBean("service",CustomerService.class);
		manger.add();
	}
}
