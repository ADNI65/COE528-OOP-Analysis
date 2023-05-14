/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Ibrahim Butt
 */
public class Flight {
    
    int flightNumber;
    String origin;
    String destination;
    String departureTime;
    int capacity;
    int numberOfSeatsLeft;
    double originalPrice;
    
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        if(origin.equals(destination)){
            throw new IllegalArgumentException("Origin cannot be the same as Destination");
        }
        else{
            this.destination = destination;
            this.origin = origin;
        }
        numberOfSeatsLeft = capacity;
    }
    
    public int getFlightNumber(){
        return flightNumber;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public String getDepartureTime(){
        return departureTime;
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getNumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    
    public double getOriginalPrice(){
        return originalPrice;
    }
    
    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    public void setOrigin(String origin){
        this.origin = origin;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    
    public boolean bookASeat(){
        if(numberOfSeatsLeft >0){
            numberOfSeatsLeft--;
            return true;
        }
        else return false;
    }
    
    @Override
    public String toString(){
        return "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", original price: " + originalPrice + "$";
    }
    
}
