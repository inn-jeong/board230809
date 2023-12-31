package com.boot.board230809.controller;

import com.boot.board230809.model.Board;
import com.boot.board230809.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    BoardRepository boardRepository;
    @GetMapping("/list")
    public String list(Model model){
        List<Board> boards = boardRepository.findAll();
        model.addAttribute("boards", boards);

        return "board/list";
    }
}
