package com.autumn.utag.dao;

import com.autumn.utag.domain.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureDAO extends JpaRepository<Picture, String>{

}
