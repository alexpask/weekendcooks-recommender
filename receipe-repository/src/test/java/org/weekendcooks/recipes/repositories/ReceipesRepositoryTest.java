package org.weekendcooks.recipes.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.weekendcooks.recipes.documents.Recipe;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataMongoTest
@ContextConfiguration(classes = {MongoTestConfig.class})
public class ReceipesRepositoryTest {

    @Autowired
    private MongoTemplate template;

    @Autowired
    private RecipesRepository recipesRepository;

    @Test
    public void ShouldAddRecipeToRepository() {

        // Given a salmon recipe
        Recipe receipt = new Recipe();
        receipt.setTitle("Salmon");

        // When recipe is saved
        Recipe saveRecipe = recipesRepository.save(receipt);

        // Then the receipt is stored in repository
        long count = template.count(
                Query.query(Criteria.where("id").is(saveRecipe.getId())),
                Recipe.class);
        assertThat(count).isEqualTo(1L);
    }

    @Test
    public void ShouldFindbyCategory() {

        // Given two curries and a breakfast
        Recipe curry = new Recipe();
        curry.setCategory("curry");
        Recipe curryOne = new Recipe();
        curryOne.setCategory("curry");
        Recipe breakfast = new Recipe();
        breakfast.setCategory("breakfast");
        recipesRepository.save(curry);
        recipesRepository.save(curryOne);
        recipesRepository.save(breakfast);

        // When I check for curries
        List<Recipe> curries = recipesRepository.findByCategory("curry");

        // Then only curries are returned
        assertThat(curries).containsExactly(curry, curryOne);
    }
}
