/*
@Link -
https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
 */

import java.util.Scanner;

public class JumpingOnTheClouds {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar= new int[n];
        for(int x= 0;x<n;x++)
        {
            ar[x] = Integer.parseInt(sc.next());
        }

        findWay(n,ar);

    }

    public static void findWay(int n, int[] ar){

        int count= 0;
                for (int x = 0;x<n;){
                    if(ar[x+2]==1 || x+2==n){
                        x+=1;
                        count++;
                    }
                    else {
                        x+=2;
                        count++;
                    }
        }
                //Since the initial zero will also increase the counter by one, that's why we decrease the counter by 1
                System.out.println(count-1);
    }

}
