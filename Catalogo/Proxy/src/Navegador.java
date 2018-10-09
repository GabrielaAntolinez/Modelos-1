

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Navegador {
	/**
	 * Send a request to Proveedor
	 * @param site
	 */
	public void sendRequest(){
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese el URL del sitio:");
		String sitio = entrada.nextLine();
		String respuesta = this.getInternetProvider().getFuente(sitio);
		this.loadRespuesta(respuesta);
	}
	/**
	 * Prints the output from Proveedor
	 * @param respuesta
	 */
	private void loadRespuesta(String respuesta){
		System.out.println(respuesta);
	}
	
	/**
	 * Gets the network settings for Proveedor to use.
	 * @return Proveedor
	 */
	private Proveedor getInternetProvider(){
		return new NetworkSettings().getInternet();
	}
}
