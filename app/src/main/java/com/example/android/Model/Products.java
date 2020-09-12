package com.example.android.Model;

import android.widget.ImageView;

import com.squareup.picasso.Target;

public class Products {

    private String Title,Author,Image,Summary;


    public Products(){

    }

    public Products(String Title, String Author, String Summary, String Image) {
        this.Title = Title;
        this.Image = Image;
        this.Author = Author;
        this.Summary = Summary;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }


}
