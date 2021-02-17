package com.rlalsa8843.board.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rlalsa8843.board.service.BoardService;
import com.rlalsa8843.board.vo.Board;
import com.rlalsa8843.board.vo.Reply;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "/")
	public ModelAndView home(ModelAndView mv) {		
		List<Board> list = boardService.selectList();
		
		logger.debug("게시판 리스트 조회 완료");
		
		mv.addObject("boardList", list);
		mv.setViewName("list");
		
		return mv;
	}
	
	@RequestMapping(value = "/create")
	public ModelAndView create(ModelAndView mv) {
		mv.setViewName("create");
		
		return mv;
	}
	
	@RequestMapping(value ="/addPost", method = RequestMethod.POST)
	public ModelAndView post(ModelAndView mv, Board board) {
		logger.debug( board.toString() );
		
		boardService.insertBoard(board);
		
		mv.setViewName("redirect:/");
		return mv;
	}
	
	@RequestMapping(value ="/addReply", method = RequestMethod.POST)
	public ModelAndView reply(ModelAndView mv, Reply reply) {
		logger.debug( reply.toString() );
		
		boardService.insertReply(reply);
		
		mv.setViewName("redirect:/view?no=" + reply.getBoardIdx());
		return mv;
	}
	
	@RequestMapping(value = "/view")
	public ModelAndView view(@RequestParam("no") String idx, ModelAndView mv) {
		Board board = boardService.selectOne(idx);
		List<Reply> replyList = boardService.selectReply(idx);
		boardService.updateHit(board);
		
		mv.addObject("board", board);
		mv.addObject("replyList", replyList);
		
		mv.setViewName("view");
		
		return mv;
	}
	
}
