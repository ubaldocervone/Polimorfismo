/* E18 – Esercizi su ereditarietà e polimorfismo
Esercizio 1 (esercizio 10.1 del libro di testo). Si scriva una classe Persona dotata dei campi
CodiceFiscale, Nome, Cognome e dei metodi per impostare e leggere tali valori. La classe
inoltre dovrà essere dotata del metodo toString(). Si definisca poi una classe Studente come
estensione di Persona; i campi aggiuntivi di Studente rispetto a Persona sono matricola e
università. Inoltre la classe Studente dovrà avere i metodi per impostare e leggere tali campi
e dovrà sovrascrivere il metodo toString(). Si definisca infine la classe Docente che estende
Persona con campi aggiuntivi materia e salario. Anche in questo caso la classe dovrà avere
metodi per leggere e impostare i vari attributi e dovrà sovrascrivere il metodo toString().*/






public class Persona {
	
	private String CodiceFiscale ; 
	private String Nome ; 
	private String Cognome ; 
	
	public Persona(String CodiceFiscale, String Nome, String Cognome) {
		this.CodiceFiscale = CodiceFiscale; 
		this.Cognome = Cognome ; 
		this.Nome = Nome ; 
	}
	
	public void setCodiceFiscale(String CodiceFiscale) {
		this.CodiceFiscale = CodiceFiscale ; 
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome ;
	}
	
	public void setCognome(String Cognome) {
		this.Cognome = Cognome ; 
	}
	
	public String getCodiceFiscale() {
		return CodiceFiscale; 
	}
	
	public String getNome() {
		return Nome ; 
	}
	
	public String getCognome() {
		return Cognome ; 
	}
	
	
	public String toString() {
		return "Persona[CodiceFiscale=" + CodiceFiscale +", nome=" + Nome + ", cognome=" + Cognome + "]" ; 
	}
	
	
	
}
