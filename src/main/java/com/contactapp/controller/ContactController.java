package com.contactapp.controller;

import com.contactapp.model.Contact;
import com.contactapp.model.ContactWithJavaUtilDate;
import com.contactapp.model.PlainContact;
import com.contactapp.model.PlainContactWithJavaUtilDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping
public class ContactController {
/*
    @GetMapping
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

    @GetMapping
    public ResponseEntity<List<Contact>> obterTodos(){
        log.info("Mostrando todos os produtos!");
        return ResponseEntity.ok().body(produtoService.obterTodos());
    }
*/
    @GetMapping("/javaUtilDate")
    public List<ContactWithJavaUtilDate> getContactsWithJavaUtilDate() {
        List<ContactWithJavaUtilDate> contacts = new ArrayList<>();

        ContactWithJavaUtilDate contact1 = new ContactWithJavaUtilDate("John Doe", "123 Sesame Street", "123-456-789", new Date(), new Date());
        ContactWithJavaUtilDate contact2 = new ContactWithJavaUtilDate("John Doe 2", "124 Sesame Street", "123-456-789", new Date(), new Date());
        ContactWithJavaUtilDate contact3 = new ContactWithJavaUtilDate("John Doe 3", "125 Sesame Street", "123-456-789", new Date(), new Date());

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        return contacts;
    }

    @GetMapping("/plain")
    public List<PlainContact> getPlainContacts() {
        List<PlainContact> contacts = new ArrayList<>();

        PlainContact contact1 = new PlainContact("John Doe", "123 Sesame Street", "123-456-789", LocalDate.now(), LocalDateTime.now());
        PlainContact contact2 = new PlainContact("John Doe 2", "124 Sesame Street", "123-456-789", LocalDate.now(), LocalDateTime.now());
        PlainContact contact3 = new PlainContact("John Doe 3", "125 Sesame Street", "123-456-789", LocalDate.now(), LocalDateTime.now());

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        return contacts;
    }

    @GetMapping("/plainWithJavaUtilDate")
    public List<PlainContactWithJavaUtilDate> getPlainContactsWithJavaUtilDate() {
        List<PlainContactWithJavaUtilDate> contacts = new ArrayList<>();

        PlainContactWithJavaUtilDate contact1 = new PlainContactWithJavaUtilDate("John Doe", "123 Sesame Street", "123-456-789", new Date(), new Date());
        PlainContactWithJavaUtilDate contact2 = new PlainContactWithJavaUtilDate("John Doe 2", "124 Sesame Street", "123-456-789", new Date(), new Date());
        PlainContactWithJavaUtilDate contact3 = new PlainContactWithJavaUtilDate("John Doe 3", "125 Sesame Street", "123-456-789", new Date(), new Date());

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        return contacts;
    }
}
