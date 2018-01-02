package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		//Initialize GUI data members
		appLayout = new SpringLayout();
		healthLabel = new JLabel("Health:");	
		attackLabel = new JLabel("Attack:");
		nameLabel = new JLabel("Name:");
		numberLabel = new JLabel("Number:");
		evolvableLabel = new JLabel("Evolve:");
		modifierLabel = new JLabel("Enhancement Modifier:");
		iconLabel = new JLabel();
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField();
		numberField = new JTextField();
		attackField = new JTextField();
		healthField = new JTextField();
		modifierField = new JTextField();
		
		descriptionArea = new JTextArea();
		typeArea = new JTextArea();
		
		saveButton = new JButton();
		clearButton = new JButton();
		pokedexDropdown = new JComboBox();
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(220, 20, 60));
		this.setLayout(appLayout);
		
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);

		this.add(descriptionArea);
		this.add(typeArea);
		
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 0, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, -125, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, -200, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 0, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 0, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 0, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 0, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 0, SpringLayout.SOUTH, evolvableLabel);
	}
	
	private void setupListeners()
	{
		
	}
}
