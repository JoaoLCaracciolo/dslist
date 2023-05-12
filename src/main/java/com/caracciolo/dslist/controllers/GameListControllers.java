package com.caracciolo.dslist.controllers;

import com.caracciolo.dslist.dto.GameDTO;
import com.caracciolo.dslist.dto.GameListDTO;
import com.caracciolo.dslist.dto.GameMinDTO;
import com.caracciolo.dslist.dto.ReplacementDTO;
import com.caracciolo.dslist.services.GameListService;
import com.caracciolo.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControllers {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGames(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByGameList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(),body.getDestinationIndex());
    }
}
