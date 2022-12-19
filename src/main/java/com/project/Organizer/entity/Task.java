package com.project.Organizer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity //класс - сущность для сохранения в БД
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //создает генерацию первичного ключа
    private Integer id;

    private Integer priorityId;
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Task() {
    }

    public Task(Integer id, Integer priorityId, String description, Date date) {
        this.id = id;
        this.priorityId = priorityId;
        this.description = description;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
