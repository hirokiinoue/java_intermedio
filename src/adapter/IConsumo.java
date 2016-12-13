package adapter;

public interface IConsumo {

	public int Sollevato(
			
			int immesso,
			int scarico
			
			);
	
	public int calcoloImmesso(int sollevato, int scarico);
	public int rapportoImmessoSollevato(int immesso, int sollevato);
}
