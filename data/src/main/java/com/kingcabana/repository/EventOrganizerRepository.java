package com.kingcabana.repository;

import com.kingcabana.model.EventOrganizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventOrganizerRepository extends JpaRepository<EventOrganizer, Integer> {
    Optional<EventOrganizer> findByEmailAddress(String email);

}
