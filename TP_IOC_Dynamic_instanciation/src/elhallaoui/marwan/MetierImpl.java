package elhallaoui.marwan;

public class MetierImpl implements IMetier {

	private IDAO dao;

	@Override
	public double Calcule() {
		double t=  dao.getTemperature();
		return t*2.5;
	}

	public void setDao(IDAO dao) {
		this.dao = dao;
	}



}
