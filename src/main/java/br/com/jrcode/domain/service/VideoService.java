package br.com.jrcode.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jrcode.domain.model.Video;
import br.com.jrcode.domain.repository.VideoRepository;

@Service
public class VideoService {

	@Autowired
	VideoRepository videoRepository;

	public List<Video> buscarTodos() {
		return videoRepository.findAll();
	}
	
	public Video buscarPorId(Long id) throws Exception  {
		return videoRepository.findById(id).orElseThrow(() -> new  Exception("Objeto não encontrado"));
	}

}
