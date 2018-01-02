package pokemon.model;

public class Darkrai extends Pokemon implements Dark
{
	public Darkrai()
	{
		super(491, "Darkrai");
		setup();
	}
	
	public Darkrai(String name)
	{
		super(491, name);
		setup();
	}
	
	public Darkrai(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(90);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(70);
	}
	
	public int crunch()
	{
		int damage = 0;
		
		return damage;
	}
	
	public void suckerPunch(boolean isFirst)
	{
		
	}
	
	public boolean darkVoid()
	{
		boolean makeSleep = false;
		
		return makeSleep;
	}
}
