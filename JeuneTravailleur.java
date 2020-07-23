package Interface;

public class JeuneTravailleur implements Resident{

	private String nom;
	private String commerce;
	
	

	
	
	public JeuneTravailleur(String nom, String commerce) {
		super();
		this.nom = nom;
		this.commerce = commerce;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCommerce() {
		return commerce;
	}

	public void setCommerce(String commerce) {
		this.commerce = commerce;
	}

	@Override
	public void payerLoyer() {
		System.out.println("le jeune travailleur "+this.getNom()+"  a payer son loyer");
		
	}

	@Override
	public void louerUneChambre() {
		System.out.println("le jeune travailleur "+this.getNom()+"  louer une chambre");
		
	}
	
	
	
	
}
