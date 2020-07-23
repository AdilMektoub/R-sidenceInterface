package Interface;

public class Test {

	public static void main(String[] args) {
		
		
		
		AgentAcceuil ag=new AgentAcceuil ("ELE", "mmm",30, "CDD");
		Administratif ad = new Administratif("leo","ffff", 30, "CDI");
		//v1.declarerHeuresTravailles();
		ad.negocierContrat();
		ad.verserSalaire();
		
		Etudiant e1=new Etudiant("celine","UFR Nice");
		Etudiant e2=new Etudiant("Jenny","Fac de droit");
		JeuneTravailleur j1 =new JeuneTravailleur("Eric", "boulangerie");
		JeuneTravailleur j2 =new JeuneTravailleur("Cyril", "Restauration");
		JeuneTravailleur j3 =new JeuneTravailleur("marie", "boucherie");
		Resident e3=new Etudiant("Alex","polytech");
		Resident e4=new Etudiant("ooo","enis");
		ag.affecterChambre(e3, 1);
		
		String[] tabNom = { "Anis", "KD", "Dalia", "Sébastien", "Inga", "Paul", "Jack" };
		Employe[] tabEmploye = new Employe[tabNom.length];
		Resident[] res= {e1,e2,e3,e4,j1,j2,j3};
		
		for (int i = 0; i < tabNom.length; i++) {
			if (i < 2) {
				VeilleurDeNuit p1 = new VeilleurDeNuit(tabNom[i]);
				tabEmploye[i] = p1;
			} else if (i < 4)
				tabEmploye[i] = new AgentAcceuil(tabNom[i]);
			else
				tabEmploye[i] = new Administratif(tabNom[i]);
			
		}

		System.out.println("\n--- List d'employees ---");
		for (Employe employe : tabEmploye) {
			System.out.println(employe.toString());
		}
		
		System.out.println("\n---  ---");
		
		for(int i=0 ; i< tabEmploye.length ;i++) {
			
			if(res[i] instanceof Etudiant)
				tabEmploye[i].faireAvertissemnt(res[i]);
			if(res[i] instanceof JeuneTravailleur)
				tabEmploye[i].faireAvertissemnt(res[i]);
			
		}
			
	System.out.println("************* test Context ****************");
	VeilleurDeNuit v1 = new VeilleurDeNuit("Imen","aaa", 35,"CDI",5);
	VeilleurDeNuit v2 = new VeilleurDeNuit("Sarah", "bbbb",30, "CDD",7);
	
	Resident res5= new Etudiant("Anais","USTL lille");
	Context c = new Context(res5,v1);
	Context c2 = new Context();
	c2.avertir(e4, v1);
	c.avertir(res5, v2);
	
	}

}
