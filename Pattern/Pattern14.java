package Pattern;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int row=0;row<2*n-1;row++){
            // Spaces
            for(int col=0;col<n-1-row+2*c;col++){
                System.out.print("  ");
            }
            for(int col=0;col<=row-2*c;col++){
                System.out.print("* ");
            }
            if(row>=n-1)
                c++;
            System.out.println();
        }
    }
}
