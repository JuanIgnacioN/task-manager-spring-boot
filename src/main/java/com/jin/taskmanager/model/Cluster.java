package com.jin.taskmanager.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table
public class Cluster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String description;

    private Timestamp startDate;

    private Timestamp finalDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cluster", cascade = CascadeType.ALL)
    private List<Task> tasks;

    public Cluster() {}

    public Cluster(String code, String description, Timestamp startDate, Timestamp finalDate) {
        this.code = code;
        this.description = description;
        this.startDate = startDate;
        this.finalDate = finalDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Timestamp finalDate) {
        this.finalDate = finalDate;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
