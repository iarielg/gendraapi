package com.api.gendra.controller;

import com.api.gendra.SuggestionsService;
import com.api.gendra.model.Suggestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/suggestions")
@CrossOrigin("*")
public class SuggestionsController {
    private final SuggestionsService suggestionsService;
    @Autowired
    public SuggestionsController(SuggestionsService suggestionsService) {
        this.suggestionsService = suggestionsService;
    }//constructor


    @GetMapping()
    public ArrayList<Suggestions> getSuggestions(){
        return suggestionsService.getSuggestions();
    }//getSuggestions

    @PostMapping()
    public Suggestions saveSuggestions(@RequestBody Suggestions suggestions){
        return this.suggestionsService.saveSuggestions(suggestions);
    }//saveSuggestions

    @GetMapping(path = "/{id}")
    public Optional<Suggestions> getById(@PathVariable("id") Long id){
        return this.suggestionsService.getById(id);
    }//getById

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.suggestionsService.deleteById(id);
        if (ok){
            return "Se elimino la cuidad con el id: "+ id;
        }else {
            return "No se pudo eliminar la cuidad con el id: "+ id;
        }//if
    }//deleteById



}//class SuggestionsController
