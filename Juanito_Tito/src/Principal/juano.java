package Principal;

public class juano {

	
	int capacidadEstomago = 100;
	boolean EstaLleno = true;
	int cantidadDeComidaIngerida;
	public void comer(int cantidadALimento) {
		
		if (tienePanzaLlena())
		{
			System.out.println("No puede ingerir mas comida. Esta lleno");
		}
		else
		{
			cantidadDeComidaIngerida += cantidadALimento;
			if (cantidadDeComidaIngerida > capacidadEstomago)
			{
				cantidadDeComidaIngerida = capacidadEstomago;
			}
		}
		
	}
	public boolean tienePanzaLlena()
	{
		if (capacidadEstomago >= (capacidadEstomago*0.9))
		{
			return true;
		}
		else
			return false;
		
	}
	public void digerir() {
		cantidadDeComidaIngerida = 0;
		System.out.println("Digeriste toda la comida");
		
	}
	
	public void crecer() {
		capacidadEstomago += 10;
		
	}
	
	
	public void aprender() {
		
		if (tienePanzaLlena())
		{
			System.out.println("Lograste Aprender");
		}
		else
		{
			System.out.println("No puede aprender. No tienes la panza llena");
		}
		
	}
}
