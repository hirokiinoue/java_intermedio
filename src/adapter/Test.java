package adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsumiAdv q = new ConsumiAdv(new Consumo());
		
		int sollevato = q.sollevatoAdv(100,10, 100, 1,50);
		
		System.out.println(sollevato);
	}

}
