package com.caracciolo.dslist.repositories;

import com.caracciolo.dslist.entities.Game;
import com.caracciolo.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
