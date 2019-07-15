/*
@link-
https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */

import java.util.Scanner;
public class RepeatedString {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        long n = sc.nextLong();

        long res = RepeatedString(str,n);
        System.out.println(res);
    }

    public static long RepeatedString(String str, long n){
        long temp1=n/str.length();
        long count =0;
        long count1=0;
        long x = n%str.length();

        //calculating number of occurrences of 'a' in nearest multiple of string length to the size.
        for(int i = 0;i<str.length();i++){

            if(str.charAt(i)=='a'){
                count++;
            }

        }
        for(int i = 0;i<x;i++){

            if(str.charAt(i)=='a'){
                count1++;
            }

        }
        //System.out.println(temp);

        return (count*temp1)+count1;
    }
}
