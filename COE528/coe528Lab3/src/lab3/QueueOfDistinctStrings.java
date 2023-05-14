/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.ArrayList;
/**
 *
 * @author Adeel's GPC
 */
public class QueueOfDistinctStrings {
    private ArrayList<String> items;
 
    // constructor
    public QueueOfDistinctStrings()
    {
        //EFFECTS: Creates a new QueueOfDistinctStrings Object
        items = new ArrayList<String>();
    }

    public void enqueue(String element) throws Exception
    {
        if (element == null)
            throw new Exception();

        if (items.contains(element) == false)
            items.add(element);
    }

    public String dequeue() throws Exception
    {
        if(items.isEmpty()) throw new Exception();
        return(items.remove(0));
    }

    public boolean repOK() throws Exception
    {
        QueueOfDistinctStrings myQueue = new QueueOfDistinctStrings();
        if (myQueue.items == null || !myQueue.items.isEmpty())
            return false;
        myQueue.enqueue("ab");
        myQueue.enqueue("cd");
        myQueue.enqueue("ef");
        return myQueue.items.size() == 3 && myQueue.items.get(0).equals("ab") && myQueue.items.get(1).equals("cd")
                && myQueue.items.get(2).equals("ef");
    }

    @Override
    public String toString()
    {
        String message="";
        if(items == null) return "Queue is Empty";
        for(String str:items)
        {
            message =message+"  "+str;
        }

        return message;
    }

}

