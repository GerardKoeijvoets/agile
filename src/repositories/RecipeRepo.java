package repositories;

import java.util.ArrayList;
import java.util.List;

import domein.Recipe;

public class RecipeRepo {
	List<Recipe> recipes;

	public RecipeRepo () {
		setRecipes();
	}


	private void setRecipes() {
		recipes = new ArrayList<>();
		
		
	}
	
	public List<String> getRecipesForIngredients (String base, String green, String meat) {
		
		return 
	}
}
