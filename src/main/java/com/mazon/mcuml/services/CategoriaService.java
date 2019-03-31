package com.mazon.mcuml.services;

import com.mazon.mcuml.domain.Categoria;
import com.mazon.mcuml.exceptions.ResourceNotFoundException;
import com.mazon.mcuml.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> buscarCategorias(){
        List<Categoria> dados = repository.findAll();
        return dados;
    }

    public Categoria buscarCategoria(Integer id){
        return repository
                .findById(id)
                .orElse(null);
    }

}
