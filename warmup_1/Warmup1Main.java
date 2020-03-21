package edu.academy.codingbat.warmup_1;

public class Warmup1Main {
    public static void main(String[] args) {
        Warmup1 a = new Warmup1();
//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true
        System.out.println("1 - " + a.sleepIn(false, false));

//        monkeyTrouble(true, true) → true
//        monkeyTrouble(false, false) → true
//        monkeyTrouble(true, false) → false
        System.out.println("2 - " + a.monkeyTrouble(true,true));

//        sumDouble(1, 2) → 3
//        sumDouble(3, 2) → 5
//        sumDouble(2, 2) → 8
        System.out.println("3 - " + a.sumDouble(1,2));

//        diff21(19) → 2
//        diff21(10) → 11
//        diff21(21) → 0
        System.out.println("4 - " + a.diff21(19));

//        parrotTrouble(true, 6) → true
//        parrotTrouble(true, 7) → false
//        parrotTrouble(false, 6) → false
        System.out.println("5 - " + a.parrotTrouble(true, 6));

//        makes10(9, 10) → true
//        makes10(9, 9) → false
//        makes10(1, 9) → true
        System.out.println("6 - " + a.makes10(3,7));

//        nearHundred(93) → true
//        nearHundred(90) → true
//        nearHundred(89) → false
        System.out.println("7 - " + a.nearHundred(89));

//        posNeg(1, -1, false) → true
//        posNeg(-1, 1, false) → true
//        posNeg(-4, -5, true) → true
        System.out.println("8 - " + a.posNeg(-23, 1, false));

//        notString("candy") → "not candy"
//        notString("x") → "not x"
//        notString("not bad") → "not bad"
        System.out.println("9 - " + a.notString("candy"));

//        missingChar("kitten", 1) → "ktten"
//        missingChar("kitten", 0) → "itten"
//        missingChar("kitten", 4) → "kittn"
        System.out.println("10 - " + a.missingChar("kitten", 1));

//        frontBack("code") → "eodc"
//        frontBack("a") → "a"
//        frontBack("ab") → "ba"
        System.out.println("11 - " + a.frontBack("ау"));

//        front3("Java") → "JavJavJav"
//        front3("Chocolate") → "ChoChoCho"
//        front3("abc") → "abcabcabc"
        System.out.println("12 - " + a.front3("Ja"));

//        backAround("cat") → "tcatt"
//        backAround("Hello") → "oHelloo"
//        backAround("a") → "aaa"
        System.out.println("13 - " + a.backAround("cat"));

//        or35(3) → true
//        or35(10) → true
//        or35(8) → false
        System.out.println("14 - " + a.or35(15));








    }
}
