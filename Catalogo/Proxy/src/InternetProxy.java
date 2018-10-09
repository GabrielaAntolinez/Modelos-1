
import java.util.Calendar;

public class InternetProxy implements Proveedor {
	
	/**
	 * A proxy method to do logging and filtering
	 */
	public String getFuente(String sitio) {
		this.logRequest(sitio);
		if(this.isBlocked(sitio)){
			return "Acceso denegado.";
		}
		NetworkSettings networkSettings = new NetworkSettings();
		return networkSettings.getISP().getFuente(sitio);
	}

	private void logRequest(String sitio){
		System.out.println(Calendar.getInstance().getTime()+" Request for - "+sitio);
	}
	
	private boolean isBlocked(String sitio){
		switch (sitio) {
		case "www.google.com":
			return false;
		case "www.gaming.com":
			return true;
		default:
			return true;
		}
	}
}
