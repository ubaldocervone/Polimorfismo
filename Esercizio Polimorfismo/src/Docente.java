
public class Docente extends Persona{
	private String materia ; 
	private double salario ;
	
	public Docente(String CodiceFiscale, String Nome, String Cognome, String materia, double salario) {
		super(CodiceFiscale, Nome, Cognome) ; 
		this.materia = materia ; 
		this.salario = salario ; 
	}
	
	public void setMateria(String materia) {
		this.materia = materia ; 
	}
	
	public void setSalario(double salario) {
		this.salario = salario ; 
	}
	
	public String getMateria()  {
		return materia ; 
	}
	
	public double getSalario() {
		return salario ; 
		
	}
	
	public String toString() {
		return "Docente[CodiceFiscale=" + this.getCodiceFiscale()
		+ ", nome=" + this.getNome() 
		+ ",cognome=" + this.getCognome() 
		+ ", materia=" + materia 
		+ ", salario=" + salario 
		+ "]" ; 
	}
	
	
	
}
