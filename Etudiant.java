package Interface;

public class Etudiant implements Resident {
	private String nom;
	
	private String fac;
	
	
	

	public Etudiant(String nom, String fac) {
		super();
		this.nom = nom;
		this.fac = fac;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public String getFac() {
		return fac;
	}

	public void setFac(String fac) {
		this.fac = fac;
	}

	@Override
	public void payerLoyer() {
		System.out.println("l'etudiant "+this.getNom()+"  a payer son loyer");
		
	}

	@Override
	public void louerUneChambre() {
		System.out.println("l'etudiant "+this.getNom()+"  a louer  une chambre");
		
	}
	
	
}
