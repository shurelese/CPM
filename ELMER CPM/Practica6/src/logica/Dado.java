package logica;

public class Dado {
	
	private static int valor;
	
	public static void lanzar (int desplazamiento)
	{
		valor = ((int) (Math.random()) + 1);
	}

	public static int getValor() {
		return valor;
	}

}
