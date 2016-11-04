package elhallaoui.marwan;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation0 {

	public static void main(String[] args) {

    try {
		Scanner  sc = new Scanner(new File("Config.txt"));

		String DaoClasseName = sc.next();
		String MetierClasseName = sc.next();

        Class cDao = Class.forName(DaoClasseName);
        Class cMetier = Class.forName(MetierClasseName);

        IMetier metier = (IMetier)cMetier.newInstance();
        IDAO  dao = (IDAO) cDao.newInstance();

        Method  mthd =  cMetier.getMethod("setDao", new Class[]{IDAO.class});
        mthd.invoke(metier, new Object[]{dao});



		System.out.println("Resultat Du calcul Metier : "+metier.Calcule());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

}
