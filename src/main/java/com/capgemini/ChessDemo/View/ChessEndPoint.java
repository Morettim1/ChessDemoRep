package com.capgemini.ChessDemo.View;

import com.capgemini.ChessDemo.Controller.ChessRepository;
import com.capgemini.ChessDemo.Model.Chess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChessEndPoint
    {
        @Autowired
        private ChessRepository chessRepository;

        @GetMapping("ophalen")
        public Iterable<Chess> alleSpelersOphalen()
        {
            Iterable <Chess> alleSpelersOphalen = chessRepository.findAll();
            return alleSpelersOphalen;
        }

        @PostMapping("nieuwespeler")
        public String spelerMaken(@RequestBody Chess speler)
        {
            chessRepository.save(speler);
            return "het is gelukt";
        }
    }
