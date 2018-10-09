
public class Operador implements Proveedor{

	@Override
	public String getFuente(String site) {
	switch (site) {
	case "www.google.com":
		return "Ha ingresado a Google.";
	case "www.yahoo.com":
		return "Ha ingresado a Yahoo";
	default:
		return "Fuente no encontrada.";
	}

	}

}
