
public class NetworkSettings {
	public Proveedor getInternet(){
		return new InternetProxy();
	}
	
	public Proveedor getISP(){
		return new Operador();
	}
}
