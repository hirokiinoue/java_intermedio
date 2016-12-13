package proxy;

public class CalcoloProxy implements ICalcolo {

	ICalcolo oggettoreale;
	int vecchioa;
	int vecchiob;
	int vecchiorisultato;
	String password = "";
	
	//public CalcoloProxy(ICalcolo oggettoreale)
	public CalcoloProxy(String password)
	{
		//this.oggettoreale = oggettoreale;
		oggettoreale = new Calcolo();
		vecchioa = 0;
		vecchiob = 0;
		vecchiorisultato = oggettoreale.calcolo(0, 0);
		this.password = password;
	}
	
	@Override
	public int calcolo(int a, int b) {
		// TODO Auto-generated method stub
		int ris = 0;
		if(a==vecchioa && b==vecchiob){
			//Uso della cache
			System.out.println("Conosco già la risposta. Non tocco l'oggetto reale");
			ris = vecchiorisultato;
		} else  {
			//Aggiornamento della cache
			vecchioa = a;
			vecchiob = b;
			vecchiorisultato = oggettoreale.calcolo(a, b);
			ris = vecchiorisultato;
		}
		return ris;
		//return oggettoreale.calcolo(a, b);
	}

	public int yretta(int m, int n, int x){
		{
			if(password.equals("AbilitatoAllaGeometriaAnalitica"))
				return oggettoreale.yretta(m,n,x);
			else
				return 0;
		}
	}
}
