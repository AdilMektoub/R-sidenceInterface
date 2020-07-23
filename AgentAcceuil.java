package Interface;

public class AgentAcceuil extends Personnel implements Employe {

	
	

	public AgentAcceuil(String nom, String prenom, int heuresTravailles, String typeContrat) {
		super(nom, prenom, heuresTravailles, typeContrat);
	
	
	}

	public AgentAcceuil(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	void affecterChambre(Resident res, int chambre) {
		System.out.println("l'AgentAcceuil : "+this.getNom()+ "affecte la chambre numero "+chambre+
				"au r�sident"+res.getClass().toString());
	}

	
	@Override
	public void declarerHeuresTravailles() {
		System.out.println("l'AgentAcceuil : "+this.getNom()+ " declare "+ this.getHeuresTravailles()+" heures");
	}

	@Override
	public void negocierContrat() {
		System.out.println("l'AgentAcceuil :"+this.getNom()+ " negocie son contrat "+ this.getTypeContrat());
		
	}

	@Override
	public void faireAvertissemnt(Resident res) {
		System.out.println("l'AgentAcceuil :   " +this.getNom()+ "a fait un avertissement au resident " +res.getNom()+
				" et c'est un " + res.getClass());

	}

	@Override
	public String toString() {
	
		return "AgentAcceuil [ nom=" + getNom() + ", Prenom="
		+ getPrenom() + ", nbre heures=" + getHeuresTravailles() +  "]";

	
	}
	
	

}
