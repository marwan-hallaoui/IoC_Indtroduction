package elhallaoui.marwan;

public class MetierImpl implements IMetier {

	private IDAO dao;

	@Override
	public double Calcule() {
		double t=  dao.getTemperature();
		return t*902;
	}

	public void setDao(IDAO dao) {
		this.dao = dao;
	}

}
