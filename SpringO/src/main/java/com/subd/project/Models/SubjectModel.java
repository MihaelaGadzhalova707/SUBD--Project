package com.subd.project.Models;

import javax.persistence.Id;

/**
 * Created by Misheto on 15.6.2018 г..
 */
public class SubjectModel {

    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
