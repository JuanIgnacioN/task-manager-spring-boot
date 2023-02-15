package com.jin.taskmanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jin.taskmanager.enums.Classification;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "TASK_")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Group group;

    @Enumerated(EnumType.STRING)
    private Classification classification;

    private String code;
    private String title;
    private Date startDate;
    private Date finalDate;
    private Date startUatDate;
    private Date implDate;
    private Long days;
    private Long hours;
    private double advance;
    private double realAdvance;
    private String status;
    private String realStatus;
    private Boolean isHalfResource;

    public Task(){}

    public Task(User user, Group group, Classification classification, String code, String title, Date startDate, Date finalDate, Date startUatDate, Date implDate, Long days, Long hours, Double advance, Double realAdvance, String status, String realStatus, Boolean isHalfResource) {
        this.user = user;
        this.group = group;
        this.classification = classification;
        this.code = code;
        this.title = title;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.startUatDate = startUatDate;
        this.implDate = implDate;
        this.days = days;
        this.hours = hours;
        this.advance = advance;
        this.realAdvance = realAdvance;
        this.status = status;
        this.realStatus = realStatus;
        this.isHalfResource = isHalfResource;
    }
}
