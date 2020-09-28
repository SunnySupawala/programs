package com.in.programe;

import java.io.*;
import java.util.*;
class Main {  
    //COMPLETE THIS FUNCTION
    private static void process(String input) {
//         char c=input.charAt(2);
//         System.out.println(input.charAt(3)==48);
//         System.out.println(input.charAt(input.length()-3));
//         System.out.println(input.charAt(input.length()-3)==57);
        ArrayList<Character> lst = new ArrayList<Character>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        boolean isCurrentNumber=false;
        boolean isCurrentChar=true;
        StringBuilder output=new StringBuilder();
        for(int i=0; i<input.length();i++){
            Character tempChar=input.charAt(i);
            boolean tempCurrent=isNumber(tempChar);
//             System.out.println(tempChar + "--"+tempCurrent + "==="+isCurrentNumber+"---"+isCurrentChar);
            if(isCurrentNumber){// Num Seq
                if(tempCurrent){//Its Number
                    num.add(Integer.parseInt(tempChar.toString()));
                }else{
                    Collections.sort(num);                    
                    num.forEach(val->{output.append(val);});                    
                    num.clear();
                    lst.add(tempChar);
                    isCurrentNumber=false;
                    isCurrentChar=true;
                }
            }else{// Char Seq
                if(tempCurrent){//Its Number
                    Collections.sort(lst);                    
                    lst.forEach(val->{output.append(val);});                    
                    lst.clear();
                    num.add(Integer.parseInt(tempChar.toString()));
                    isCurrentNumber=true;
                    isCurrentChar=false;
                }else{
                    lst.add(tempChar);
                }
            }
        }
        Collections.sort(lst); 
        Collections.sort(num); 
        num.forEach(val->{output.append(val);});  
        lst.forEach(val->{output.append(val);});                    
        System.out.println(output.toString());
    }
    private static boolean isNumber(char c){
        return c>47&&c<58;
    }
    //you do not need to edit any code below this line
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        process(input);
    }
}