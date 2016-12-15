package observer;

public class LoStudentePossibilista extends Observer {

	public LoStudentePossibilista(Professore prof){
		this.prof = prof;
		this.prof.attach(this);
	}
	
	public void update(){

		int i = prof.getState();
		System.out.print("Lo studente possibilista:");
		if (i < 38){
			System.out.println("Ci vado.");			
		} else {
			System.out.println("Non ci vado.");						
		}
	}
}
