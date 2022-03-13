package com.company;

public class Main {
    public static void main(String[] args) {
    Address address=new Address();
    Contact contact=new Contact();
    Flight flight = new Flight(10,10,20,"Asian",
            "1001","Domestic Flight","15.03.22/13.45");
    Passenger passenger=new Passenger();
    RegularTicket regularticket=new RegularTicket();
    Ticket ticket=new Ticket();
    TouristTicket touristTicket=new TouristTicket();

    System.out.println(address);
        System.out.println(contact);
        System.out.println(flight.getNoOfAvailableFlights());
        System.out.println(passenger);
        System.out.println(regularticket);
        System.out.println(ticket);
        System.out.println(touristTicket);



    }

}
