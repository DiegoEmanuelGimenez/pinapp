package com.pinapp.exercice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Config {

    @Id
    @Column(name="code", columnDefinition = "varchar(255)")
    private String code;

    @Column(name="val", columnDefinition = "varchar(255) not null")
    private String value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public Double getDoubleValue() {
        return Double.parseDouble(value);
    }

    public void setValue(String value) {
        this.value = value;
    }





}
