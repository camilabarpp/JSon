package com.contactapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlainContact {
    private String name;
    private String address;
    private String phone;
    private LocalDate birthday;
    private LocalDateTime lastUpdate;


}
