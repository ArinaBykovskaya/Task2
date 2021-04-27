package com.company;

import java.util.Locale;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Задание 1: " + street(2, 3));
        System.out.println("Задание 2: " + nameShuffle("Donald Trump"));
        System.out.println("Задание 3: " + discount(100, 75)) ;
        System.out.println("Задание 4: " + differenceMaxMin(new int[]{44, 32, 86, 19}));
        System.out.println("Задание 5: " + equal(3, 4, 3));
        System.out.println("Задание 6: " + reverse("Hello World"));
        System.out.println("Задание 7: " + programmers(33,72,74));
        System.out.println("Задание 8: " + getX0("xxoo x oxx"));
        System.out.println("Задание 9: " + bomb("fafaf"));  //Hey, did you think there is BOMB?
        System.out.println("Задание 10: " + Ascii("EdAbIt", "EDABII"));
    }

    public static int street(int numb, int len){
        return ((len * 2) - numb + 1);
    }

    public static String nameShuffle(String s){
        String[] s1= s.split(" ");
        String result = "";
        for (int i= s1.length - 1; i>=0; i--){
            result += s1[i] + " ";
        }
        return result;
    }

    public static double discount(int prize, int dis){

        return (double)prize - (double)(prize*dis)/100;
    }

    public static int differenceMaxMin(int[] arr){
        int min=arr[0]; int max=arr[0];
        for (int i=0; i<=arr.length-1; i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return Math.abs(min-max);
    }

    public static int equal(int a, int b, int c){
        int k=0;
        if (a==b || a==c || b==c){
            k=2;
        }
        if ((a==b)&&(a==c)){
            k=3;
        }
        return k;
    }

    public static String reverse(String s){
        StringBuilder result = new StringBuilder();
        for (int i =s.length()-1;i>=0;i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static int programmers(int one, int two, int three){
        int[] programmers = {one,two,three};
        int min = programmers[0]; int max = programmers[0];
        for (int i=0; i<= programmers.length-1; i++){
            if (programmers[i]<min){
                min=programmers[i];
            }
            if(programmers[i]>max) {
                max = programmers[i];
            }
        }
        return max-min;
    }

    public static boolean getX0(String s ){
        s=s.toLowerCase();
        int countx=0; int counto=0;
        char[] charArr=s.toCharArray();
        for (int i=0; i<=charArr.length-1;i++){
            if (charArr[i] == 'o'){
                countx+=1;
            }
            if(charArr[i] == 'x'){
                counto+=1;
            }
        }
        return (counto == countx);
    }

    public static String bomb(String s){
        s=s.toLowerCase();
        boolean soderzhit=s.contains("bomb");
        if (soderzhit) {
            System.out.print("DUCK!");
        }
        else{
            System.out.print("Relax, there's no bomb");
        }
        return "";
    }

    public static boolean Ascii(String s1, String s2){
        int countS1=0;int countS2=0; int ch1=0; int ch2=0;
        for(int i=0; i<=s1.length()-1;i++){
            ch1+=s1.charAt(i);
     }
        for(int i=0;i<=s2.length()-1;i++) {
            ch2 += s2.charAt(i);
        }
        return (ch1==ch2);
    }
}