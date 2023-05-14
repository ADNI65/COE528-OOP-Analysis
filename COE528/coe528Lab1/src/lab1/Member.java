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
public class Member extends Passenger{
    
    private int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership){
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    @Override
    protected double applyDiscount(double p){
        if(yearsOfMembership>5){
            p = p/2;
        }
        if(yearsOfMembership>1 && yearsOfMembership<=5){
            p = (p*9)/10;
        }
        return p;
    }
    
}
