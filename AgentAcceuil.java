package Interface;

import ClassABSTRAITRE.Employés;
import ClassABSTRAITRE.Residents;

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
				"au rï¿½sident"+res.getClass().toString());
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
	
//	Classe ABSTRAITRE;
//
//	public class AgentAccueil extends Employés {
//
//		private float heuresTravailles;
//		private String contrats;
//		private String avertissement;
//		private int chambres;
//
//		
//
//		//////////////////////////
//		@Override
//		void Declarer(float heuresTravailles) {
//			// TODO Auto-generated method stub
//			System.out.println("Mes heures de travailles d'agent d'accueil");
//		}
//		@Override
//		void Negocier(String contrats) {
//			// TODO Auto-generated method stub
//			System.out.println("Négocier mon contrat d'agent d'accueil");
//		}
//		@Override
//		void FaireAvertissement(String avertissement, Residents residents) {
//			// TODO Auto-generated method stub
//			System.out.println("Faire un avertissement");
//		}
//		
//		//////////////////////////////
//		void AffectChambres(int chambres) {
//			System.out.println("votre chambre est la numeros 8");
//		}
//		
//		
//		/////////////////////////////////////////
//		public AgentAccueil(float heuresTravailles, String contrats, String avertissement, float heuresTravailles2,
//				String contrats2, String avertissement2, int chambres) {
//			super(heuresTravailles, contrats, avertissement);
//			heuresTravailles = heuresTravailles2;
//			contrats = contrats2;
//			avertissement = avertissement2;
//			this.chambres = chambres;
//		}
//		
//		
//		///////////////////////////////////////
//		public float getHeuresTravailles() {
//			return heuresTravailles;
//		}
//
//		public void setHeuresTravailles(float heuresTravailles) {
//			this.heuresTravailles = heuresTravailles;
//		}
//		public String getContrats() {
//			return contrats;
//		}
//		public void setContrats(String contrats) {
//			this.contrats = contrats;
//		}
//		public String getAvertissement() {
//			return avertissement;
//		}
//		public void setAvertissement(String avertissement) {
//			this.avertissement = avertissement;
//		}	
//		public int getChambres() {
//			return chambres;
//		}
//		public void setChambres(int chambres) {
//			this.chambres = chambres;
//		}
//		
//		
//		///////////////////////////////
//		@Override
//		public String toString() {
//			return "AgentAccueil [heuresTravailles=" + heuresTravailles + ", contrats=" + contrats + ", avertissement="
//					+ avertissement + ", chambres=" + chambres + "]";
//		}
	

}
