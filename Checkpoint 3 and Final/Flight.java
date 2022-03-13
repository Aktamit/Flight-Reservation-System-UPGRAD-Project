package com.company;

public class Flight {
   private int noOfAvailableFlights;
   private int noOfAvailableSeats;
  private int capacity;
    private String name;
    private String code;
    private int noOfSeats;
    private String description;
    private String dateAndTime;

    public Flight() {
    }

    public Flight(int noOfAvailableFlights, int noOfAvailableSeats, int capacity, String name, String code,
                  String description, String dateAndTime){
    this.noOfAvailableFlights=noOfAvailableFlights;
    this.noOfAvailableSeats=noOfAvailableSeats;
    this.capacity=capacity;
    this.name=name;
    this.code=code;
    this.description=description;
    this.dateAndTime=dateAndTime;
    }


    public void addFlight(){

    }
    public void editFlight(){

    }
    public void deleteFlight(){

    }
    public void searchFlight(){

    }

    public int getNoOfAvailableFlights() {
        return noOfAvailableFlights;
    }

    public void setNoOfAvailableFlights(int noOfAvailableFlights) {
        this.noOfAvailableFlights = noOfAvailableFlights;
    }

    public int getNoOfAvailableSeats() {
        return noOfAvailableSeats;
    }

    public void setNoOfAvailableSeats(int noOfAvailableSeats) {
        this.noOfAvailableSeats = noOfAvailableSeats;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }
}
