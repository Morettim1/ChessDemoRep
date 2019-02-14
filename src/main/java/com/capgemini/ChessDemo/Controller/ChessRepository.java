package com.capgemini.ChessDemo.Controller;

import com.capgemini.ChessDemo.Model.Chess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ChessRepository extends CrudRepository<Chess, Long> {
}

