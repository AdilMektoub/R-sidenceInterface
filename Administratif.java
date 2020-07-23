package Interface;

public class Administratif extends Personnel implements Employe{
	
	
	public Administratif(String nom, String prenom, int heuresTravailles, String typeContrat) {
		super(nom, prenom, heuresTravailles, typeContrat);
	
	
	}

	public Administratif(String nom, String type) {
		super(nom);
		 
	}
	public Administratif(String nom) {
		super(nom);
	}

	

	public void verserSalaire() {
		System.out.println("l' administratif : "+this.getNom()+ " a verser les salaires  ");
		
	}
	
	
	
	@Override
	public void declarerHeuresTravailles() {
		System.out.println("l' administratif : "+this.getNom()+ " declare "+ this.getHeuresTravailles()+" heures");
		
	}

	@Override
	public void negocierContrat() {
		System.out.println("l'agent administratif :"+this.getNom()+ " negocie son contrat "+ this.getTypeContrat());
		
	}

	@Override
	public void faireAvertissemnt(Resident res) {
		System.out.println("l'agent administratif : "+this.getNom()+ " a fait un avertissement au residet "+ res.getNom()
		+" et c un " + res.getClass());
		
	}

	@Override
	public String toString() {
		return "Administratif [ nom=" + getNom() + ", prenom="
				+ getPrenom() + ", nbre heures=" + getHeuresTravailles() +  "]";
	}

	
	
}
