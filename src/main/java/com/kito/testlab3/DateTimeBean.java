package com.kito.testlab3;
import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jdk.jfr.Name;

import java.io.Serializable;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



@ManagedBean
@RequestScoped
public class DateTimeBean implements Serializable {
    private static final long serialVersionUID = 1234567L;

    public String getDateTime() {
        return "timebruh";
    }
}
//Instant.now().atZone(ZoneId.of("Europe/Moscow")).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
