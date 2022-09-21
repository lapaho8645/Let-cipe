package com.ssafy.letcipe.domain.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    @Query("select distinct r from Recipe r where r.title like concat('%',:keyword,'%')")
    List<Recipe> findByKeyword(String keyword) throws SQLException;
}
