/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ibrahim Butt
 */
public class FlightTest {
    
    public Flight f;
    public Flight g;
    public static Flight flight;
    
    public FlightTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        flight = new Flight(1030, "Toronto", "Rome", "Date", 200, 1000);
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     * Test of Constructor, of class Flight
     */
    @Test
    public void constructorTest(){
        f = new Flight(1030, "Toronto", "Rome", "Date", 200, 1000);
    }
    
    /**
     * Test of Constructor, of class Flight
     */
    @Test
    public void invalidConstructorTest(){
        g = new Flight(1030, "Toronto", "Toronto", "Date", 200, 1000);
        
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        int expResult = 1030;
        int result = flight.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        String expResult = "Toronto";
        String result = flight.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        String expResult = "Rome";
        String result = flight.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        String expResult = "Date";
        String result = flight.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        int expResult = 200;
        int result = flight.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        int expResult = 200;
        int result = flight.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        double expResult = 1000;
        double result = flight.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 30;
        flight.setFlightNumber(flightNumber);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Rome";
        flight.setOrigin(origin);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Milan";
        flight.setDestination(destination);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "Today";
        flight.setDepartureTime(departureTime);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 10;
        flight.setCapacity(capacity);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 0.0;
        flight.setOriginalPrice(originalPrice);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        boolean expResult = true;
        boolean result = flight.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1030, "New York", "Berlin", "01/10/2021 6.00pm", 200, 900.00);
        String expResult = "Flight 1030, New York to Berlin, 01/10/2021 6.00pm, original price: 900.00$";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
