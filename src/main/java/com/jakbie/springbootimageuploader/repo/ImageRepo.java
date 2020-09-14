package com.jakbie.springbootimageuploader.repo;

import com.jakbie.springbootimageuploader.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image, Long> {
}
