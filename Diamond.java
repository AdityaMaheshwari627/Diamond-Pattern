//Diamond Pattern
package Pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter num:");
        int no=obj.nextInt();
        for(int i=1;i<=no;i++) {
        	for(int j=1;j<=no-i;j++) {
        		System.out.print(" ");
        	}
        	//stars
        	for(int j=1;j<=2*i-1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int i=no;i>=1;i--) {
        	for(int j=1;j<=no-i;j++) {
        		System.out.print(" ");
        	}
        	//stars
        	for(int j=1;j<=2*i-1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
