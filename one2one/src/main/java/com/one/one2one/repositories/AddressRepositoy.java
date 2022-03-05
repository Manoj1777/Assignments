package com.one.one2one.repositories;

import com.one.one2one.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepositoy extends JpaRepository<Address , Long >
 {
    
}
