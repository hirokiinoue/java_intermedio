package negozio;

public class TestDecoratore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		IArticolo a = new ArticoloLoggatoDecorator(new VideogamePC("Dishonored","",20));
//		System.out.println(a.scheda());
		
		IArticolo a = new ArticoloScontatoDecorator(new ArticoloLoggatoDecorator(new VideogamePC("Dishonored","",20)));
		System.out.println(a.scheda());
		
	}

}
