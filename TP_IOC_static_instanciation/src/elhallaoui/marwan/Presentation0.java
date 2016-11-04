package elhallaoui.marwan;

public class Presentation0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DaoImpl dao = new DaoImpl();
		  MetierImpl metier = new MetierImpl();
		   metier.setDao(dao);
		    System.out.println("Resultat Du calcul Metier : "+ metier.Calcule());
	}

}
