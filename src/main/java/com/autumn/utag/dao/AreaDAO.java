package com.autumn.utag.dao;

import com.autumn.utag.domain.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaDAO extends JpaRepository<Area, Integer>{
}
