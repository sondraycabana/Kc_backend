package com.kingcabana.repository;

import com.kingcabana.model.EventOrganizerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@EnableJpaRepositories
public interface EventOrganizerAddressRepository extends JpaRepository<EventOrganizerAddress, Integer>{

}
