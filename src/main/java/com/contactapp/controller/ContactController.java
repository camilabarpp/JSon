package com.contactapp.controller;

import com.contactapp.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class ContactController {

    @GetMapping("/contatos")
    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Contact("Camila Barpp", "Av Dr João da Silva, 2368", "975451255", LocalDate.now(), LocalTime.now());
        Contact contact2 = new Contact("Guilherme Alves", "Rua Pinto Bandeira, 5269", "945632875", LocalDate.of(1996,8,28), LocalTime.of(14,12,56));

        contacts.add(contact1);
        contacts.add(contact2);

        return contacts;
    }

}
