package adapter;

public class Consumo implements IConsumo {

	@Override
	public int Sollevato(int immesso, int scarico) {
		// TODO Auto-generated method stub
		
		return immesso+scarico;
	}
	
	public int calcoloImmesso(int sollevato, int scarico){
		return sollevato - scarico;
	}

	public int rapportoImmessoSollevato(int immesso, int sollevato) {
		return immesso/sollevato;
	}
}
