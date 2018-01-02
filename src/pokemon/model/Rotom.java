package pokemon.model;

public class Rotom extends Pokemon implements Electric
{
	public Rotom()
	{
		super(479, "Rotom");
		setup();
	}
	
	public Rotom(String name)
	{
		super(479, name);
		setup();
	}
	
	public Rotom(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(50);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(50);
	}
	
	public int thunderBolt()
	{
		int damage = 0;
		
		return damage;
	}
	
	public boolean thunderWave()
	{
		boolean paralyze = false;
		
		return paralyze;
	}
	
	public void charge(int amount)
	{
		
	}
}
