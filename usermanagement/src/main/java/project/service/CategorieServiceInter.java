package project.service;

import project.models.CategorieEntity;

import java.util.List;

public interface CategorieServiceInter {
    CategorieEntity createCategorie(CategorieEntity categorie);

    List<CategorieEntity> getAllCategories();

    void deleteCategorie(Long id);
}
