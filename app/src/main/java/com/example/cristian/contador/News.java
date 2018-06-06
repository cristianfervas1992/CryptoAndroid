package com.example.cristian.contador;

import com.google.gson.annotations.SerializedName;

import org.w3c.dom.Text;

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
    @SerializedName("sourceImg")
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
                String language,String url, String sourceImg, String tags,
                String body, String published_on, String categories,
                String created_at, String updated_at){
        this.id=id;
        this.source=source;
        this.title=title;
        this.language=language;
        this.url=url;
        this.sourceImg=sourceImg;
        this.tags=tags;
        this.body=body;
        this.published_on=published_on;
        this.categories=categories;
        this.created_at=created_at;
        this.updated_at=updated_at;
    }
}
