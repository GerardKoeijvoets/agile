package domein;

import java.util.ArrayList;
import java.util.List;

import repositories.IngredientRepo;
import repositories.Recipe;
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
	
	public List<Ingredient> GetIngredientsByType (String type) {
		return recipeRepo.getIngredientsByType(type);
	}
	
	public List<Recipe> getRecipesForIngredients (String base, String green, String meat) {
		
		List<Recipe> recipes = new ArrayList<>();
		
	}
	
}