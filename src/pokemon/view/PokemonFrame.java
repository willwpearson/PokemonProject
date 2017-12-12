package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JFrame;

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokemonPanel appPanel;
	
	public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		setupFrame();
	}
	
	private void setupFrame()
	{
	}
}
