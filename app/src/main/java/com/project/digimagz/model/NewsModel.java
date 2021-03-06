package com.project.digimagz.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class NewsModel implements Serializable {

    @SerializedName("ID_NEWS")
    private String idNews;
    @SerializedName("NAME_CATEGORY")
    private String nameCategory;
    @SerializedName("TITLE_NEWS")
    private String titleNews;
    @SerializedName("CONTENT_NEWS")
    private String contentNews;
    @SerializedName("VIEWS_COUNT")
    private int viewsCount;
    @SerializedName("SHARES_COUNT")
    private int sharesCount;
    @SerializedName("DATE_NEWS")
    private String dateNews;
    @SerializedName("NEWS_IMAGE")
    private ArrayList<String> newsImage;
    @SerializedName("LIKES")
    private int likes;
    @SerializedName("COMMENTS")
    private int comments;
    @SerializedName("EDITOR")
    private String editor;
    @SerializedName("VERIFICATOR")
    private String verificator;
    @SerializedName("STATUS")
    private String status;
    private int checkLike;

    public NewsModel(String idNews, String nameCategory, String titleNews, String contentNews, int viewsCount, int sharesCount, String dateNews, ArrayList<String> newsImage, int likes, int comments, String editor, String verificator, String status, int checkLike) {
        this.idNews = idNews;
        this.nameCategory = nameCategory;
        this.titleNews = titleNews;
        this.contentNews = contentNews;
        this.viewsCount = viewsCount;
        this.sharesCount = sharesCount;
        this.dateNews = dateNews;
        this.newsImage = newsImage;
        this.likes = likes;
        this.comments = comments;
        this.editor = editor;
        this.verificator = verificator;
        this.status = status;
        this.checkLike = checkLike;
    }

    public String getIdNews() {
        return idNews;
    }

    public void setIdNews(String idNews) {
        this.idNews = idNews;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getTitleNews() {
        return titleNews;
    }

    public void setTitleNews(String titleNews) {
        this.titleNews = titleNews;
    }

    public String getContentNews() {
        return contentNews;
    }

    public void setContentNews(String contentNews) {
        this.contentNews = contentNews;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public int getSharesCount() {
        return sharesCount;
    }

    public void setSharesCount(int sharesCount) {
        this.sharesCount = sharesCount;
    }

    public String getDateNews() {
        return dateNews;
    }

    public void setDateNews(String dateNews) {
        this.dateNews = dateNews;
    }

    public ArrayList<String> getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(ArrayList<String> newsImage) {
        this.newsImage = newsImage;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getVerificator() {
        return verificator;
    }

    public void setVerificator(String verificator) {
        this.verificator = verificator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCheckLike() {
        return checkLike;
    }

    public void setCheckLike(int checkLike) {
        this.checkLike = checkLike;
    }
}
