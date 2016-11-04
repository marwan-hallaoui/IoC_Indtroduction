package elhallaoui.marwan;

public class DaoImpl implements IDAO {

	@Override
	public double getTemperature() {
		double tmp=25;
		return tmp*1.02285;
	}

}
