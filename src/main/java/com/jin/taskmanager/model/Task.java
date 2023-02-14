package com.jin.taskmanager.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cluster_id")
    private Cluster cluster;
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

    public Task(Person person, Cluster cluster, String code, String title, Date startDate, Date finalDate, Date startUatDate, Date implDate, Long days, Long hours, Double advance, Double realAdvance, String status, String realStatus, Boolean isHalfResource) {
        this.person = person;
        this.cluster = cluster;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public Date getStartUatDate() {
        return startUatDate;
    }

    public void setStartUatDate(Date startUatDate) {
        this.startUatDate = startUatDate;
    }

    public Date getImplDate() {
        return implDate;
    }

    public void setImplDate(Date implDate) {
        this.implDate = implDate;
    }

    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public Long getHours() {
        return hours;
    }

    public void setHours(Long hours) {
        this.hours = hours;
    }

    public Double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public Double getRealAdvance() {
        return realAdvance;
    }

    public void setRealAdvance(double realAdvance) {
        this.realAdvance = realAdvance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(String realStatus) {
        this.realStatus = realStatus;
    }

    public Boolean getHalfResource() {
        return isHalfResource;
    }

    public void setHalfResource(Boolean halfResource) {
        isHalfResource = halfResource;
    }
}
