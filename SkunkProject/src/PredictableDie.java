
public class PredictableDie extends Die
{
	
	private int[] throwSequence = null;
	private int nextInSeq = 0;
	
	public PredictableDie(int[] seq)
	{
		super();
		
		this.throwSequence = seq;	
	}
	
	public PredictableDie()
	{
		this.throwSequence = null;
	}

	public void setThrowSequence(int[] throwSequence)
	{
		this.throwSequence = throwSequence;
		
	}
	
	public void roll()
	{
		if (throwSequence==null)
			throw new RuntimeException("null initializer");
		
		if (nextInSeq==throwSequence.length)
		{
			nextInSeq = 0;
		}
		
		lastRoll = throwSequence[nextInSeq];
		
		this.nextInSeq++;
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
