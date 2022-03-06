package da;

import java.util.*;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println("select the correct answer for '1+1': \n 1) 2 \n 2) 15 \n 3) 41 \n 4) 17");
        int a;
        while(!flag){
            a = input.nextInt();
            if(a == 1 || a == 2 || a == 3 || a == 4){
                if(a == 1){
                    System.err.println("Correct");
                    flag = true;
                }else{
                    System.err.println("WRONG");
                }
            }else{
                System.err.println("are you facking stupit?");
            }
        }
        System.out.println("finish");

    }
}
