package com.api.gendra;

import com.api.gendra.model.Suggestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SuggestionsService {
    private final SuggestionsRepository suggestionsRepository;
    @Autowired
    public SuggestionsService(SuggestionsRepository suggestionsRepository) {
        this.suggestionsRepository = suggestionsRepository;
    }//constructor


    public ArrayList<Suggestions> getSuggestions(){
        return (ArrayList<Suggestions>) suggestionsRepository.findAll();
    }//getallsuggestions

    public Suggestions saveSuggestions (Suggestions suggestions){
        return suggestionsRepository.save(suggestions);
    }//saveSuggestions

    public Optional<Suggestions> getById(Long id){
        return suggestionsRepository.findById(id);
    }//getById

    public boolean deleteById(Long id){
        try{
            suggestionsRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }//tryCatch
    }//deleteId

}//class SuggestionsService
