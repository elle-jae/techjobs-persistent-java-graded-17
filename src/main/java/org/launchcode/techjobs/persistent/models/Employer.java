package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank (message = "Location is required.")
    @Size (min = 2, max = 50, message = "Location must include between 3 and 50 characters")
    private String location;


    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    @Override
//    public String toString() {
//        return location;
//    }
}
