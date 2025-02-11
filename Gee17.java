public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    int pos = 1;

    for(int row=0; row<ray.length; row++)
      for(int col=0; col<ray[row].length; col++)
        {ray[row][col]=pos;
          pos++;}

    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    System.out.println("\n");
    twoDee.rowAverages();
    System.out.println("\n");
    twoDee.columnAverages();
    System.out.println("\n");
    twoDee.arrayAverage();
  }
}
