package com.caracciolo.dslist.services;

import com.caracciolo.dslist.dto.GameDTO;
import com.caracciolo.dslist.dto.GameListDTO;
import com.caracciolo.dslist.dto.GameMinDTO;
import com.caracciolo.dslist.entities.Game;
import com.caracciolo.dslist.entities.GameList;
import com.caracciolo.dslist.repositories.GameListRepository;
import com.caracciolo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

}
