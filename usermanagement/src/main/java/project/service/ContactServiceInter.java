package project.service;

import project.models.ContactEntity;
import project.models.EventEntity;

import java.util.List;

public interface ContactServiceInter {
    ContactEntity createContact(ContactEntity contact);
    List<ContactEntity> getAllContacts();
    void deleteContact(Long id);
    ContactEntity getContactById(Long contactid);
}
