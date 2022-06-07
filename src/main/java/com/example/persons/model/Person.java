package com.example.persons.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * tbl_persons(person_name, id, mail)
 */
@Entity //obligatorio
@Table(name = "tbl_persons") //mapear
public class Person implements Serializable /*obligatorio*/  {

    @Column(name = "person_name") //mapear...
    private String name;

    @Id  //obligatorio
    private String id;

    private String mail;

    /*obligatorio*/
    public Person() {
    }

    public Person(String name, String id, String mail) {
        this.name = name;
        this.id = id;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
