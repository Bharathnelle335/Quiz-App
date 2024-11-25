package com.telusko.question_service.model;


//ORM framework from JPA takecare of
        // camelCasing(here) to snake_casing(in db) and
        // maps these objects to db column names

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data           //comes from lombok, generates getters and setters itself
@Entity         // if db name is different with class name, add @dbname here
public class Question {

    @Id                                                 //making id as primarykey
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // to generate automatically
    private Integer id;

    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;


}
