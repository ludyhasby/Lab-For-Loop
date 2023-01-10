package testpingjava;

import java.util.Scanner;

public class LabForLoop5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int b = text.length();
        for(int i = 0; i < b; i++){
            char letter = text.charAt(i);
            System.out.println(letter);
        }
    }
}