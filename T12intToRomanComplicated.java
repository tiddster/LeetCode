/*
T12整型数字转为罗马数字(复杂)
 */

import java.util.Scanner;

public class T12intToRomanComplicated {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int i = in.nextInt();
        System.out.println(intToRoman(i));
    }

    public static String intToRoman(int i){
        String result = "";
        while(i != 0) {
            if(i>=1000){
                i-=1000;
                result+=roman(1000);
            } else if(i >= 900){
                i-=900;
                result+=roman(900);
            } else if(i >= 500){
                i-=500;
                result+=roman(500);
            } else if(i >= 400){
                i-=400;
                result+=roman(400);
            } else if(i >= 100){
                i-=100;
                result+=roman(100);
            } else if(i >= 90){
                i-=90;
                result+=roman(90);
            } else if(i >= 50){
                i-=50;
                result+=roman(50);
            } else if(i >= 40){
                i-=40;
                result+=roman(40);
            } else if(i >= 10){
                i-=10;
                result+=roman(10);
            } else if(i >= 9){
                i-=9;
                result+=roman(9);
            } else if(i >= 5){
                i-=5;
                result+=roman(5);
            } else if(i >= 4){
                i-=4;
                result+=roman(4);
            } else if(i >= 3){
                i-=3;
                result+=roman(3);
            } else if(i >= 2){
                i-=2;
                result+=roman(2);
            } else if(i >= 1){
                i-=1;
                result+=roman(1);
            }
        }
        return result;
    }

    public static String roman(int i){
        String roman = "";
        switch (i){
            case 3: roman += "I";
            case 2: roman += "I";
            case 1: roman += "I"; break;
            case 4: roman += "I";
            case 5: roman += "V"; break;
            case 9: roman += "I";
            case 10: roman += "X"; break;
            case 40: roman += "X";
            case 50: roman += "L"; break;
            case 90: roman += "X";
            case 100: roman += "C"; break;
            case 400: roman += "C";
            case 500: roman += "D"; break;
            case 900: roman += "C";
            case 1000: roman += "M";break;
        }
        return roman;
    }
}
