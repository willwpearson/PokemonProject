package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;

import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();	
		buildPokedex();
		
		appFrame = new PokemonFrame();
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
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index ++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
}
