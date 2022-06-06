package com.example.forum.model;

import com.example.forum.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopicDTO {
    private Long id;
    private String title;
    private Calendar createdTime;
    private String content;
}
