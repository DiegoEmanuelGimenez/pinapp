package com.pinapp.exercice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Config {

    @Id
    @Column(name="code", columnDefinition = "varchar(255)")
    private String code;

    @Column(name="val", columnDefinition = "varchar(255) not null")
    private String value;

    public Config(){}

    public Config(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    @JsonIgnore
    public Double getDoubleValue() {
        return Double.parseDouble(value);
    }

    public void setValue(String value) {
        this.value = value;
    }





}
