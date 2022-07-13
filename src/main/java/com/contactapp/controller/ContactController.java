package com.contactapp.controller;

import com.contactapp.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class ContactController {

    @GetMapping("/contatos")
    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();

        Contact contact1 = new Contact("John Doe", "123 Sesame Street", "123-456-789", LocalDate.now(), LocalDateTime.now());
        Contact contact2 = new Contact("John Doe 2", "124 Sesame Street", "123-456-789", LocalDate.now(), LocalDateTime.now());
        Contact contact3 = new Contact("John Doe 3", "125 Sesame Street", "123-456-789", LocalDate.now(), LocalDateTime.now());

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        return contacts;
    }

}
