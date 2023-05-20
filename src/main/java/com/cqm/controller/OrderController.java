package com.cqm.controller;


import com.cqm.pojo.Order;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {
    private final DesignTacoController designTacoController;

    public OrderController(DesignTacoController designTacoController) {
        this.designTacoController = designTacoController;
    }
    @GetMapping("/current")
    public String orderForm(Model model){
        model.addAttribute("order",new Order());
        return "orderForm";
    }

    //处理taco订单提交
    @PostMapping
    public String processOrder(@Valid Order order, Errors errors){
        if(errors.hasErrors()){
            return "orderForm";
        }
        log.info("菜单提交："+order);
        return "redirect:/";
    }


}
