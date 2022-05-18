package com.narxoz.kz.ssss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JewerlyController {
    @GetMapping("/jewelry")
    public String jewerly(Model model){
        return "jewelry";
    }



}
