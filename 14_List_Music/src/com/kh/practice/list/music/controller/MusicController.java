package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();

	public int addList(Music music) {
		int result = 0; // 0 추가실패,1추가성공
		
		// TODO

		return result;
	}

	public int addAtZero(Music music) {
		int result = 0;// 0 추가실패,1추가성공
		// TODO

		return result;
	}

	public List<Music> printAll() {
		int result = 0;
		// TODO
		return list;

	}

	public Music SearchMusic(String title) {
		Music result = null;
		// TODO
		return result;
	}
	
	public Music removeMusic(String title) {
		//TODO
		return null;
	}
	
	public Music setMusic(String title,Music music) {
		//TODO
		return null;
	}
	
	public int ascTitle() {
		int result = 0;
		// TODO
		return result;
	}
	
	

}
