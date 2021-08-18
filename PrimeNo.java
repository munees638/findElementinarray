package org.integers;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		int rows, cols, key;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows u want:");
		rows = input.nextInt();
		System.out.println("Enter number of cols u want:");
		cols = input.nextInt();
		
		int[][] grid = new int[rows][cols];
	
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols; j++) {
				grid[i][j] = input.nextInt(); 
			}
		}
		System.out.println("ENTER WHICH ELEMENT YOU WANT: ");
		key = input.nextInt();
		findElement(grid, key, rows, cols);	
	}
	private static void findElement(int[][] grid, int key, int rows, int cols) {
		
		int i = 0;
		int j = cols-1;
		while(i<rows && j>=0) {
			
			System.out.println("Searching in row " + i + " and column "+ j + ".");
			
			if(key == grid[i][j]) {
				
				System.out.println("(" + i + "," + j + ")");
				return;
			}
			
			if(key > grid[i][j]) 
				i++;
			else
				j--;
			}
		
		System.out.println("(0,0)");
		}
		
	}

