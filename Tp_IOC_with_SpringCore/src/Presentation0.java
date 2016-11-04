

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class Presentation0 {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext bf=new ClassPathXmlApplicationContext(new String[]{"springIOC.xml"});
		IMetier metier=(IMetier) bf.getBean("metier");
		System.out.println(metier.Calcule());

	}

}
