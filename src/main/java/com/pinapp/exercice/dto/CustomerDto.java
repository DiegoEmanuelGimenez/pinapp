package com.pinapp.exercice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pinapp.exercice.constants.ConstantConfig;
import org.joda.time.DateTime;
import org.joda.time.Years;
import java.util.Date;

//@ApiModel(description = "DTO de customer para creación y list de clientes")
public class CustomerDto {

    private Long id;

    private String name;

    private String lastname;

    private Integer age;

    @JsonProperty("birthdate")
    @JsonFormat(pattern= ConstantConfig.FORMAT_DATE_PATTERN)
    private Date birthDate;

    @JsonProperty("date_of_death")
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date dateOfDeath;

    public CustomerDto(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return this.age;
    }

    @JsonIgnore
    public Integer getCalculateAge() {
        if (this.getBirthDate() == null) return 0;
        DateTime dn = new DateTime(this.getBirthDate());
        Years years = Years.yearsBetween(dn, DateTime.now());
        return years.getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDateOfDeath(Double lifeExpentancy) {
        if (this.getBirthDate() == null) return null;
        DateTime dn = new DateTime(this.getBirthDate());
        dateOfDeath = dn.plusYears(Math.toIntExact(Math.round(lifeExpentancy))).toDate();
        setDateOfDeath(dateOfDeath);
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }
}
