/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Adeel's GPC
 */
public class Record
{
    //Name of the associated file
    private String filename;
    //early initialization singleton design pattern 
    private static final Record instance = new Record("record.txt");
    
    private Record(String n){
        filename = n; 
        }

    //returns intance
    public static Record getInstance()
        {
        return instance;
        }

    // Effects: Reads and prints the contents of the associated file to the standard output.
    public void read(){
        try {
        Scanner sc = new Scanner(new File(filename));
    while (sc.hasNextLine())
        System.out.println(sc.nextLine());
            } 
    
    catch(IOException e){
    System.out.println("An error occurred.");
    e.printStackTrace();
       }

    }

    //Effects: Appends the specified message, msg, to the
    // associated file.  
    public void write(String msg) {
    try
    {
    // Write the code here
    FileWriter fw = new FileWriter(filename, true);
    for (int i = 0; i < msg.length(); i++){
        fw.write(msg.charAt(i)); //writing the data character by character
        }
        fw.close(); //flush the stream and close the object
        }
    catch(IOException e)
        {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
    }

    //driver method of the program
    public static void main(String[] args)
    {
    // Fill the blank below that obtains the sole instance of the Record class.
    // (You should not invoke the Record constructor here.)
    Record r = getInstance(); //get the instance of the class Record

    // Do not modify the code below
    r.write("Hello-1\n");
    r.write("Hello-2\n");
    System.out.println("Currently the file record.txt " + "contains the following lines:");
    r.read();
    }
}
