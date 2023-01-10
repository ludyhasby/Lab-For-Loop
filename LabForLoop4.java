package testpingjava;

import java.util.Scanner;

public class LabForLoop4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int b = 0;
        int c = 0;

        for(int i = 0; i <= n; i+=2){
            b = i/2;
            b = b*2;
            c = (int)Math.pow(2, b);
            System.out.println(c);
        }
    }
}
