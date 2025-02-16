package org.sample.automation.model;

import java.util.ArrayList;
import java.util.List;

public class User {

        private String name;
        private int id;
        private List<String> subjects;

    public User(String name, int id, List<String> subjects) {
        this.name = name;
        this.id = id;
        this.subjects = subjects;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
