package com.telusko.quiz_service.model;

import lombok.Data;

@Data
public class QuizDto {


    String categoryName;

    public QuizDto(String categoryName, Integer numQuestions, String title) {
        this.categoryName = categoryName;
        this.numQuestions = numQuestions;
        this.title = title;
    }

    Integer numQuestions;
    String title;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(Integer numQuestions) {
        this.numQuestions = numQuestions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}