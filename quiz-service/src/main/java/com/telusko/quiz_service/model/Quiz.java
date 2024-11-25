package com.telusko.quiz_service.model;



import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ElementCollection  //***when we have specfictype which is only one, we can use this
    private List<Integer> questionsIds;

}
