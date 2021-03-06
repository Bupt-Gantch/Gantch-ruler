package com.tjlcast.wechatPlugin.domain;

/**
 *  新闻模型
 */
public class News {
	private String Title;
	private String Description;
	private String PicUrl;
	private String Url;

	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		return "News{" +
				"Title='" + Title + '\'' +
				", Description='" + Description + '\'' +
				", PicUrl='" + PicUrl + '\'' +
				", Url='" + Url + '\'' +
				'}';
	}
}
