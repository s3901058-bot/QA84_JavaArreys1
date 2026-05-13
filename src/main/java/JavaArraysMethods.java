public class JavaArraysMethods {

  /*

   HomeWork

   */
    public static int maxValue(int[] ar){
        int max = Integer.MIN_VALUE;
        for(int m: ar){
            if (m > max)
                max = m;
        }
        return max;
    }

    public static char maxValue(char[] ar){
        char max = ar[0];   // обрашяемся к первому элементу массива
        for (char sym:ar)
        {

            if (sym < max)
                max = sym;
        }
        return max;


    }
    public static int evensSum(int [] ar){
        int sum = 0;
        for(int m: ar){
            if(m%2==0){
            sum += m;
        }
        }
        return sum;
    }

    public static int minPositiveValue(int [] ar){
        int min = Integer.MAX_VALUE;// или можно написать int min = ar[0]; тоже будет работать
        for(int m: ar){
            if (m > 0 && m < min)
                min = m;
        }
        return min;
    }



  /*

   HomeWork

   */

    public static int evensCount(int [] ar)
    {
             int count=0;
             for(int num: ar)
             {

               if (num%2==0) // если остаток от деления числа на 2 равен 0, то число чётное.
                count++;
             }
             return count;
    }


    public static char minValue(char[] ar){
        char min = 0;
        char my_sym ='a'; //97
         for (char sym:ar)
         {

             if (sym > min)
                 min = sym;
        }
        return min;


    }
      public static int minValue(int[] ar){
        int min=ar[0];
        for(int num:ar){
            if(num<min){
                min=num;
            }
        }
            return min;
        }
    }

  /*


        public static char minValue(char[] ar){
        char min = 0;
        char my_sym ='a'; //97
         for (char sym:ar)
         {

             if (sym > min)
                 min = sym;
        }
        return min;


    }
    a = 97
    b= 98
    C= 99
    A = 65
    ascii table
    ar ->[t][n][b][c][a][g][d]

    */


    /*
HomeWork
1.
public static int maxValue(int[] ar)
find max value in array
ar -11 2 5 1 7 3
return 11

2
public static char maxValue(char[] ar)
 ar ->[t][n][b][c][a][g][d]
return a

3.
public static int evensSum(int [] ar)
ar - 11 2 5 1 7 3
calculate sum of events in array
return sum 28

4
public static int minPositiveValue(int [] ar)
ar - 11 2 5 1 7 3
find and return min positive value in array
HomeWork


*/