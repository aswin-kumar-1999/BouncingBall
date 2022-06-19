package bouncing_ball;

import java.util.Scanner;
/*
 A Squash ball player want to smash the ball the ball will bounce on three side of the Wall.
 This application will calculate the position of the player to hit the ball on next strike.
 
 */

public class main {
	static int[][] a;
public static void main(String arg[]) {
	System.out.println("enter the size of matrix Row & Col");
	Scanner in= new Scanner(System.in);
	int r=in.nextInt();
	
	int c=in.nextInt();
	a=new int[r+2][c+2];
	int ch=1,k=0;
	while(ch!=0) {
		System.out.println("1.Enter the ball in game\n2.Hit the ball \n3.Ball Position \n0.End Game"
				+ "\nenter the option");
		ch=in.nextInt();
		switch(ch) {
		case 1:
			//ball only locate in bottom col
			a[r-1][k]=0;
			System.out.println("enter the bottom position");
			k=in.nextInt();
			a[r-1][k]=1;
			break;
		case 3:
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			break;
		case 2:
			a[r-1][k]=0;
			Release p=new Release();
			k=p.release(a,k,c,r);
			a[r-1][k]=1;
			break;
		case 0:
			ch=0;
			break;
		}
	}
}
}
