package pokemon.model;

public class Mew extends Pokemon implements Psychic
{
	public Mew()
	{
		super(151, "Mew");
		setup();
	}
	
	public Mew(String name)
	{
		super(151, name);
		setup();
	}
	
	public Mew(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(100);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(100);
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
