import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {
	public static void main(String[] args) {
		System.out.println("hello");
		/*org.springframework.core.io.Resource res = (org.springframework.core.io.Resource) new ClassPathResource("samp.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"samp.xml");*/
		
//		Helper obj = context.getBean("bean2", Helper.class);
//		obj.callMeth();
//		
//		
//		Helper obj1 = context.getBean("bean3", Helper.class);
//		obj.callMeth();
//		
//
//		Helper obj2 =fac.    getBean("bean3", Helper.class);
//		obj.callMeth();
		
		
		//HelloWorld obj = context.getBean("hello",HelloWorld.class);
	//	obj.printHello(10,"20");
		
		
	}
}
