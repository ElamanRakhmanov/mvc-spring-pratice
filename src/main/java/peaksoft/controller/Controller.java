package peaksoft.controller;

import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {


    @GetMapping
    public String get(){
        return "index";
    }

    @PutMapping
    public String put(){
        return "index";
    }

    @DeleteMapping
    public String delete(){
        return "index";
    }

    @PostMapping
    public String post(){
        return "index";
    }
}
