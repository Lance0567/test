package OOP;

import java.util.Scanner;
public class Module6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double[] myNumbers;
        int size;
        double sum = 0;
        double difference;
        double product = 1;
        double quotient;

        System.out.println("Enter the number of numbers you want to process:");
        size = input.nextInt();
        myNumbers=new double[size];

        for(int a=0; a<myNumbers.length; a++){
            System.out.println("Number " + (a + 1) + ":");
            myNumbers[a]=input.nextDouble();
        }

        System.out.println("--------------------------------------------------------------");
        for(int b=0; b<myNumbers.length; b++){
            System.out.print(myNumbers[b]);
            if (b<size-1){
                System.out.print(" + ");}
            sum = sum + myNumbers[b];
        }
        System.out.println(" = " + sum);

        System.out.println();
        System.out.print(myNumbers[0]);
        difference = myNumbers[0];
        for(int c=1; c<myNumbers.length; c++){

            System.out.print(" - ");
            System.out.print(myNumbers[c]);
            difference = difference - myNumbers[c];
        }
        System.out.println(" = " + difference);

        System.out.println();
        for(int d=0; d<myNumbers.length; d++){
            System.out.print(myNumbers[d]);
            if (d<size-1){
                System.out.print(" * ");}
            product =  myNumbers[d] * product;
        }
        System.out.println(" = " + product);

        System.out.println();
        System.out.print(myNumbers[0]);
        quotient = myNumbers[0];
        for(int e=1; e<myNumbers.length; e++){

            System.out.print(" / ");
            System.out.print(myNumbers[e]);
            quotient = quotient / myNumbers[e];
        }
        System.out.println(" = "  + quotient);

        System.out.println("--------------------------------------------------------------");
    }

}