package decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleWindow s = new SimpleWindow();
		
		//Window s2 = new VerticalScrollBarDecorator(s);
		IWindow s2 = new VerticalScrollBarDecorator(new HorizontalScrollBarDecorator(s));
		
		System.out.println(s.getDescription());
		System.out.println(s2.getDescription());
	}

}
