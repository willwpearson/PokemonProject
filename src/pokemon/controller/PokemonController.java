package pokemon.controller;

import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	private List<Pokemon> pokedex;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();	
		buildPokedex();
		
		
	}
	
	public void buildPokedex()
	{
		pokedex.add(new Darkrai());
		pokedex.add(new Rotom());
		pokedex.add(new Mew());
		pokedex.add(new Mewtwo());
		pokedex.add(new Umbreon());
		pokedex.add(new HoopaUnbound());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
}
