package Interface;

import ClassABSTRAITRE.Employés;
import ClassABSTRAITRE.Residents;

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


//Classe ABSTRAITRE;
//
//public class EmployésAdministratifs extends Employés {
//
//	
//	private float heuresTravailles;
//	private String contrats;
//	private String avertissement;
//	private float salaires;
//	
//
//
//	////////////////////////////////
//	@Override
//	void Declarer(float heuresTravailles) {
//		// TODO Auto-generated method stub
//		System.out.println("Mes heures de travailles d'employés administratif");
//	}
//	@Override
//	void Negocier(String contrats) {
//		// TODO Auto-generated method stub
//		System.out.println("Négocier mon contrat d'employés administratif");
//	}
//	@Override
//	void FaireAvertissement(String avertissement) {
//		// TODO Auto-generated method stub
//		System.out.println("Faire un avertissement");
//	}
//	
//	////////////////////////////////
//	void VerseSalaires(String avertissement) {
//		System.out.println("votre salaire est de 2000$");
//	}
//	
//	
//	/////////////////////////////
//	public EmployésAdministratifs(float heuresTravailles, String contrats, String avertissement,
//			float heuresTravailles2, String contrats2, String avertissement2, float salaires) {
//		super(heuresTravailles, contrats, avertissement);
//		heuresTravailles = heuresTravailles2;
//		contrats = contrats2;
//		avertissement = avertissement2;
//		this.salaires = salaires;
//	}
//	
//	
//	///////////////////////////////	
//	public float getSalaires() {
//		return salaires;
//	}
//	public void setSalaires(float salaires) {
//		this.salaires = salaires;
//	}
//	public float getHeuresTravailles() {
//		return heuresTravailles;
//	}
//	public void setHeuresTravailles(float heuresTravailles) {
//		this.heuresTravailles = heuresTravailles;
//	}
//	public String getContrats() {
//		return contrats;
//	}
//	public void setContrats(String contrats) {
//		this.contrats = contrats;
//	}
//	public String getAvertissement() {
//		return avertissement;
//	}
//	public void setAvertissement(String avertissement) {
//		this.avertissement = avertissement;
//	}
//	
//	
//	/////////////////////////////
//	@Override
//	public String toString() {
//		return "EmployésAdministratifs [heuresTravailles=" + heuresTravailles + ", contrats=" + contrats
//				+ ", avertissement=" + avertissement + "]";
//	}
//	@Override
//	void FaireAvertissement(String avertissement, Residents résidents) {
//		// TODO Auto-generated method stub
//		
//	}