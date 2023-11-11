package com.tenis.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(path = "/tenis")
@RestController
public class PartidosController {
    Logger logger = LoggerFactory.getLogger(PartidosController.class);

}
