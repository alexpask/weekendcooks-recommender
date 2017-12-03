package org.weekendcooks.recipes.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.weekendcooks.recipes.documents.Recipe;
import org.weekendcooks.recipes.repositories.RecipesRepository;

@Service
public class RecipesService {

    private final RecipesRepository recipesRepository;

    public RecipesService(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    public Page<Recipe> GetRecipesPages() {
        Pageable pageable = new PageRequest(0,10);
        return recipesRepository.findAll(pageable);
    }
}
