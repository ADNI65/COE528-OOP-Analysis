/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Ibrahim Butt
 */
public class Manager {
    private static Flight flights[] = new Flight[100];
    private Ticket tickets[] = new Ticket[100];
    
    
    
    public static void createFlights(){
        int[] number = new int[100];
        String[] or = new String[100];
        String[] dest = new String[100];
        String[] time = new String[100];
        int[] cap = new int[100];
        double[] pr = new double[100];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=0;i<flights.length;i++){
            System.out.println("Welcome to the manager flight registry system. To add a new flight, type 1. To abort, press 0");
            if(scan.nextInt()==0){
                System.out.println("Aborting...\n");
                break;
            }
            else{
                System.out.println("What is the flight number?");
                number[i] = scan.nextInt();
                System.out.println("What is the origin of the flight?");
                or[i] = scan.next();
                System.out.println("What is the destination of the flight?");
                dest[i] = scan.next();
                System.out.println("What time is the flight leaving?");
                time[i] = scan.next();
                System.out.println("What is the capacity of the flight?");
                cap[i] = scan.nextInt();
                System.out.println("What is the price of the flight?");
                pr[i] = scan.nextDouble();
                flights[i] = new Flight(number[i], or[i], dest[i], time[i], cap[i], pr[i]);
                System.out.println("Flight created:");
                System.out.println(flights[i] + "\n");
            }   
        }
    }

    public void displayAvailableFlights(){
        Scanner plane = new Scanner(System.in);
        System.out.println("What is the origin of the flight which you want to check the availability?");
        String or = plane.next();
        System.out.println("What is the destination of the flight which you want to check the availability?");
        String dest = plane.next();
        for(int i=0;i<flights.length;i++){
            if(or.equals(flights[i].getOrigin()) && dest.equals(flights[i].getDestination()) && flights[i].getNumberOfSeatsLeft()!=0){
               System.out.println(flights[i]);
               break;
            }
            else{
                System.out.println("There are no flights available. Checking again...");
            }
        }
    }
    
    public Flight getFlight(){
        Flight plane = null;
        Scanner get = new Scanner(System.in);
        System.out.println("What is the flight number which you want to check the availability?");
        int ticketNum = get.nextInt();
        for(int j=0;j<flights.length;j++){
            if(ticketNum==flights[j].getFlightNumber()){
                plane = flights[j];
                System.out.println(flights[j]);
                break;
            }
            else {
                System.out.println("There are no flights corresponding to that flight number. Checking again...");
                //break;
            }
        }
        return plane;
    }
    
    public void bookSeat(Passenger p){
        int count=0;
        int i =1;
        Scanner ticket = new Scanner(System.in);
        
        //System.out.println("What flight do you want to book a seat for?");
        int flightNumber = ticket.nextInt();
        for(int k=0;k<flights.length;k++){
            if(flightNumber==flights[k].getFlightNumber()){
                i=1;
                System.out.println("Flight exists");
                if(flights[k].getNumberOfSeatsLeft()>0){
                    System.out.println(flights[k].bookASeat());
                    double r = p.applyDiscount(flights[k].getOriginalPrice());
                    tickets[count] = new Ticket(p, flights[k], r);
                    System.out.println(tickets[count]);
                }
                else
                    System.out.println("No seats left in this flight");
            }
        }
        if(i!=1){
            System.out.println("The flight number does not exist");
        }
        count++;
    }
    
    public static void main(String[] args){
        Manager a = new Manager();
        Manager.createFlights();
        
        System.out.println("\n**DEMONSTRATING DISPLAY FLIGHTS METHOD**");
        a.displayAvailableFlights();
     
        System.out.println("\n**DEMONSTRATING GET FLIGHTS METHOD**");
        a.getFlight();
        
        System.out.println("\nI created a template of passengers to try out the booking system.");
        System.out.println("Bob is 20yo and he has been a member for 4 years.\nIbrahim is not a member and he is 19yo.\nAdam is 32 yo and he has been a member for 10 years.\nSam is not a member, but he is 70.");
        //CREATING PASSENGERS
        Passenger Sal = new Member("Bob",20,4);
        Passenger Ahmed = new NonMember("Ibrahim",19);
        Passenger Eric = new Member("Adam",32,10);
        Passenger Mark = new NonMember("Sam",70);
        
        //Try all members 1 at a time. We will start with Bob. To try the others, comment the previous one and remove comment from the one you want to try.
        System.out.println("\n**DEMONSTRATING BOOKING SEATS METHOD**");
        System.out.println("\nLet's try booking a ticket for Bob (a member for 4 years). Which flight number do you want to book?");
        a.bookSeat(Sal);
        //System.out.println("\nLet's try booking a ticket for Ibrahim (a non-member). Which flight number do you want to book?");
        //a.bookSeat(Ibrahim);
        //System.out.println("\nLet's try booking a ticket for Adam (a member for 10 years). Which flight number do you want to book?");
        //a.bookSeat(Adam);
        //System.out.println("\nLet's try booking a ticket for Sam (an elder). Which flight number do you want to book?");
        //a.bookSeat(Sam);
        
    }
}
