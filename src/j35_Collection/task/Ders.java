package j35_Collection.task;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ders {

    public static void main(String[] args) {
        String str="javaCAn & JAVATAR";

        methodForlastIndex(str);
        method2ForFirstIndex(str);
        method3WhilwSubstring(str);
        method4StrBuilder(str);
        method5StrBuffer(str);
        method6StrArray(str);
        method7CharArray(str);
        method8ByteArray(str);
        method9ArrayList(str);
        method10Recursion(str);
        method11Stack(str);
        method12Lambda(str);
        method13Unicode(str);


    }

    private static void method13Unicode(String str) {

        System.out.println("Unicode Right to Left Override ile :" + "\u202E" + str);
    }

    private static void method12Lambda(String str) {
        System.out.println("Lambda ile " + Stream.of(str).map(t -> t.split("")).flatMap(Arrays::stream).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile " + str.chars().mapToObj(ch -> Character.toString(ch)).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile " + str.chars().mapToObj(Character::toString).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile " + Stream.of(str).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining()));

    }
        private static void method11Stack(String str) {
        Stack<Character> stack = new Stack<Character>();
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            stack.push(ch[i]);
        }
        int i = 0;
        while(!stack.isEmpty()) {
            ch[i++] = stack.pop();
        }
        System.out.println("Stack ile "+String.copyValueOf(ch));
        System.out.println("Stack ile "+new String(ch));
    }

    private static void method10Recursion(String str) {
        if(!str.isEmpty()) {
            System.out.print(str.charAt(str.length() - 1));
            method10Recursion(str.substring(0, str.length() - 1));
        }else System.out.println();//dummy
    }

    private static void method9ArrayList(String str) {
        ArrayList<String> list = new ArrayList<String>(List.of(str.split("")));
        Collections.reverse(list);
        System.out.println("ArrayList ile "+list);

        String[] array = list.toArray(new String[0]);
        System.out.println("ArrayList ile "+String.join("", array));
        //System.out.println("ArrayList ile "+String.join("!", array));
    }

    private static void method8ByteArray(String str) {
        byte[] bytes = str.getBytes();
        System.out.println("Stringimizin son hali: "+ Arrays.toString(bytes));

        for(int l=0, r=str.length()-1; l<r; l++, r--) {
            byte temp= bytes[l];
            bytes[l] = bytes[r];
            bytes[r] = temp;
        }
        System.out.println("Byte Array ile "+new String(bytes));
    }

    private static void method7CharArray(String str) {
        char[] charArray =str.toCharArray();
        System.out.print("CharArray ile ");

        for (int i = charArray.length-1; i >=0 ; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();//dummy

    }

    private static void method6StrArray(String str) {

        String[]strArr=str.split("");
        System.out.print("StringArray ile ");

        for (int i = strArr.length-1; i >=0 ; i--) {
            System.out.print(strArr[i]);
        }
        System.out.println();//dummy
    }

    private static void method5StrBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println("StringBuffer ile ters çevrildi = "+sb.reverse());
    }

    private static void method4StrBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder ile ters çevrildi = "+sb.reverse());
    }

    private static void method3WhilwSubstring(String str) {

        String s5="";
        while (str.length()>0){
            s5+=str.charAt(str.length()-1);
            str=str.substring(0, str.length()-1);
        }
        System.out.println("while ile ters çevirme 5 = " + s5);
    }

    private static void method2ForFirstIndex(String str) {
        String s3="";
        String s4="";
        for (int i =0; i<str.length()-1 ; i++) {
            s3 =  str.charAt(i)+s3;
            s4 = str.substring(i, i + 1)+s4;
           } System.out.println("for loop charAT ile s3 = " + s3);
        System.out.println("for loop substring ile s4 = " + s4);
    }

    private static void methodForlastIndex(String str) {
        String s1="";
        String s2="";
        for (int i =str.length()-1; i>=0 ; i--) {
            s1 += str.charAt(i);
            s2 += str.substring(i, i + 1);
        }System.out.println("for loop charAT ile s1 = " + s1);
        System.out.println("for loop substring ile s2 = " + s2);
    }





    }


