import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    
    double sum=0;
    double rowNum=0;

    for(int[] row: ray){
      for(int col: row)
        sum+=col;
      System.out.println("The average of row "+rowNum+ " is: "+(sum/row.length));
      sum=0;
      rowNum++;
    }
  }

  public void columnAverages(){

    double sum = 0;

   for(int col=0; col<ray[0].length; col++)
    {
      for(int[] row: ray)
        sum+=row[col];

      System.out.println("The average of column "+col+" is: "+sum/ray.length);
      sum=0;
    }
  }
  public void arrayAverage(){

    double sum=0;
    double sumOfVals=0;

    for(int[] row: ray){
      for(int col: row)
       sum+=col;
    sumOfVals+=row.length;}
    System.out.println("The total average of the array is: "+sum/sumOfVals);

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
