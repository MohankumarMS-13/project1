package basics1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
	public static void main(String[] args) {
//		ClassPathResource resource = new ClassPathResource("ioc1.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource); //deprecated warning
//		Mobile mobile = (Mobile) beanFactory.getBean("mymobile");
//		// To prove bean factory is singleton
//		//Mobile mobile2 = (Mobile) beanFactory.getBean("mymobile");
//		//System.out.println(mobile);
//		//System.out.println(mobile2);
//		mobile.musicPlayer();

		ApplicationContext context = new ClassPathXmlApplicationContext();
		// ClassPathXmlApplicationContext() is used, since we are writing ioc1.xml file
		// inside src/main/java
		Mobile mobile = (Mobile) context.getBean("mymobile");
		mobile.musicPlayer();
	}
}
