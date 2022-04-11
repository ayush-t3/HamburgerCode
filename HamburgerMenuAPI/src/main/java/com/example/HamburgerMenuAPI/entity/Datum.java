package com.example.HamburgerMenuAPI.entity;

public class Datum {
    private String icons;
    private String title;
    public String getIcons() {
        return icons;
    }
    public void setIcons(String icons) {
        this.icons = icons;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
	public Datum(String icons, String title) {
		super();
		this.icons = icons;
		this.title = title;
	}
	public Datum() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Datum [icons=" + icons + ", title=" + title + "]";
	}
    
}