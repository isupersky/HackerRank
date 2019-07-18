import java.util.Scanner;

/*
@link-
https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class HourGlassSum {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int res =  findSum(arr);
        System.out.println(res);
    }

    public static int findSum(int[][] arr){

        int sum = -365; //sum is set to a random negative number and not zero because in case sum is less then 0 then it will show as answer
        for (int x =0;x<4;x++){
            int temp=0;
            for(int y = 0;y<4;y++){
                temp = arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];
                if(temp>sum){
                    sum =temp;
                }
            }

        }

        return sum;
    }

}
