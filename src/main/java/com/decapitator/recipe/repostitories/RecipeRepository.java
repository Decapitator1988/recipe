package com.decapitator.recipe.repostitories;

import com.decapitator.recipe.domain.Recipe;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
