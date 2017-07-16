package locial;

import java.util.Scanner;

public class Hunter6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int[] d=new int[n];
		System.out.println("Enter the Array element");
		int i;
		for(i=0;i<n;i++){
			d[i]=s.nextInt();
		}
		//Arrays.sort(a);
		for(i=0;i<n;i++){
			if(d[i]+d[i+1]>0){
				System.out.println(d[i]+" "+d[i+1]);
				break;
			}
		}
		}

	}
