package pkgHelper;

import java.util.*;

public class LatinSquare {
	private int[][] LatinSquare;

	public LatinSquare(int[][] puzzle) {
		super();
		this.LatinSquare = puzzle;
	}

	public LatinSquare() {

	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	
	
	/**
	 * 
	 * @param arr
	 * checks to see if an array has any duplicates
	 * @return boolean
	 */
	public boolean hasDupilicates(int[] arr) {
		boolean hasDuplicates = false;
		int[] sortedArray = Arrays.copyOf(arr, arr.length);
		
		Arrays.sort(sortedArray);
		for(int i = 0; i < arr.length - 1; i++) {
			if (sortedArray[i] == sortedArray[i + 1]) {
				hasDuplicates = true;
				break;
			}
		}
		
		return hasDuplicates;
	}

	/****
	 * 
	 * @param arr
	 * @param iValue
	 * checks to see if iValue, an int, exists inside of arr, array
	 * @return boolean
	 */
	public static boolean doesElementExist(int[] arr, int iValue) {
		if (arr == null)
			return false;
		for (int i : arr) {
			if (iValue == i) {
				return true;
			}
		}
		return false;

	}

	
	/*****
	 * 
	 * @param arr1
	 * @param arr2
	 * compares two arrays, returns true if array2 has all the elements in array 1,
	 * false if the two arrays do not have the same values
	 * @return boolean
	 */
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			if (doesElementExist(arr1, arr2[i]) == false)
				return false;
		}
		
		return true;
	}

	
	
	/***
	 * 
	 * @param iCol - int
	 * retrieves a column from the two dimensional array
	 * @return
	 */
	public int[] getColumn(int iCol) {
		int[] arr1 = new int[LatinSquare.length];
		for (int i = 0; i < LatinSquare.length; i++) {
			arr1[i] = LatinSquare[i][iCol];
		}
		return arr1;
	}

	/***
	 * 
	 * @param iRow
	 * retrieves a row from a two-dimensional array 
	 * @return an array
	 */
	public int[] getRow(int iRow) {
		int[] arr1 = new int[LatinSquare.length];
		for (int i = 0; i < this.LatinSquare.length; i++) {
			arr1[i] = LatinSquare[iRow][i];
		}
		return arr1;
	}
    
	/*** 
	 * no parameters
	 * checks to see if a two dimensional array is a latin square
	 * first checks that no row or column has any duplicates
	 * then checks that each column has matching values and each row has matching values
	 * @return boolean
	 */
	public boolean isLatinSquare() {
		boolean isLatinSquare = false;
		for (int i = 0; i < this.LatinSquare.length; i++) {
			if (hasDupilicates(getRow(i)) == true || hasDupilicates(getColumn(i)) == true) {
				return isLatinSquare;
			}
		}
		for (int j = 0; j < this.LatinSquare.length - 1; j++) {
			if ((hasAllValues(getRow(0), getRow(j + 1)) == false) || (hasAllValues(getColumn(0), getColumn(j + 1)) == false)) {
				return isLatinSquare;
			}
		}
		return true;
	}

	/**
	 * 
	 * @return
	 */
	public boolean containsZero() {
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++) {
			for (int iColumn = 0; iColumn < this.LatinSquare.length; iColumn++) {
				if (this.LatinSquare[iRow][iColumn] == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
