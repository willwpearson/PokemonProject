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
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/Pokemon Default.png")), JLabel.CENTER);
		
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
		
		setupComboBox();
		setupTypePanels();
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
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 50, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, 0, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, 0, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, attackField, 0, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, 0, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 0, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierField, 0, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 0, SpringLayout.SOUTH, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, iconLabel);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 10, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 125, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.SOUTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, 0, SpringLayout.SOUTH, saveButton);
	}
	
	private void setupListeners()
	{
		
	}
}
