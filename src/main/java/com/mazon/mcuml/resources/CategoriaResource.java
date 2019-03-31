package com.mazon.mcuml.resources;

import com.mazon.mcuml.domain.Categoria;
import com.mazon.mcuml.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaResource implements Serializable {

    @Autowired
    CategoriaService service;

    @GetMapping
    public List<Categoria> listar(){
       return service.buscarCategorias();
    }

    @GetMapping(value = "/{id}")
    public Categoria buscaCategoria(@PathVariable(value = "id") Integer id){
        return service.buscarCategoria(id);
    }


}
