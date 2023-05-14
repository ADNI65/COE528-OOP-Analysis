/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Adeel's GPC
 */
public class FoodItem extends FoodComponent{ //FoodItem Class 
        private double price; //price of the item
        public FoodItem(String name,double price) { //constructor 
                super(); //call to FoodComponent constructor
                super.setName(name); //set the name of super class 
                this.price = price; //set the price
        }
        //getter
        @Override
        public double getPrice() {
                return price;
        }
        //overriden price method
        @Override
        public void print(int level) {
                for(int i=0;i<level;i++) //put tabs based on the level
                        System.out.print("\t");
                System.out.println("FoodItem: "+super.getName()+", "+this.getPrice()); //then print remaining details
        }
}
