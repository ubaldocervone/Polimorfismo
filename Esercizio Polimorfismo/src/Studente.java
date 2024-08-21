
public class Studente extends Persona {
	private int matricola ; 
	private String universita ; 
	
	public Studente(String CodiceFiscale, String Nome, String Cognome, int matricola, String universita) {
		super(CodiceFiscale, Nome, Cognome) ; 
		this.matricola = matricola ; 
		this.universita = universita; 
	}
	
	public int getMatricola() {
		return matricola ; 
	}
	
	public void setMatricola(int matricola) {
		this.matricola = matricola ;
	}
	
	public String getUniversita() {
		return universita; 
	}
	
	public void setUniversita(String universita) {
		this.universita = universita ; 
	}
	
	public String toString() {
		return "Studente [codiceFiscale=" + this.getCodiceFiscale() +
				", nome=" + this.getNome() +
				", cognome=" + this.getCognome() +
				", matricola=" + matricola +
				", università="+ universita + "]";
	}
}
