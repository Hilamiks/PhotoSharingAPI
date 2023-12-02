package com.example.photo.clone.repository;

import com.example.photo.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {
}
