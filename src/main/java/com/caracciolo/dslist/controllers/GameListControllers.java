package com.caracciolo.dslist.controllers;

import com.caracciolo.dslist.dto.GameDTO;
import com.caracciolo.dslist.dto.GameListDTO;
import com.caracciolo.dslist.dto.GameMinDTO;
import com.caracciolo.dslist.services.GameListService;
import com.caracciolo.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControllers {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    
}
