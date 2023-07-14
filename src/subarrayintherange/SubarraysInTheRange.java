package subarrayintherange;

import java.util.Scanner;

public class SubarraysInTheRange {
	
	public static void subarraysInTheRange(int array[],int l,int r) {
		for(int i=l;i<=r;i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int l = scanner.nextInt();
		int r = scanner.nextInt();
		subarraysInTheRange(array,l,r);
	}
}
