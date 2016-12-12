package diProva;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// CATTIVO ESEMPIO...
		IPersonaBuilder pb = FactoryPersonaBuilder.creaBuilder("Smart");
		
		pb.setAnagrafica("Ferdinando", "Primerano");
		pb.setEta(36);
		pb.setStatura(170);
		
		System.out.println(pb.build());
		
	}

}
