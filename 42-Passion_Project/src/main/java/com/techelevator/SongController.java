package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.Song;
import com.techelevator.model.dao.SongDAO;

@Controller 
public class SongController {

	@Autowired
	private SongDAO dao;
	
	@RequestMapping(path="/")
	public String displaySonglist(Model modelMap) {
		
		List<Song> listOfSongs = dao.getAllSongs();
		List<Song> listOfRequests = dao.getAllRequests();
		
		
		modelMap.addAttribute("songs", listOfSongs);
		modelMap.addAttribute("requests", listOfRequests);

		return "songs";
	}

	@RequestMapping("/requestSong")
	public String displayRequestForm() {
		return "songRequestForm";
	}
	
	@RequestMapping(path="/requestSong", method=RequestMethod.POST)
	public String submitRequest(Song songRequest, RedirectAttributes flashScope) {
		dao.create(songRequest);
		
		flashScope.addFlashAttribute("thankYou", true);
		
		return "redirect:/";
	}
	
}
