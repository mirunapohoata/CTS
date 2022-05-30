package clase.agentie;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism  {

	private List<iPachetTuristic> pacheteTuristice;
	
	public AgentieTurism() {
		pacheteTuristice=new ArrayList<iPachetTuristic>();
	}
	
	public void adaugaPachet(iPachetTuristic pachet) {
		pacheteTuristice.add(pachet);
	}

	public int getNumarPachete() {
		return pacheteTuristice.size();
	}

	public double calculareSumaTotalaPachete() {
		double suma=0;
		for(iPachetTuristic pachet:pacheteTuristice) {
			suma+=pachet.getPret();
		}

		return suma;
	}
}
