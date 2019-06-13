import java.util.ArrayList;

public class FactoryGusti {

	private ArrayList<Gusto> listaGusti;
	private static FactoryGusti palleton;

	private FactoryGusti() {
		listaGusti = new ArrayList<Gusto>();
		creaLista();
	}

	public static FactoryGusti getInstance() {
		if (palleton == null) {
			palleton = new FactoryGusti();
		}

		return palleton;
	}

	private void addGusto(String nome, double prezzo, double peso, int numeroPalline, int numeroAcquistati,
			String ingredienti) {

		Gusto newGusto = new Gusto(nome, prezzo, peso, numeroPalline, numeroAcquistati, ingredienti);

		listaGusti.add(newGusto);

	}

	public Gusto getCioccolato() {

		return listaGusti.get(0);
		
	}
	public Gusto getPistacchio() {

		return listaGusti.get(1);
	}

	public Gusto getKinderBueno() {

		return listaGusti.get(2);
	}

	public Gusto getBanana() {

		return listaGusti.get(3);
	}

	public Gusto getFragola() {

		return listaGusti.get(4);
	}
	
	public Gusto getFiorDiLatte() {

		return listaGusti.get(5);
	}
	
	public Gusto getStracciatella() {

		return listaGusti.get(6);
	}
	
	private void creaLista() {
		
		listaGusti.add(new Gusto("Cioccolato", 2.00, 0.70, 40, 0, "Latte e Cacao"));
		listaGusti.add(new Gusto("Pistacchio", 1.80, 0.65, 40, 0, "Pistacchi di Orgoloso"));
		listaGusti.add(new Gusto("Kinder Bueno", 2.30, 0.75, 40, 0, "Kinder Bueno raccolti per terra"));
		listaGusti.add(new Gusto("Banana", 1.50, 0.60, 40, 0, "Latte e Pezzi di Banana"));
		listaGusti.add(new Gusto("Fragola", 1.50, 0.60, 40, 0, "Latte e Fragole di Bonorva"));
		listaGusti.add(new Gusto("Fior di Latte", 1.90, 0.50, 40, 0, "Latte e Fiori"));
		listaGusti.add(new Gusto("Stracciatella", 2.00, 0.60, 40, 0, "Latte e Gusci di Cacao"));
		
	}
	
	
}
