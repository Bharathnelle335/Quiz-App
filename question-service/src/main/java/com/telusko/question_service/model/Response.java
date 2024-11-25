package com.telusko.question_service.model;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@RequiredArgsConstructor
public class Response {

    private Integer id;
    private String response;

}
