package adapter;

public class ConsumiAdv implements IConsumiAdv {

	IConsumo consumi;
	
	public ConsumiAdv(IConsumo consumi)
	{
		this.consumi = consumi;
	}
	@Override
	public int sollevatoAdv(int immesso, int mi, int scarico, int ms,
			int perdita) {
		// TODO Auto-generated method stub
		if(mi<=0) mi = 1;
		if(ms<=0) ms = 1;
		return consumi.Sollevato(immesso*(mi<=0?1:mi), scarico*(ms<=0?1:ms)) + perdita;
	}
	
	


}
