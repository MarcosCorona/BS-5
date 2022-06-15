package com.example.BS5.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class ErrorLogController {

    @GetMapping("/errors")
    public String index() {

        log.error(String.valueOf(new ExceptionInInitializerError()));
        return "Esto es un fallo...";
    }
}
