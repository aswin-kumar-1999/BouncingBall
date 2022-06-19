package bouncing_ball;

import java.util.Scanner;
//only assigned for right
public class Release {
	static int s1,s2,c,r;
	int a[][];
public int release(int[][] b,int pos,int co ,int r) {
	Scanner in = new Scanner(System.in);
	s1=pos;
	 a=new int[r+5][co+5];
	s2=r-1;	
	this.r=--r;
	c=--co;
	System.out.println(r+""+c);
	for(int i=0;i<=r;i++) {
		for(int j=0;j<=co;j++) {
			//System.out.println(i+""+j);
			a[i][j]=b[i][j];
		}
	}
	System.out.println("1.Top-Left \n2.Top right");
	int ch=in.nextInt();
	int flag=0;
	
	
	switch(ch) {
	case 1:
		if(s1>=0 && s2>=0) {
			
			leftUp();
			if(s1==0 && s2>0) {
	
				rightUp();
				if(s2==0) {
					rightDown();
				}
			}
			if(s2==0 && s1>0) {
				leftDown();
			   if(s1==0) {
				   rightDown();
			}
		}
		}
		break;
	case 2:
		if(s1<c && s2>=0) {
			rightUp();
			if(s1==c && s2>0) {
				leftUp();
				if(s2==0) {
					leftDown();
				}
			}
			if(s2==0 && s1<c) {
				rightDown();
				if(s1==c) {
					leftDown();
				}
			}
		}
		break;
	}
	
	for(int i=0;i<=r;i++) {
		for(int j=0;j<=c;j++) {
			if(a[i][j]==9) {
			System.out.print("*"+" ");
			}
			else if(j==pos && i==4) {
				System.out.print("@"+" ");
			}
			else
				{System.out.print(a[i][j]+" ");}
		}
		System.out.println();
	}
	
	return s1;
	}

 void leftUp() {
	for(int i=0;s1-1>=0 && s2-1>=0;i++) {
		
		--s1;
		--s2;
		a[s2][s1]=9;
		//System.out.println(s1+""+s2);
	}
 }
 void leftDown() {
	 for(int i=0;s2+1<=r && s1-1>=0;i++) {
		
		 ++s2;
		 --s1;
		a[s2][s1]=9;
		// System.out.println(s1+""+s2);
		
	 }
 }
 void rightDown() {
	
	 for(int i=0;s2+1<=r && s1+1<=c;i++) {
		
		 ++s2;
		 ++s1;
		 a[s2][s1]=9;
		// System.out.println(s1+""+s2);
		
	 }
 }
 void rightUp() {
	
	 for(int i=0;s2-1>=0 && s1+1<=c;i++) {
		 
		 --s2;
		 ++s1;
		 a[s2][s1]=9;
		 //System.out.println(s1+""+s2);
	 }
 }
}
