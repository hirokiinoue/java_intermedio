package observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professore prof = new Professore();

		new LoStudenteStoico(prof);
		new LoStudentePossibilista(prof);
		
		prof.setState(37);
		prof.setState(38);
	}

}
