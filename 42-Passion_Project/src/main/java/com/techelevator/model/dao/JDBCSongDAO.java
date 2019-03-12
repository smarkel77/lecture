package com.techelevator.model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Song;

@Component
public class JDBCSongDAO implements SongDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCSongDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<Song> getAllSongs() {
		
		String sql = "SELECT title, artist, album FROM songs";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		List<Song> newSongList = new ArrayList<Song>();
		
		while(results.next()) {
			newSongList.add(mapRowToSong(results));
		}
		
		return newSongList;
	}
	
	private Song mapRowToSong(SqlRowSet row) {
		
		String artist = row.getString("artist");
		String title = row.getString("title");
		String album = row.getString("album");
		
		Song newSong = new Song();
		newSong.setAlbum(album);
		newSong.setArtist(artist);
		newSong.setTitle(title);
		
		return newSong;
	}


	@Override
	public void create(Song newSongRequest) {
		String sql = "INSERT INTO requests (title, artist, album) VALUES (?, ?, ?)";
		
		jdbcTemplate.update(sql, newSongRequest.getTitle(), newSongRequest.getArtist(), newSongRequest.getAlbum());
	}


	@Override
	public List<Song> getAllRequests() {
		
		String sql = "SELECT title, artist, album FROM requests";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		List<Song> newRequestList = new ArrayList<Song>();
		
		while(results.next()) {
			newRequestList.add(mapRowToSong(results));
		}
		
		return newRequestList;
	}
	
}
