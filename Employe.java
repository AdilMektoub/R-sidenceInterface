package Interface;

import ClassABSTRAITRE.AgentAccueil;
import ClassABSTRAITRE.Employ�sAdministratifs;
import ClassABSTRAITRE.Residents;
import ClassABSTRAITRE.VeilleursDeNuit;

public interface Employe {
	

	void declarerHeuresTravailles();	
	void negocierContrat();
	void faireAvertissemnt(Resident res);
}

//Classe ABSTRAITRE;
//
//public abstract class Employ�s {
//
//	VeilleursDeNuit veilleursDeNuit;
//	AgentAccueil agentAccueil;
//	Employ�sAdministratifs employerAdministratifs;
//	private float heuresTravailles;
//	private String contrats;
//	private String avertissement;
//	
//	
//	////////////////////////
//	abstract void Declarer(float heuresTravailles);	
//	abstract void Negocier(String contrats);
//	abstract void FaireAvertissement(String avertissement, Residents r�sidents);
//	
//	
//	//////////////////////
//	public Employ�s(float heuresTravailles, String contrats, String avertissement) {
//		super();
//		this.heuresTravailles = heuresTravailles;
//		this.contrats = contrats;
//		this.avertissement = avertissement;
//	}
//	
//	//////////////////////////
//	@Override
//	public String toString() {
//		return "Employ�s [heuresTravailles=" + heuresTravailles + ", contrats=" + contrats + ", avertissement="
//				+ avertissement + "]";
//	}
//	
//	////////////////////////////
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
//	void FaireAvertissement(String avertissement) {
//		// TODO Auto-generated method stub
//		
//	}