
public class Gusto {
	private String nome;
	private double prezzo;
	private double peso;
	private int numeroPalline;
	private int numeroAcquistati;
	private String ingredienti;
	
		
	public Gusto(String nome, double prezzo, double peso, int numeroPalline, int numeroAcquistati, String ingredienti) {
		//super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.peso = peso;
		this.numeroPalline = numeroPalline;
		this.numeroAcquistati = numeroAcquistati;
		this.ingredienti = ingredienti;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getNumeroPalline() {
		return numeroPalline;
	}
	public void setNumeroPalline(int numeroPalline) {
		this.numeroPalline = numeroPalline;
	}
	public int getNumeroAcquistati() {
		return numeroAcquistati;
	}
	public void setNumeroAcquistati(int numeroAcquistati) {
		this.numeroAcquistati = numeroAcquistati;
	}
	public String getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}
	
	public void acquisto() {
		this.numeroAcquistati++;
		this.numeroPalline--;
	}

	public String toString() {
		return nome + " " + prezzo + " " + peso + " " + numeroPalline + " " +numeroAcquistati + " " + ingredienti + " " ;
	}
} 
