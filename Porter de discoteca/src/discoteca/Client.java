package discoteca;

public class Client {

	private String Nom;
	private int Edad;
	private String Sexe;
	private String Calsat;
	private int Diners;
	
	public Client(String Nom, int Edad, String Sexe, String Calsat, int Diners) {
		this.Nom=Nom;
		this.Edad=Edad;
		this.Sexe=Sexe;
		this.Calsat=Calsat;
		this.Diners=Diners;
	}
	public String getNom() {
		return Nom;
	}
	public int getEdad() {
		return Edad;
	}
	public String getSexe() {
		return Sexe;
	}
	public String getCalsat() {
		return Calsat;
	}
	public int getDiners() {
		return Diners;
	}
	
	@Override
	public String toString() {
		return "Nom: " + getNom() + ", Edad: " + getEdad() + " anys, Sexe:" + getSexe()
				+ ", Calsat:" + getCalsat() + ", Diners:" + getDiners() + " €.";
	}
	
}