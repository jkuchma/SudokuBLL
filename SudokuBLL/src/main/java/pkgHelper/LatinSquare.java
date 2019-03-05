package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] LatinSquare;

	public LatinSquare()
	{
		
	}
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public static boolean hasDuplicates(int [] arr){
		boolean hasDuplicates = false;
		
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i = 0; i< arr.length-1; i++)
		{
			if (arr[i] == arr[i+1])
			{
				hasDuplicates = true;
				break;
			}
		}
		
		
		return hasDuplicates;
	}
	
	public static boolean doesElementExist(int[] arr, int iValue)
	{
		
		for (int i: arr)
		{
			if (i == iValue)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2)
	{
		if(arr1 == null || arr2 == null)
			return false;
		for(int i = 0; i < arr2.length; i++)
		{
			if(doesElementExist(arr1, arr2[i]) == false)
				return false;
		}
		return true;
	}
	public boolean ContainsZero()
	{
		for (int row = 0; row < this.LatinSquare.length; row++)
		{
			for (int col = 0; col < this.LatinSquare.length; col++)
			{
				if (this.LatinSquare[row][col] == 0)
					return true;
			}
		}
		
		return false;
	}
	public int[] getRow(int iRow)
	{
		int[] Row = new int[this.LatinSquare.length];
		
		Row = this.LatinSquare[iRow];
		
		return Row;
	}
	public int[] getColumn(int iCol) 
	{
		int[] Col = new int[this.LatinSquare.length];

		for (int row = 0; row < this.LatinSquare.length; row++) {

			Col[row] = LatinSquare[row][iCol];

		}

		return Col;

	}

	public boolean isLatinSquare() 
	{
		boolean isLatinSquare = false;
		for (int i=0; i < this.LatinSquare.length; i++) 
		{
			if (hasDuplicates(getRow(i)) == true || hasDuplicates(getColumn(i)) == true)
			{
				return isLatinSquare;
			}
		}
		for (int j = 0; j< this.LatinSquare.length - 1; j++)
		{
			if ((hasAllValues(getRow(0), getRow(j + 1)) == false) || (hasAllValues(getColumn(0), getColumn(j + 1)) == false))
			{
				return isLatinSquare;
			}
		}
		return true;
	}
	
}

