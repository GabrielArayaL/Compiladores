package com.Javamaster;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class projectController {

    private final projectService project_service = new projectService();


    @PostMapping("/program")
    public String program(@RequestBody String body) throws IOException {
        //return project_service.main(body);
        return project_service.main2();
    }

}
