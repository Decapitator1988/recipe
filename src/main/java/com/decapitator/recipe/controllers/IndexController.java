package com.decapitator.recipe.controllers;

import com.decapitator.recipe.domain.Category;
import com.decapitator.recipe.domain.UnitOfMeasure;
import com.decapitator.recipe.repostitories.CategoryRepository;
import com.decapitator.recipe.repostitories.UnitOfMeasureRepository;
import com.decapitator.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
