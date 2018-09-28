package repositories;

import java.util.ArrayList;
import java.util.List;

import domein.Ingredient;

public class IngredientRepo {
	List<Ingredients> ingredients;
	
	public IngredientRepo () {
		setIngredients();
	}
	
	private void setIngredients () {
		ingredients = new ArrayList<>();
		
	}
	public List<Ingredient> getIngredientsByType (String type) {
		
		List<Ingredient> ingredientsByType = new ArrayList<>();
		for (Ingredient i : ingredients) {
			if (i.getType().equals(Type)) 
				ingredientsByType.add(i);
		}
		return ingredientsByType;
	}
	

	
	
}
