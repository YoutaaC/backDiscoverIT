package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.CategorieEntity;
import project.models.ContactEntity;
import project.repository.CategorieRepository;

import java.util.Date;
import java.util.List;

@Service
public class CategorieServiceImpl  implements CategorieServiceInter{
    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public CategorieEntity createCategorie(CategorieEntity categorie) {

        return categorieRepository.save(categorie);
    }

    @Override
    public List<CategorieEntity> getAllCategories(){

        return categorieRepository.findAll();
    }

    @Override
    public void deleteCategorie(Long id) {

        categorieRepository.deleteById(id);
    }
}

