package com.example.photo.clone.service;

import com.example.photo.clone.model.Photo;
import com.example.photo.clone.repository.PhotosRepository;
import org.springframework.stereotype.Service;


@Service
public class PhotosService {

	private final PhotosRepository photosRepository;

	public PhotosService(PhotosRepository photosRepository) {
		this.photosRepository = photosRepository;
	}

	public Iterable<Photo> get() {
		return photosRepository.findAll();
	}

	public Photo save(String fileName, String contentType, byte[] data) {
		System.out.println("trying to save");
		Photo photo = new Photo();
		photo.setContentType(contentType);
		photo.setFileName(fileName);
		photo.setData(data);
		System.out.println("file written, saving...");
		photosRepository.save(photo);
		System.out.println("saved!");
		return photo;
	}

	public void remove(Integer id) {
		photosRepository.deleteById(id);
	}

	public Photo get(Integer id) {
		return photosRepository.findById(id).orElse(null);
	}
}
