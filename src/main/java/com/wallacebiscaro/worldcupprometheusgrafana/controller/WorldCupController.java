package com.wallacebiscaro.worldcupprometheusgrafana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class WorldCupController {

    final private List<String> squads = Arrays.asList("Brazil", "Argentina", "France", "England","Spain", "Germany", "Senegal", "Qatar");

    @GetMapping("/teams")
    public String getSquad() throws InterruptedException {
    	int index = ThreadLocalRandom.current().nextInt(squads.size());
        Thread.sleep(index * 1000L);
        return squads.get(index);
    }

    @GetMapping("/teamx")
    public String error() {
        throw new RuntimeException();
    }
}
