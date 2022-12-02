package com.day9.oops;

public class AddressBook {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setFirstName("Ravikumar");
        contactDetails.setLastName("Kamble");
        contactDetails.setAddress("Gandhi Nagar");
        contactDetails.setCity("Jamkhandi");
        contactDetails.setZip(587302);
        contactDetails.setEmail("ravi123@gmail.com");
        System.out.println(contactDetails.toString());
    }
}
