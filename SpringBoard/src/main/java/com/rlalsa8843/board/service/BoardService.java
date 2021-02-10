package com.rlalsa8843.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlalsa8843.board.mapper.BoardMapper;

@Service
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	public int sample() {
		return boardMapper.sample();
	}
}
