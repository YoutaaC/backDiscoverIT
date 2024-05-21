package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.models.ContactEntity;
import project.models.EventEntity;
import project.repository.ContactRepository;

import java.util.Date;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactServiceInter {
    @Autowired
    ContactRepository contactRepository;
    @Override
    public ContactEntity createContact(ContactEntity contact) {
        contact.setCreated(new Date());
        return contactRepository.save(contact);
    }

    @Override
    public List<ContactEntity> getAllContacts(){

        return contactRepository.findAll();
    }

    @Override
    public void deleteContact(Long id) {

        contactRepository.deleteById(id);
    }

    @Override
    public  ContactEntity getContactById(Long contactid)
    {

        return contactRepository.findById(contactid).orElse(null);
    }
}