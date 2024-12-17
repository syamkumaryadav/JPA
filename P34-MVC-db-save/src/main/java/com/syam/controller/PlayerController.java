package com.syam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.syam.entity.Player;
import com.syam.repository.PlayerRepository;

@Controller
public class PlayerController {
	@Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/player-form")
    public ModelAndView showPlayerForm() {
        ModelAndView modelAndView = new ModelAndView("player-form");
        modelAndView.addObject("player", new Player());
        return modelAndView;
    }

    @PostMapping("/save-player")
    public ModelAndView savePlayer(@ModelAttribute Player player) {
        playerRepository.save(player);
        ModelAndView modelAndView = new ModelAndView("player-success");
        modelAndView.addObject("player", player);
        return modelAndView;
    }
}
