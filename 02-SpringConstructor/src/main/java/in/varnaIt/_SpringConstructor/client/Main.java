package in.varnaIt._SpringConstructor.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.varnaIt._SpringConstructor.NetworkService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configure1.xml");
		
		NetworkService service = context.getBean("networkservice",NetworkService.class);
		service.connect();
		System.out.println("===================================");
		System.out.println("===================================");
		service.disconnect();

	}

}
