package domein;

import java.util.ArrayList;
import java.util.List;

import repositories.IngredientRepo;
import domein.Recipe;
import repositories.RecipeRepo;

public class Controller {

	List<Ingredient> ingredients;
	List <Recipe> recipies;
	
	IngredientRepo ingredientRepo;
	RecipeRepo recipeRepo;
	
	public Controller () {
		ingredientRepo = new IngredientRepo();
		recipeRepo = new RecipeRepo();
	}
	
	public List<String> GetIngredientsByType (String type) {
		return ingredientRepo.getIngredientsByType(type);
	}
	
	public List<Recipe> getRecipesForIngredients (String base, String green, String meat) {
		
		List<Recipe> recipes = new ArrayList<>();
		
	}
	
}