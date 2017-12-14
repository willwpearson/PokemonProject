package pokemon.model;

public class Mew extends Pokemon implements Psychic
{
	public Mew(int number, String name)
	{
		super(number, name);
	}
	
	public boolean psyBeam()
	{
		boolean makeConfused = false;
		
		return makeConfused;
	}
	
	public int psychoCut()
	{
		int damage = 0;
		
		return damage;
	}
	
	public boolean meditate(int amount)
	{
		boolean isMeditating = false;
		
		return isMeditating;
	}
}
