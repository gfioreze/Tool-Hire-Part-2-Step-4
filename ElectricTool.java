import java.util.*;
/**
 * Write a description of class ElectricTool here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricTool extends Tool
{
    // instance variables - replace the example below with your own
    private boolean rechargeable;
    private String power;

    /**
     * Constructor for objects of class ElectricTool
     */
    public ElectricTool()
    {
        // initialise instance variables
    }
    
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        this.rechargeable = scanner.nextBoolean();
        this.power = scanner.next().trim();
    }
    
    public void printDetails()
    {
        super.printDetails();
        System.out.print("Power " + power + "; ");
        
        if (rechargeable == true)
        {
            System.out.print("Rechargeable: yes. \n");
        } else 
        {
            System.out.print("Rechargeable: no.\n");
        }
    }
}