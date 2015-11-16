package discoteca;

public class Porter {

	private String Nom;
	private int Edad;
	private String Sexe;
	private String Calsat;
	private int Diners;
	
	public Porter(String Nom, int Edad, String Sexe, String Calsat, int Diners) {
		this.Nom=Nom;
		this.Edad=Edad;
		this.Sexe=Sexe;
		this.Calsat=Calsat;
		this.Diners=Diners;
	}

	public boolean PotEntrar(Client persona) {
		
		if(persona.getNom().equals(Nom)) {
			return false;
		}
		if(persona.getEdad()<Edad) {
			return false;
		}
		if(persona.getSexe().equals(Sexe)) {
			return false;
		}
		if(persona.getCalsat().equals(Calsat)) {
			return false;
		}
		if(persona.getDiners()<Diners) {
			return false;
		}
		return true;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	public String getCalsat() {
		return Calsat;
	}
	public void setCalsat(String calsat) {
		Calsat = calsat;
	}
	public int getDiners() {
		return Diners;
	}
	public void setDiners(int diners) {
		Diners = diners;
	}

	@Override
	public String toString() {
		return "Porter-No poden entrar els de Nom: " + getNom() + ", Edad: " + getEdad() + " anys, Sexe: " + getSexe()
				+ ", Calsat: " + getCalsat() + ", Diners: " + getDiners() + " €.";
	}
	
}