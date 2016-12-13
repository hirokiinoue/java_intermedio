package negozio;

public class ArticoloLoggatoDecorator extends ArticoloDecorator {

	public ArticoloLoggatoDecorator(IArticolo a){
		super(a);
	}
	
	public String scheda()
	{
		//Logga(super.scheda());
		return "TI LOGGO, MA SAPPI CHE NON TI GIUDICO PER QUESTO ARTICOLO " + super.scheda();
	}
}
