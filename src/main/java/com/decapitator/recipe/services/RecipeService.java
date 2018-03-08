package com.decapitator.recipe.services;

import com.decapitator.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
