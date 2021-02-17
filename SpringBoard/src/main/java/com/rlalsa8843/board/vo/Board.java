package com.rlalsa8843.board.vo;

public class Board {
	private long idx;
	private String title;
	private String cntnt;
	private String writer;
	private int hit;
	private boolean dltYn;
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCntnt() {
		return cntnt;
	}
	public void setCntnt(String cntnt) {
		this.cntnt = cntnt;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public boolean isDltYn() {
		return dltYn;
	}
	public void setDltYn(boolean dltYn) {
		this.dltYn = dltYn;
	}
	
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", title=" + title + ", cntnt=" + cntnt + ", writer=" + writer + ", hit=" + hit
				+ ", dltYn=" + dltYn + "]";
	}
	
}
