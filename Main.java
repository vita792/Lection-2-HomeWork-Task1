package compare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Case1 = 18;
        int Case2 = 24;
        int Case3 = 29;

        Scanner user1 = new Scanner(System.in);
        System.out.println("First Person, please, enter Your Name:" + "\t");
        String name1 = user1.nextLine();
        System.out.println("Enter Your LastName:" + "\t");
        String lastName1 = user1.nextLine();
        System.out.println("Enter Your age:" + "\t");
        int age1 = user1.nextInt();
        System.out.println("Enter Your weight(kg)):" + "\t");
        double weight1 = user1.nextDouble();
        System.out.println("Enter Your height(sm):" + "\t");
        double height1 = user1.nextDouble();

        int index1 = (int) (weight1 / (height1 * height1));
        if (index1 <= Case1) {
            System.out.println(name1 + " " + lastName1 + ", You are too thin.");
        } else if (index1 > Case1 && index1 <= Case2) {
            System.out.println(name1 + " " + lastName1 + ", You are in perfect form!");
        } else if (index1 > Case2 && index1 <= Case3) {
            System.out.println(name1 + " " + lastName1 + ", You are a little bit heavy.");
        } else {
            System.out.println(name1 + " " + lastName1 + ", You have a big problem with weight...");
        }


        Scanner user2 = new Scanner(System.in);
        System.out.println("Second Person, please, enter Your Name:" + "\t");
        String name2 = user2.nextLine();
        System.out.println("Enter Your LastName:" + "\t");
        String lastName2 = user2.nextLine();
        System.out.println("Enter Your age:" + "\t");
        int age2 = user2.nextInt();
        System.out.println("Enter Your weight(kg)):" + "\t");
        double weight2 = user2.nextDouble();
        System.out.println("Enter Your height(sm):" + "\t");
        double height2 = user2.nextDouble();

        int index2 = (int) ((weight2 / (height2 * height2)) * 10000);
        if (index2 <= Case1) {
            System.out.println(name2 + " " + lastName2 + ", You are too thin.");
        } else if (index2 > Case1 && index2 <= Case2) {
            System.out.println(name2 + " " + lastName2 + ", You are in perfect form!");
        } else if (index2 > Case2 && index2 <= Case3) {
            System.out.println(name2 + " " + lastName2 + ", You are a little bit heavy.");
        } else {
            System.out.println(name2 + " " + lastName2 + ", You have a big problem with weight...");
        }


        if (index1 > index2) {
            System.out.println(name1 + " " + lastName1 + " 'bigger' than " + name2 + " " + lastName2 + "!");
        } else if (index1 < index2) {
            System.out.println(name2 + " " + lastName2 + " 'bigger' than " + name1 + " " + lastName1 + "!");
        } else {
            System.out.println("You both in that same physical form!");
        }
    }
}
