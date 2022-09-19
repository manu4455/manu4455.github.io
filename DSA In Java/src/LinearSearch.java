//This file is a Practice question of Linear Search in Java

import java.util.Arrays;

public class LinearSearch {
    public static void main(String args[]){
//        String n = "manujamatia";
//        char target = 'm';
        int[] n = { 9999,22,111,487978,34,6,7};
        int[][] n2 = {
                {23,29,32,33},
                {10,11,12,99},
                {1,5,4,6,7,22,23}
        };
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int start = 2;
        int end = 6;
        int num = 10;
        System.out.println(binarySearch(arr,target));
//        System.out.println(reduceNumber(num));

//       System.out.println((Arrays.toString(arr4(n2,target))));
//        System.out.println(max2d(n2));
//        System.out.println(noOfEven(n));
//        System.out.println(findMaxWealth(n2));
    }
    //function to search a character in a string
    static boolean yo(String n, char target){
        if(n.length()==0){
            return false;
        }
        for(int i =0;i<n.length();i++){
            if(target == n.charAt(i)){
                return true;
            }
        }
        return false;
    }
    //same with for each
    static boolean yo2(String n, char target){
        if(n.length()==0){
            return false;
        }
        for(char ch : n.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;
    }
    //fnction to search array
    static boolean arr1(int[] n,int target){
        if(n.length == 0){
            return false;
        }
        for(int element : n){
            if(target == n[element]){
                return true;
            }
        }
        return false;
    }
    //function to find target from 2 to 4
    static int arr2(int[] n,int target,int start,int end){
        if(n.length == 0){
            return -1;
        }
        for(int i = start;i<=end;i++){
            if(target == n[i]){
                return 1;
            }
        }
        return -1;
    }
    //function to find max no of an array
    static int max(int[] n){
        int answer = n[0];
        for(int element : n){
            for(int i = 0;i<n.length;i++){
                if(n[i]>answer){
                    answer = n[i];
                }
            }
        }
        return answer;
    }
    //function to find minimum in an array using linear search algorithms
    static int min(int[] n){
        int answer = n[0];
        for(int element : n){
            for(int i = 0;i<n.length;i++){
                if(n[i]<answer){
                    answer = n[i];
                }
            }
        }
        return answer;
    }
    static int twosum(int[] n,int target){
        int  ans = n[0];
        for(int i = 0;i<n.length;i++){
            for(int j = 0;j<n.length;j++){
                if(n[i]+n[j]==target){

                    return n[j];
                }
            }
        }
        return -1;
    }
    static int[] arr4(int[][] n,int target){
        for(int row = 0;row<n.length;row++){
            for(int col = 0;col<n[row].length;col++){
                if(n[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    //function to find max no of an array
    static int max2d(int[][] n){
        int answer = n[0][0];
        for(int row = 0;row<n.length;row++){
            for(int col = 0;col<n[row].length;col++ ){
                if(n[row][col]>answer){
                    answer = n[row][col];
                }
            }
        }

        return answer;
    }

    // program to find even digit in an arrays
    static int noOfEven(int[] n){
        int count=0;
        for(int num:n){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int numberOfDigits = digit2(n);
        return numberOfDigits %2 == 0;
    }
    //first have to find digit
    static int digit(int n){
        int count = 0;
        while(n>0){
            count ++;
            n = n/10;

        }
        return count;
    }
    static int digit2(int n){
        if(n<0){
            n=n*-1;
        }

        return (int)Math.log10(n)+1;
    }
    //program to find most wealth from a person (from question no 1672 leetcode)
    static int findMaxWealth(int[][] accounts){
        int answer = Integer.MIN_VALUE;
        //for 1st loop
        for(int[] person:accounts){
            int sum = 0;
            for(int col :person){
                sum += col;
            }
            if(sum>answer){
                answer = sum;
            }
        }
        return answer;
    }
    // find the number of step to reduce a number to zero leetcode question no 1324
    static int reduceNumber(int num){
        int step = 0;

        int ans = 0;
        while(num>0){

            if(num%2==0){

                ans = num/2;
                step++;
            }
            else{

                ans = num-1;
                step++;
            }
        }
        return step;
    }
    //1st question of Binary Search
    static int binarySearch(int[] n,int target){
        int start = 0;
        int end = n.length-1;

        while(start<=end){
            int mid = start + (end - start) /2;
            if(target>n[mid]){
                start = mid + 1;
            }
            else if (target<n[mid]){
                end = mid - 1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
}

