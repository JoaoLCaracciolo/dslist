package com.caracciolo.dslist.repositories;

import com.caracciolo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
