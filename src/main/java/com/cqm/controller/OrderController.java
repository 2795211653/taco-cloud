package com.cqm.controller;


import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Component
@RequestMapping("/orders")
public class OrderController {
    @GetMapping
    public String orderForm(Model model){
        model.addAttribute("order",new Order());
        return "orderForm";
    }


}
