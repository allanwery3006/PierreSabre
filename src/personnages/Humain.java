package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	
	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}


	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " - " + texte);
	}
	

	
	private String prendreParole() {
		return "(" + nom +")";
	}


	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle" + nom + " et j’aime boire du" + boisson); 
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson +"! GLOUPS!");
	}

	public void acheter(String bien) {
		
	}
}
	