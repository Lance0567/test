package OOP;

import java.util.Scanner;

public class Module5Number1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Enter a number:");
        n = input.nextInt() * 2 ;

        int sz = (n)-1;
        int cross = (sz/2);
        int h1 = 0;
        int h2 = sz-1;

        for(int i=0, bck=sz-1, d1=cross, d2=cross, d3 = 1; i<sz; i++, bck--, d1--, d2++, d3++){
            if(i>cross){
                h1++; // Bottom left slash
                h2--; // Bottom right slash
            }
            for(int j=0; j<sz; j++){
                if(i == 0 || i == sz-1) // Top and bottom
                    System.out.print("* ");
                else if((i>0 && i < sz) && (j == sz-1) || (j == 0)) // Hollow side left and hollow side right bottom
                    System.out.print("* ");
                else if((i>0 && i<sz && (j == bck)) && ((bck>=(int)(sz*0.75)) || (bck<=(int)(sz*0.25)))) // Top & bottom hollow, Top right slash to bottom left slash 5 asterisk
                    System.out.print("* ");
                else if((i>0 && i < sz) && ((j == d1) || (j == d2))) //Top left and right slash
                    System.out.print("* ");
                else if((i>cross && j <= cross) && (j == h1) || (j == h2)) // Copy of Bottom right and left slash
                    System.out.print("* ");
                else if(j == i && ((j <= cross/2) || (j >=(int)(sz*0.75)))) // Side Hollow, Bottom Left slash 5 asterisk
                    System.out.print("* ");
                else if( (i>0 && i < sz-1) && ((j==cross) || (i==cross))) // Middle Vertical line, Horizontal line
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }System.out.println ("");
        }
    }
}