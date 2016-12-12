package negozio;

public class DemoPrototipiProcessore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrototipiProcessore pro = new PrototipiProcessore();
		
		Processore AMD = pro.copia(0);
		Processore Inter = pro.copia(0);
		
		AMD.setNome("A10");
		Inter.setNome("core i7");
		
		System.out.println(pro.processore[0]);
		System.out.println(pro.processore[0].scheda());
		System.out.println(AMD);
		System.out.println(AMD.scheda());
		System.out.println(Inter);
		System.out.println(Inter.scheda());
		
	}

}
