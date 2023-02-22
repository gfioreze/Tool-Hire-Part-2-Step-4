import java.util.*;
/**
 * Write a description of class HandTool here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HandTool extends Tool
{
    // instance variables - replace the example below with your own
    private boolean sharpenable;

    /**
     * Constructor for objects of class ElectricTool
     */
    public HandTool()
    {
        // initialise instance variables
    }

    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        this.sharpenable = scanner.nextBoolean();
    }

    public void printDetails()
    {
        super.printDetails();
        
        if (sharpenable)
        {
            System.out.print("Sharpenable: yes.\n");
        } else 
        {
            System.out.print("Sharpenable: no.\n");
        }
    }
}