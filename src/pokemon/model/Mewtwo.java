package pokemon.model;

public class Mewtwo extends Mew implements Psychic
{
	public Mewtwo()
	{
		super(150, "Mewtwo");
		setup();
	}
	
	public Mewtwo(String name)
	{
		super(150, name);
		setup();
	}
	
	public Mewtwo(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		super.setup();
		this.setCanEvolve(false);
		this.setAttackPoints(110);
		this.setHealthPoints(106);
	}

	public int psychoCut()
	{
		int damage = 0;
		
		return damage;
	}
}
