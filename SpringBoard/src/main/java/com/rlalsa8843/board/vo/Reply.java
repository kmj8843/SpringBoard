package com.rlalsa8843.board.vo;

public class Reply {
	private long idx;
	private long boardIdx;
	private String reply;
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public long getBoardIdx() {
		return boardIdx;
	}
	public void setBoardIdx(long boardIdx) {
		this.boardIdx = boardIdx;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	
	@Override
	public String toString() {
		return "Reply [idx=" + idx + ", boardIdx=" + boardIdx + ", reply=" + reply + "]";
	}
	
}
