package proxy;

public class Calcolo implements ICalcolo {

	@Override
	public int calcolo(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Hey amico, stai facendo il calcolo vero");
		return a+b;
	}
	
	public int yretta(int m, int n, int x)
	{
		return m*x+n;
	}


}
