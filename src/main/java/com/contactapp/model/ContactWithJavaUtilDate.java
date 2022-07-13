package com.contactapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactWithJavaUtilDate {

    private String name;
    private String address;
    private String phone;

    @JsonFormat(pattern="dd-MM-yyyy")
    private Date birthday;

    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private Date lastUpdate;


}
//Formatando datas JSON no Spring Boot