package pokemon.model;

public class Umbreon extends Pokemon implements Dark
{
	public Umbreon()
	{
		super(197, "Umbreon");
		setup();
	}
	
	public Umbreon(String name)
	{
		super(197, name);
		setup();
	}
	
	public Umbreon(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(65);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(95);
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
