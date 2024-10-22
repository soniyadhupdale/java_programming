import java.io.*;
class Player
{
     public static void main(String args[])
     {
          String pnm = args[0];
          int prn = Integer.parseInt(args[1]);
          int inn = Integer.parseInt(args[2]);

          double av = prn/inn;

          System.out.println(pnm + "\tAverage = "+av);
     }
}