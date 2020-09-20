package com.company;

public class Main {

    public static void main(String[] args) {
       contactManager mycontactManager = new contactManager();



       Contact contact1 = new Contact();
       contact1.name = "Malak";
       contact1.phoneNumber = "+996 77774666";
       mycontactManager.addContact(contact1);



        Contact contact2 = new Contact();
        contact1.name = "Ahmed";
        contact1.phoneNumber = "+996 758558966";
        mycontactManager.addContact(contact2);



        Contact contact3 = new Contact();
        contact1.name = "Naaz";
        contact1.phoneNumber = "+996 77885596";
        mycontactManager.addContact(contact3);



        Contact contact4 = new Contact();
        contact1.name = "Ammu";
        contact1.phoneNumber = "+996 702559111";
        mycontactManager.addContact(contact4);


        Contact result = mycontactManager.searchContact("Malak");
        System.out.println(result.phoneNumber);

    }
}
