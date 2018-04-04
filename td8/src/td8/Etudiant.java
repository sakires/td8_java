package td8;

public class Etudiant implements Comparable {
	private String nom;
	private String prenom;
	private int ine;
	
	public Etudiant(String nom, String prenom, int ine) {
		this.nom = nom;
		this.prenom = prenom;
		this.ine = ine;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getIne() {
		return ine;
	}
	
	public String toString() {
		return this.ine+":"+this.nom+","+this.prenom;
	}
	
	@Override
	public int compareTo(Object o) {
		Etudiant e = (Etudiant) o;
		if(this.equals(e))
			return 0;
		if(this.ine == e.ine)
		{
			if(this.nom.equals(e.nom))
			{
				if (this.prenom.compareTo(e.prenom)==1)
					return 1;
				else
					return -1;
			}
			if(this.nom.compareTo(e.nom)==1)
				return 1;
			else
				return -1;				
		}
		if(this.ine>e.ine)
			return 1;
		else
			return -1;

	}
	@Override
	public boolean equals(Object o) {
		Etudiant e = (Etudiant) o;
		if(this.nom==e.nom && this.prenom==e.prenom && this.ine==e.ine)
			return true;
		else
			return false;
	}

	

	
	
	
}
