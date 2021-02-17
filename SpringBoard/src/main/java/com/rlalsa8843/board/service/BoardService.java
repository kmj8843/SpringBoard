package com.rlalsa8843.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rlalsa8843.board.mapper.BoardMapper;
import com.rlalsa8843.board.vo.Board;
import com.rlalsa8843.board.vo.Reply;

@Service
public class BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	public List<Board> selectList() {
		return boardMapper.selectList();
	}
	
	public int insertBoard(Board board) {
		return boardMapper.insertBoard(board);
	}
	
	public Board selectOne(String idx) {
		return boardMapper.selectOne(idx);
	}
	
	public List<Reply> selectReply(String idx) {
		return boardMapper.selectReply(idx);
	}
	
	public int insertReply(Reply reply) {
		return boardMapper.insertReply(reply);
	}
	
	public int updateHit(Board board) {
		return boardMapper.updateHit(board);
	}
}
