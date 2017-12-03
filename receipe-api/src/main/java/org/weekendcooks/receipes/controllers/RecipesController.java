package org.weekendcooks.receipes.controllers;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.weekendcooks.recipes.services.RecipesService;
import org.weekendcooks.recipes.documents.Recipe;

@RestController
public class RecipesController {

    private final RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @GetMapping("/recipes")
    @ResponseBody
    public Page<Recipe> GetRecipes() {
        return recipesService.GetRecipesPages();
    }
}
