package com.Javamaster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectController {

    private final projectService project_service = new projectService();


    @GetMapping("/program/{body}")
    public String program(@PathVariable String body){
        return project_service.main(body);

    }

}
