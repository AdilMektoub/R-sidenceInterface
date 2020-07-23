package Interface;

public class Context {
	private Resident resident;  
	private Employe employe;
	
	
	public Context() {
		
	}
	public Context(Resident resident , Employe employe ){  
        this.resident = resident;  
     }  
 
	 public Context(Resident resident){  
	        this.resident = resident;  
	     }  
	 
	 

	public Resident getResident() {
		return resident;
	}

	public void setResident(Resident resident) {
		this.resident = resident;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public void avertir(Resident resident, Employe employe ) {
		 if(resident instanceof Etudiant)
			 employe.faireAvertissemnt(resident);
		 if(resident instanceof JeuneTravailleur)
			 employe.faireAvertissemnt(resident);
	 }
	 
}

