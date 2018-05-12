package com.autumn.utag.dao;

import com.autumn.utag.domain.TagWhole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagWholeDAO extends JpaRepository<TagWhole, Integer>{
}
