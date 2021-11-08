import java.util.ArrayList;
public class Calculator
{
    private ArrayList myList;

    public double Average (ArrayList values)
    { 
  
      ArrayList myList = new ArrayList<Double>(2.3, 5.0, 11.0 ,17.0, 100.0,0.7 );
          for (double i : myList) {
           System.out.println("The values: "+i);
           }
     }
     public void setValues(double values)
     {  
         int values = 0;
          int avg;
          for(int i = 0; i < myList.size(); i++)
          {
            values += myList.get(i);
            avg = values / myList.size();
            System.out.println("The Average is: " + avg);
      
          }
      }
   
   
}