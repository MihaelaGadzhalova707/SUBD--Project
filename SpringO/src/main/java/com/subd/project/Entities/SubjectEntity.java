package com.subd.project.Entities;

import javax.persistence.Entity;


/**
 * Created by Misheto on 15.6.2018 г..
 */
@Entity
public class SubjectEntity {

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
