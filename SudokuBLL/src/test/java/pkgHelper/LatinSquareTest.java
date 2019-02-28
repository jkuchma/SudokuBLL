package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5};
		boolean bExpected = false;
		assertEquals(bExpected, LatinSquare.hasDuplicates(arr));
	}
	@Test 
	public void DoesElementExist_Test1(){
		int[] array1 = {1,2,3,4,5};
		int iValue = 2;
		boolean bExpectedCondition = true;
		boolean bActualCondition;
		
		bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition, bActualCondition);
		
	}
	@Test
	public void DoesElementExist_Test2(){
		int[] array1 = {1,2,3,4,5};
		int iValue = 7;
		boolean bExpectedCondition = false;
		boolean bActualCondition;
		
		bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition, bActualCondition);
		
	}
	@Test
	public void HasAllValues_Test1()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2};
		boolean bExpected = true;
		boolean bActualValue = LatinSquare.hasAllValues(arr1, arr2);
		
		assertEquals(bExpected, bActualValue);
		
	}
	@Test
	public void HasAllValues_Test2()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,5};
		boolean bExpected = false;
		boolean bActualValue = LatinSquare.hasAllValues(arr1, arr2);
		
		assertEquals(bExpected, bActualValue);
		
	}
	@Test
	public void ContainsZero_Test1()
	{
		
		
		int[][] puzzle = { {1,2,3}, {2,3,1}, {3,1,2} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = false;
		boolean bActual = ls.ContainsZero();
		
		assertEquals(bExpected, bActual);
	}
	@Test
	public void ContainsZero_Test2()
	{
		
		
		int[][] puzzle = { {1,2,3}, {2,0,1}, {3,1,2} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = true;
		boolean bActual = ls.ContainsZero();
		
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void getRow_Test1()
	{
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };



		LatinSquare LS = new LatinSquare(MySquare);

		int [] ExpectedRow = {3,1,2};

		int [] Row = LS.getRow(1);

		

		assertTrue(Arrays.equals(ExpectedRow, Row));

		System.out.println(Arrays.toString(Row));
	}
	@Test
	public void getColumn_Test1()
	{
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };



		LatinSquare LS = new LatinSquare(MySquare);

		int [] ExpectedCol = {2,1,3};

		int [] Col = LS.getColumn(1);

		

		assertTrue(Arrays.equals(ExpectedCol, Col));

		System.out.println(Arrays.toString(Col));	
	}
	@Test
	public void isLatinSquare_Test1()
	{
		int[][] arr = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };

		LatinSquare ls = new LatinSquare();

		ls.setLatinSquare(arr);

		assertTrue(ls.isLatinSquare());
	}
	@Test
	public void isLatinSquare_Test2() 
	{
		int[][] arr = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 0 } };

		LatinSquare ls = new LatinSquare();

		ls.setLatinSquare(arr);

		assertFalse(ls.isLatinSquare());
	}

}
