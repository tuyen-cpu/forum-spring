package com.example.forum.entity;

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
@MappedSuperclass

public abstract class AMessage {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(name="title")
    protected String title;
    @Column(name="created_time")
    protected Calendar createdTime;
    @Column(name="content")
    protected String content;
    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    protected User creator;

}
