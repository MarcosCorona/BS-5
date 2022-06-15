package com.example.BS5.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class LogsController {

    @RequestMapping()
    public String index() {

        log.info("Bienvenido al tipo de logs.");
        log.debug("Bicho"); //solo aparece en
        log.trace("una traza");
        log.warn("HELLO!!!!");

        return "Howdy! Check out the Logs to see the output...";
    }
}
