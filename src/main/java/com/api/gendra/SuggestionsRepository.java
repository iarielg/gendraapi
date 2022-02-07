package com.api.gendra;

import com.api.gendra.model.Suggestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface SuggestionsRepository extends JpaRepository<Suggestions, Long> {
    public abstract List<Suggestions> findByNameAndLatitudeAndLongitude(String name, double latitude, double longitude);
}//Interface Suggestions
