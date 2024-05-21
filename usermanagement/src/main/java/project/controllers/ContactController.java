package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.models.ContactEntity;
import project.models.EventEntity;
import project.service.ContactServiceInter;
import project.service.EventServiceInter;

import java.util.List;

@RestController
@RequestMapping("/Contactus")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContactController {
    @Autowired
    ContactServiceInter contactServiceInter;

    @PostMapping("/add")
    public ContactEntity createContact(@RequestBody ContactEntity contact){

        return contactServiceInter.createContact(contact);
    }
    @GetMapping("/getAll")
    public List<ContactEntity> getAllContacts()
    {
        return contactServiceInter.getAllContacts();

    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteContact(@PathVariable Long id)
    {

        contactServiceInter.deleteContact(id);
    }

    @GetMapping(value = "/getContactById/{contactid}")
    public ContactEntity getContactById(@PathVariable Long contactid)
    {
        return contactServiceInter.getContactById(contactid);
    }

}
