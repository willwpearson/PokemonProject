package pokemon.model;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon(int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
}
