package com.mazon.mcuml;

import com.mazon.mcuml.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> listar(){

        Categoria c1 = new Categoria(1,"Informatica");
        Categoria c2 = new Categoria(2, "Escritorio");

        List<Categoria> list = Arrays.asList(c1, c2);


        return list;
    }


}
