package com.example.mytest1;

public class News {
    private  String newsname;
    private  int newsimageId;
    public News(String newsname,int newsimageId){
        this.newsname=newsname;
        this.newsimageId=newsimageId;
    }

    public String getNewsname() {
        return newsname;
    }

    public int getNewsimageId() {
        return newsimageId;
    }
}
