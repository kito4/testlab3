package com.kito.testlab3;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSayWelcome(){
        if("".equals(name) || name == null){ //check if null?
            return "";
        }else{
            return "Ajax message : Welcome " + name;
        }
    } }