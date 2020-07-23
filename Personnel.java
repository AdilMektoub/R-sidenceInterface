package Interface;



public abstract  class Personnel {
	 private String nom;
	 private String prenom;
	 private int heuresTravailles;
	 private String typeContrat;
	
	 
	 
	 
	 public Personnel(String nom) {
		 this.nom = nom; 
	 }
	 
	public Personnel(String nom, String prenom, int heuresTravailles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.heuresTravailles = heuresTravailles;
		
	}
	
	
	
	public Personnel(String nom, String prenom, int heuresTravailles, String typeContrat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.heuresTravailles = heuresTravailles;
		this.typeContrat = typeContrat;
	}
	
	


	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getHeuresTravailles() {
		return heuresTravailles;
	}
	public void setHeuresTravailles(int heuresTravailles) {
		this.heuresTravailles = heuresTravailles;
	}
	 
}
