/*
@Link-
https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLeftRotation {

    public static void main(String argr[]){
        Scanner sc = new Scanner(System.in);
        int numEliment = sc.nextInt();
        int numRotate = sc.nextInt();

        int arr[]= new int[numEliment];

        for(int i =0; i<numEliment;i++){
            arr[i]=sc.nextInt();
        }

        int[] res = leftRotate(arr,numRotate);

        for(int i =0; i<numEliment;i++){
            System.out.print(res[i]);
        }

    }

    public static int[] leftRotate(int [] arr, int d){
        ArrayList< Integer> ar = new ArrayList<Integer>();
        for(int i =d;i<arr.length;i++){
            ar.add(arr[i]);
        }
        for(int i= 0;i<d;i++){
            ar.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++ ){
            arr[i]= ar.get(i);
        }
        return arr;
    }

}
