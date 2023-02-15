package com.jin.taskmanager.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "GROUP_")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private String description;
    private Timestamp startDate;
    private Timestamp finalDate;
    private Boolean isCurrent;

    public Group() {}

    public Group(String code, String description, Timestamp startDate, Timestamp finalDate, Boolean isCurrent) {
        this.code = code;
        this.description = description;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.isCurrent = isCurrent;
    }

}
