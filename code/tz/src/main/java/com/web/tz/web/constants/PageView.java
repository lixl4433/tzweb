package com.web.tz.web.constants;

public class PageView {
    private Object records;
    private int pageNow;
    private int pageCount;
    private int rowCount;
	public Object getRecords() {
		return records;
	}
	public void setRecords(Object records) {
		this.records = records;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
    
}
