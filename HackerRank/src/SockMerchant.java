import java.util.Scanner;
import java.util.Arrays;

public class SockMerchant {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int color[]= new int[n];

        for(int i = 0; i<n;i++)
        {
         color[i]= Integer.parseInt(sc.next() );
        }

        //Call to funtion findPair that would return the number of pair in the given array
        int res = findPair(n,color);


        System.out .println(res);

    }

    /*Function to calculate the number of pairs in an array
    * @param n: Length o Array
    * @param color: Actual Array */
    public static int findPair(int n, int[] color){

        //Temp : temporary Variable to store value
        int temp = 0;

        Arrays.sort(color);
        try {

            for (int i = 0; i < n; ) {
                if (color[i] == color[i + 1]) {
                    temp++;
                    i += 2;
                } else {
                    i++;
                }
            }

            return temp;
        }
        catch (ArrayIndexOutOfBoundsException exc)
        {
            return temp;
        }

    }


}
