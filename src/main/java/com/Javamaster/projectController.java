package com.Javamaster;

import org.springframework.web.bind.annotation.*;


@RestController
public class projectController {

    private final projectService project_service = new projectService();


    @PostMapping("/program")
    public String program(@RequestBody String body){

        return project_service.main(body);
    }

}
