package observer;

public class LoStudenteStoico extends Observer{

	public LoStudenteStoico(Professore prof){
		this.prof = prof;
		this.prof.attach(this);
	}
	
	public void update()
	{
		int i = prof.getState();
		System.out.print("Lo studente stoico:");
		if (i < 38){
			System.out.println("Ci vado.");			
		} else {
			System.out.println("Me ne frega niente, Ci vado.");						
		}
	}
}
