package com.autumn.utag.dao;

import com.autumn.utag.domain.TagPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagPartDAO extends JpaRepository<TagPart, Integer>{
}
