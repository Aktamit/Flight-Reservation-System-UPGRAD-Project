package com.company;

public class Passenger {
    int id;
    String name;
    String mobile;
    String email;
    String username;
    String password;
    String address;
    public Passenger() {
    }

    public Passenger(int id, String name, String mobile, String email, String username,
                     String password, String address){
    this.id=id;
    this.name=name;
    this.mobile=mobile;
    this.email=email;
    this.username=username;
    this.password=password;
    this.address=address;
    }
    public void addPassenger(){

    }
    public void editPassengers(){

    }
    public void deletePassengers(){

    }
    public void searchPassengers(){

    }
    private static class Contact {
        String mobileNo;
        String emergencyNo;

        public Contact() {
        }

        public Contact(String mobileNo, String emergencyNo){
            this.mobileNo=mobileNo;
            this.emergencyNo=emergencyNo;
        }
        public void addContact(){

        }
        public void editContact(){

        }
        public void deleteContact(){

        }
        private static class Address {
            String street;
            String city;
            String state;

            public Address() {
            }

            public Address(String street, String city, String state){
                this.street=street;
                this.city=city;
                this.state=state;
            }
            public  void addAddress(){

            }
            public void editAddress(){

            }
            public void deleteAddress(){

            }
        }

    }
}
