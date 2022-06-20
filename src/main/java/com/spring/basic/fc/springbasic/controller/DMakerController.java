package com.spring.basic.fc.springbasic.controller;


import com.spring.basic.fc.springbasic.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {

    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public List<String> getAllDevelopers() {
      // Get / developers HTTP/1.1
      log.info("GET /developers HTTP/1.1");

      return Arrays.asList("snow", "Elsa", "Olaf");
    }

    @GetMapping("/create-developers")
    public List<String> createDevelopers() {
        // Get / developers HTTP/1.1
        log.info("GET /create-developers HTTP/1.1");

        dMakerService.createDeveloper();

        return List.of("Olaf");
    }
}
