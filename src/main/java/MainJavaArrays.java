import java.util.Arrays;

public class MainJavaArrays {
  public static void main(String[] args) {
        int[] ar={9,2,5,8,5,4,7,-1,-4};
        char [] ar1 ={'t','z','b','u','w','c','a'};
        System.out.println("Min Value:  " + JavaArraysMethods.minValue(ar1));
        System.out.println("Even count: " + JavaArraysMethods.evensCount(ar));
     //   int res = JavaArraysMethods.minValue(ar);
      //  System.out.println("min =" + res);

      //HomeWork
      System.out.println("MAX VALUE: " + JavaArraysMethods.maxValue(ar));
      // int res = JavaArraysMethods.maxValue(ar1);
      // System.out.println("MAX VALUE =" + res);
      System.out.println("MAX VALUE: "+JavaArraysMethods.maxValue(ar1));
      System.out.println("evensSum:  "+JavaArraysMethods.evensSum(ar));
      System.out.println("Min PositiveValue: "+JavaArraysMethods.minPositiveValue(ar));
      System.out.println("Max PositiveValue: "+JavaArraysMethods.maxPositiveValue(ar));
      System.out.println("Max NegativeValue: "+JavaArraysMethods.maxnegativeValue(ar));




    }
}

