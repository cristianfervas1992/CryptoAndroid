package com.example.cristian.contador;

import com.google.gson.annotations.SerializedName;

/**
 * Created by cristian on 06-06-18.
 */

public class News {
    @SerializedName("id")
    private int id;
    @SerializedName("source")
    private String source;
    @SerializedName("title")
    private String title;
    @SerializedName("language")
    private String language;
    private String url;
    @SerializedName("source_img")
    private String sourceImg;
    @SerializedName("tags")
    private String tags;
    @SerializedName("body")
    private String body;
    @SerializedName("published_on")
    private String published_on;
    @SerializedName("categories")
    private String categories;
    @SerializedName("created_at")
    private String created_at;
    @SerializedName("updated_at")
    private String updated_at;

    public News(int id, String source, String title,
                String language,String url, String source_img, String tags,
                String body, String published_on, String categories,
                String created_at, String updated_at){
        this.setId(id);
        this.setSource(source);
        this.setTitle(title);
        this.setLanguage(language);
        this.setUrl(url);
        this.setSourceImg(source_img);
        this.setTags(tags);
        this.setBody(body);
        this.setPublished_on(published_on);
        this.setCategories(categories);
        this.setCreated_at(created_at);
        this.setUpdated_at(updated_at);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(String sourceImg) {
        this.sourceImg = sourceImg;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPublished_on() {
        return published_on;
    }

    public void setPublished_on(String published_on) {
        this.published_on = published_on;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
