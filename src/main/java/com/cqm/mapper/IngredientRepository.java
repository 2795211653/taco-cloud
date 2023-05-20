package com.cqm.mapper;

import com.cqm.pojo.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
