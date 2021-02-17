package com.rlalsa8843.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rlalsa8843.board.service.BoardService;

@Controller
@RequestMapping(value = "/sample", method = RequestMethod.GET)
public class SampleController {
	@SuppressWarnings("unused")
	@Autowired
	private BoardService boardService;
	
}
