/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.ArrayList;
/**
 *
 * @author Adeel's GPC
 */

public class FoodCategory extends FoodComponent{ //FoodCategory class inherits FoodComponents 
        private ArrayList<FoodComponent> lst = new ArrayList<FoodComponent>();//list of foodcomponents
        public FoodCategory(String name) {//constructor to set the name
                super();
                super.setName(name);
        }
        //add a new FoodComponent to this category
        public void add(FoodComponent comp) {
                lst.add(comp);
        }
        //get the cumulative price of this category
        @Override
        public double getPrice() {
                double price=0; 
                for(FoodComponent comp : lst) { //compute the price of all the FoodComponents in the list
                        price+=comp.getPrice();
                }
                return price;
        }
        //print the hierarichal details of FoodCategory
        @Override
        public void print(int level) {
                for(int i=0;i<level;i++) //put proper tabs as per the level
                        System.out.print("\t");
                System.out.println("FoodCategory ("+this.getName()+", "+this.getPrice()+") contains"); //print the details of this FoodCategory
                for(FoodComponent comp : lst) { //now print details of all components in the list 
                        comp.print(level+1); //make sure to increase the level by 1
                }
        }
        
}
