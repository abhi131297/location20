package com.location.entityrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.entity.location;

public interface locationRepository extends JpaRepository<location, Long> {

}
