package com.rlalsa8843.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rlalsa8843.board.vo.Board;
import com.rlalsa8843.board.vo.Reply;

public interface BoardMapper {
	List<Board> selectList();
	
	int insertBoard(Board board);
	
	Board selectOne(@Param("idx") String idx);
	
	List<Reply> selectReply(@Param("idx") String idx);
	
	int insertReply(Reply reply);
	
	int updateHit(Board board);
}
