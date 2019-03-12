package com.techelevator.model.dao;

import java.util.List;

import com.techelevator.model.Song;

public interface SongDAO {

	List<Song> getAllSongs();
	List<Song> getAllRequests();
	void create(Song newSongRequest);
}
