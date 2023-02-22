import java.awt.*;
import java.util.*;
/**
 * The class has multiple fields regarding information about the Tools in the Tool hire store.
 *
 * @author (Gabriel Fioreze)
 * @version (v2)
 */
public class Tool
{
    // instance variables / fields
    // Refactor the code (it is closed coupled)
    private String toolName;
    private String itemCode;
    private int timesBorrowed;
    private boolean onLoan;
    private double cost;
    private double weight;
    
    /**
     * Constructor for objects of class Tool
     * 
     *     public Tool(String toolName, String itemCode, int timesBorrowed, boolean onLoan, double cost, double weight)
     *       {
     *          // initialise instance variables
     *          this.toolName = toolName;
     *          this.itemCode = itemCode;
     *          this.timesBorrowed = timesBorrowed;
     *          this.onLoan = onLoan;
     *          this.cost = cost;
     *          this.weight = weight;
     *       }
     * 
     */
    
    public Tool() 
    {
        
    }
    
    // Accessor methods
    public String getToolName()
    
    {
        return toolName;
    }
    
    public String getItemCode()
    
    {
        return itemCode;
    }
    
    public int getTimesBorrowed()
    
    {
        return timesBorrowed;
    }
    
    public boolean getOnLoan()
    
    {
        return onLoan;
    }
    
    public double getCost()
    
    {
        return cost;
    }
    
    public double getWeight()
    
    {
        return weight;
    }
    
    // Mutator methods
    
    public void setToolName(String toolName)
    
    {
        this.toolName = toolName;
    }
    
    public void setItemCode(String itemCode)
    
    {
        this.itemCode = itemCode;
    }
    
    public void setTimesBorrowed(int timesBorrowed)
    
    {
        this.timesBorrowed = timesBorrowed;
    }
    
    public void setOnLoan(boolean onLoan)
    
    {
        this.onLoan = onLoan;
    }
    
    public void setCost(double cost)
    
    {
        this.cost = cost;
    }
    
    public void setWeight(double weight)
    
    {
        this.weight = weight;
    }
    
    public void readData(Scanner scanner)
    {
        this.toolName = scanner.next().trim();
        this.itemCode = scanner.next().trim();
        this.timesBorrowed = scanner.nextInt();
        this.onLoan = scanner.nextBoolean();
        this.cost = scanner.nextDouble();
        this.weight = scanner.nextDouble();
    }
    
    // prints out details of each tool to terminal
    public void printDetails()

    {
        System.out.print("Tool name: " + toolName + "; " + "Code: " + itemCode + "; "
        + "Times borrowed: " +timesBorrowed + "; ");
        
        if (onLoan == false)
        {
            System.out.print("On loan: no" );
        } else 
        {
            System.out.print("On loan: yes" );
        }
        
        System.out.print("; " + "Cost: " + cost + "; " + "Weight: " + weight + "; ");
        
    }
}