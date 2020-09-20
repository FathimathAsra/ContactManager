package com.company;

public class contactManager {
    Contact [] contacts;
    int contactsCount;

    contactManager(){
        contactsCount = 0;
        contacts = new Contact[5];
    }

    void addContact(Contact contact){
        contacts[contactsCount] = contact;
        contactsCount++;
    }

    Contact searchContact(String searchName){
        for (int i=0; i<contactsCount; i++){
             if (contacts[i].name.equals(searchName)){
                return contacts[i];
        }
}
     return  null;
  }
}

