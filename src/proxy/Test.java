package proxy;

public class Test {

	public static void main(String[] argv)
	{
		ICalcolo i = new CalcoloProxy("AbilitatoAllaGeometriaAnalitica");
		//System.out.println(i.calcolo(4,5));
		System.out.println(i.calcolo(4, 5));
		System.out.println(i.yretta(4, 5, 6));
	
	}
}
