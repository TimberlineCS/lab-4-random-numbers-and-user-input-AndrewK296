Import java.io.*;
Import java.util.*;
public class randomNumber.java{
public static void main(String args[]){

// challenge 1

int negative = (int)(Math.random()*10) - 10;
System.out.println(negative);

int min = int abs(int negative) + 1;
int positive = (int)(Math.radom()*(50 - min)) + min;
System.out.println(positive);

//challenge 2

Scanner name = new Scanner(System.in);
String myName = name.next();

Scanner date = new Scanner(System.in);
String Today = date.nextDouble();

Scanner age = new Scanner(System.in);
String myAge = age.nextInt();

Scanner family = new Scanner(System.in);
String myFamily = family.next();

Scanner adj = new Scanner(System.in);
String aboutYou = adj.next();

System.out.println("Hello my name is " + myName + "and tday is " + Today + "I am " + myAge + "years old and I live with " + myFamily + " I am very " + aboutYou + "person");

}
}
