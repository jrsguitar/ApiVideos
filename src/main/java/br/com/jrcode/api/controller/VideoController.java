package br.com.jrcode.api.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jrcode.domain.model.Video;
import br.com.jrcode.domain.service.VideoService;

@RestController
@RequestMapping("/videos")
public class VideoController {
	@Autowired
	private VideoService videoService;
	
	@GetMapping
	public ResponseEntity<List<Video>> buscarTodos(){
		List<Video> todos = videoService.buscarTodos();
		return ResponseEntity.ok(todos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Video> buscarPorId(@PathVariable Long id) throws Exception{
		Video video = videoService.buscarPorId(id);
		return ResponseEntity.ok(video);
	}

}
