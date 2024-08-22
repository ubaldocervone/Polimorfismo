/*Esercizio 2 (esercizio 10.2 del libro di testo). Sfruttando le classi dell'Esercizio 1 si scriva la classe 
ElencoPersone le cui istanze rappresentano elenchi di persone. La classe avrà i seguenti metodi: 
 un costruttore per creare una lista specificando il numero massimo di persone che è 
possibile inserire nell'elenco; 
 un metodo aggiungi(Persona p) che aggiunge p all'elenco; 
 un metodo toString() che stampa la lista delle persone nell'elenco. 
Si scriva poi una classe ProvaListaPersone con il solo metodo main che crea una lista di 
persone la cui dimensione è scelta dall'utente; chiede poi ripetutamente all'utente di inserire, a 
sua scelta, una Persona, uno Studente o un Docente, chiedendo i dati opportuni; infine 
stampa la lista delle persone inserite.
 */





public class ElencoPersone {
	private Persona[] persone ; 
	int count ;
	
	public ElencoPersone(int n) {
		persone = new Persona[n];
		count = 0 ; 
	}
	
	public boolean aggiungi(Persona p) {
		boolean aggiunto  = false ; 
		if (count < persone.length) {
			persone[count] = p ; 
			count++ ; 
			aggiunto = true ; 
			}
		return aggiunto ; 
	}
	
	public String toString() {
		String s = "Elenco Persone\n" ; 
		s+= "---------------------------" ; 
		for(int i = 0 ; i<count; i++)
			s+= persone[i].toString()+"\n";
		return s ; 
	}
	
	






}


