package Test1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.applet.AppletListener;



public class Main {
	public static void main(String[] args) {		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p=(Person) ctx.getBean("person");
		p.useAxe();
	}
}
