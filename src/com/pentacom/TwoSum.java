package com.pentacom;
public class TwoSum {

    public static void main(String[] args) {

        int[] numbers = {2, 8, 11, 7, 15};
        int target = 26;


        twoNumbers(numbers, target);
    }

    public static int [] twoNumbers(int [] numbers, int target){
        int [] indexAnswer = new int [2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
//                   int x = i;
//                   int y = j;
                   indexAnswer[0] = i;
                    indexAnswer[1] = j;
                }
            }

        }
        System.out.println("Position 1: " + indexAnswer[0]);
        System.out.println("Position 2: " + indexAnswer[1]);
        return indexAnswer;
}}