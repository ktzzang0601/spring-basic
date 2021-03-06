package com.spring.basic.fc.springbasic.controller;

import com.spring.basic.fc.springbasic.dto.CreateDeveloper;
import com.spring.basic.fc.springbasic.dto.DeveloperDetailDto;
import com.spring.basic.fc.springbasic.dto.DeveloperDto;
import com.spring.basic.fc.springbasic.dto.EditDeveloper;
import com.spring.basic.fc.springbasic.service.DMakerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DMakerController {

    private final DMakerService dMakerService;

    @GetMapping("/developers")
    public List<DeveloperDto> getAllDevelopers() {
        // Get / developers HTTP/1.1
        log.info("GET /developers HTTP/1.1");

        return dMakerService.getAllEmployedDevelopers();
    }

    @GetMapping("/developer/{memberId}")
    public DeveloperDetailDto getDeveloperDetail(
            @PathVariable final String memberId
    ) {
        // Get / developers HTTP/1.1
        log.info("GET /developers HTTP/1.1");

        return dMakerService.getDeveloperDetail(memberId);
    }

    @PostMapping("/create-developer")
    public CreateDeveloper.Response createDevelopers(
            @Valid @RequestBody final CreateDeveloper.Request request
    ) {
        // Get / developers HTTP/1.1
        log.info("GET /create-developers HTTP/1.1");

        return dMakerService.createDeveloper(request);
    }

    @PutMapping("/developer/{memberId}")
    public DeveloperDetailDto editDeveloper(
            @PathVariable final String memberId,
            @Valid @RequestBody final EditDeveloper.Request request
    ) {
        // Get / developers HTTP/1.1
        log.info("GET /developers HTTP/1.1");

        return dMakerService.editDeveloper(memberId, request);
    }

    @DeleteMapping("/developer/{memberId}")
    public DeveloperDetailDto deleteDeveloper(
            @PathVariable final String memberId
    ) {
        return dMakerService.deleteDeveloper(memberId);
    }

}
