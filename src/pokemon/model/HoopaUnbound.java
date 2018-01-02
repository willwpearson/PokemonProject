package pokemon.model;

public class HoopaUnbound extends Pokemon implements Dark, Psychic
{
	public HoopaUnbound()
	{
		super(720, "Hoopa Unbound");
		setup();
	}
	
	public HoopaUnbound(String name)
	{
		super(720, name);
		setup();
	}
	
	public HoopaUnbound(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(160);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(80);
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
