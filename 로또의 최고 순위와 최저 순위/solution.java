package com.example;

public class App {
    public static void main(String[] args) {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int countNumber = 6;
        int countZero = 0;
        for(int item : lottos) {
            if(item==0) { countZero++; continue; }
            for(int check : win_nums) {
                if(item==check) countNumber--;
            }
        }
        int min = 6;
        int max = 6;
        if(countNumber < 5) min = countNumber+1;
        if(countNumber-countZero < 5) max = countNumber-countZero+1;
        System.out.println("max : " + max + "min : " + min);
    }
}
