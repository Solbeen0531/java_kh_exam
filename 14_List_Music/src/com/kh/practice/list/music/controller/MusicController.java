package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	
	public MusicController() {
		// list에 초기 곡 10곡 미리 입력해두기
		list.add(new Music("aa","aaa"));
		list.add(new Music("bb","bbb"));
		list.add(new Music("cc","ccc"));
		list.add(new Music("dd","ddd"));
		list.add(new Music("ee","eee"));
		list.add(new Music("ff","fff"));
		list.add(new Music("xx","xxx"));
		list.add(new Music("qq","qqq"));
		list.add(new Music("aa","aaas"));
		list.add(new Music("dd","ddd"));
	}

	public int addList(Music music) {
		int result = 0; // 0 추가실패,1추가성공
		if (list.add(music)) { // 추가
			list.add(new Music("aa","aaa"));
			result = 1; //
		}

		return result;
	}

	public int addAtZero(Music music) {
		int result = 0; // 0 추가실패,1추가성공
		int cnt = list.size();
		((ArrayList<Music>) list).add(0, music); // 추가
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter - cnt;
		}

		return result;
	}

	public List<Music> printAll() {
		return list;

	}

	public Music SearchMusic(String title) {
		Music result = null;
		for(Music vo : list) {
			if(vo.getTitle().equals(title)) {
				result = vo;
				break;
			}
		}
		// TODO
		return result;
	}

	public Music removeMusic(String title) {
		// TODO
		return null;
	}

	public Music setMusic(String title, Music music) {
		// TODO
		return null;
	}

	public int ascTitle() {
		int result = 0;
		// TODO
		return result;
	}

}
