package exam;


	import java.util.Arrays;
	import java.util.Scanner;

	public class SecondHighestNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        Arrays.sort(arr);
	        System.out.println("The second highest number is: " + arr[size - 2]);
	    }
	}


