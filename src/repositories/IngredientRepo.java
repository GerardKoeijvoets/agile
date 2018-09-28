package repositories;

import java.util.ArrayList;
import java.util.List;

import domein.Ingredient;

public class IngredientRepo {
	List<Ingredient> ingredients;
	
	public IngredientRepo () {
		setIngredients();
	}
	
	private void setIngredients () {
		ingredients = new ArrayList<>();
		
	}
	public List<String> getIngredientsByType (String type) {
		
		List<String> ingredientsByType = new ArrayList<>();
		for (Ingredient i : ingredients) {
			if (i.getType().equals(type)) 
				ingredientsByType.add(i.getName());
		}
		return ingredientsByType;
	}
	

	
	
}
