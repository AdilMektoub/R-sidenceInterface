package Interface;

public class VeilleurDeNuit extends Personnel implements Employe {
	
	private int nbreTour;
		
	
	
	public VeilleurDeNuit(String nom, String prenom, int heuresTravailles, String typeContrat, int nbreTour) {
		super(nom, prenom, heuresTravailles, typeContrat);
		this.nbreTour = nbreTour;
	}
	public VeilleurDeNuit(String nom) {
		super(nom);
	}
	public VeilleurDeNuit(String nom, String prenom, int heuresTravailles, int nbreTour) {
		super(nom, prenom, heuresTravailles);
		this.nbreTour = nbreTour;
		
	}
	

	public int getNbreTour() {
		return nbreTour;
	}

	public void setNbreTour(int nbreTour) {
		this.nbreTour = nbreTour;
	}

	

	@Override
	public void declarerHeuresTravailles() {
		System.out.println("le  veilleur de nuit "+this.getNom()+ "declare "+ this.getHeuresTravailles()+" heures");
		
	}

	@Override
	public void negocierContrat() {
		System.out.println("le  veilleur de nuit "+this.getNom()+  "negocie son contrat "+ this.getTypeContrat());
		
	}

	@Override
	public void faireAvertissemnt(Resident res) {
		
		System.out.println("le  veilleur de nuit "+this.getNom()+  " a fait un avertissement au resident "+ res.getNom()+
				" et c un " + res.getClass());
		
	}
	public void faireUntour() {
		
		System.out.println("le veilleur de nuit : "+this.getNom()+ "  a fait un tour: " );

	}
	@Override
	public String toString() {
		
		return "VeilleurDeNuit [ Nom=" + getNom() + ", Prenom="
		+ getPrenom() + ", nbre Heures=" + getHeuresTravailles() + " , nbreTour=" + nbreTour + "]";
		
		
	}

	
	
}
