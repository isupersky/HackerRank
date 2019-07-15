/*
*@Link- https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
*
* */

import java.util.Scanner;

public class CountingValleys {

    public static void main(String [] argd){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ar[] = new char[n];

        for(int x = 0 ; x <n ; x++){
            ar[x]= sc.next().charAt(0);

        }

        int res = findValleyCount(n, ar);
        System.out.println(res);
    }


     static int findValleyCount(int n, char[]ar){
      int temp = 0,count =0;

         for (int x= 0;x<n;x++){

          if(ar[x]== 'U'){
              temp+=1;
          }
          else if (ar[x]=='D'){
              temp-=1;
          }
          if(ar[x]=='U'&& temp==0){
           count++;
          }


      }

        return temp;
    }

}
