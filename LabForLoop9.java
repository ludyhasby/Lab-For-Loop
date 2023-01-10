package testpingjava;

import java.util.Scanner;

public class LabForLoop9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int left = 0;
        int right = 0;
        for(int i = 1; i<=2*n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if(i<=n){
                left +=number;
            } else{
                right += number;
            }
        }
        int b = 0;
        if(left==right){
            System.out.printf("Yes, sum = %d", left);
        } else{
            if (left > right){
                 b = left-right;
            } else{
                b = right-left;
            }
            System.out.printf("No, diff = %d",b);
        }
    }
}