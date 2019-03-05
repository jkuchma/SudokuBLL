package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest { 

	@Test
	public void hasDuplicates_test1() {
		int [] a = {1,2,3,4};
		LatinSquare ls = new LatinSquare();
		assertFalse(ls.hasDupilicates(a));
		}
	
	
	@Test
	public void hasDuplicates_test2() {
		int [] a = {1,1,3,4};
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.hasDupilicates(a));
		}
	
	
	@Test
	public void hasDuplicates_test3() {
		int [] a = {1,2,5,4,1};
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.hasDupilicates(a));
	}

	@Test
	public void doesElementExist_test1() {
		int [] a = {1,2,3,4};
		int c = 2;
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.doesElementExist(a, c));
	}
	
	@Test
	public void doesElementExist_test2() {
		int [] a = {1,2,3,4};
		int c = 5;
		LatinSquare ls = new LatinSquare();
		assertFalse(ls.doesElementExist(a, c));
	}
	
	@Test
	public void doesElementExist_test3() {
		int [] a = null;
		int c = 1;
		LatinSquare ls = new LatinSquare();
		assertFalse(ls.doesElementExist(a, c));
	}
	@Test
	public void hasAllValues_test1() {
		int [] a = null;
		int [] b = {1,2,5,3};
		LatinSquare ls = new LatinSquare();
		assertFalse(ls.hasAllValues(a, b));
	}
	
	@Test
	public void hasAllValues_test2() {
		int [] a = {1,2,3,4,5};
		int [] b = {1,2,3};
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.hasAllValues(a, b));  
	}
	
	@Test 
	public void hasAllValues_test3() {
		int [] a = {1,2,3,6,5,4};
		int [] b = {1,2,3,4,5,0};
		LatinSquare ls = new LatinSquare();
		assertFalse(ls.hasAllValues(a, b));
	}
	
	@Test
	public void hasAllValues_test4() {
		int [] a = null;
		int [] b = {1,2};
		LatinSquare ls = new LatinSquare(); 
		assertFalse(ls.hasAllValues(a, b));}
	
	@Test 
	public void ContainsZero_Test1() {
		int [][] puzzle = { {1,2,3},{2,3,1},{3,2,1}};
		
		LatinSquare ls = new LatinSquare(puzzle);
		assertFalse(ls.containsZero());
	}
	 
	@Test 
	public void ContainsZero_Test2() {
		int [][] puzzle = {{1,0,3},{2,1,4},{3,4,5}};
		LatinSquare ls = new LatinSquare(puzzle);
		assertTrue(ls.containsZero());
	}
	
	@Test
	public void getColumn_Test1() {
		int [][] puzzle = {{1,2,3,4},
						   {1,2,3,4},
				           {1,2,3,4},
						   {4,3,2,1}};
		int [] expected = {1,1,1,4};
		LatinSquare ls = new LatinSquare(puzzle);
		int [] re = ls.getColumn(0);
		assertArrayEquals(expected,re);
		}
	
	@Test
	public void getColumn_Test2() {
		int [][] puzzle = {{1,2,3,4},
						   {1,2,3,4},
				           {1,2,3,4},
						   {1,3,4,1}};
		int [] expected = {2,2,2,3};
		LatinSquare ls = new LatinSquare(puzzle);
		int [] re = ls.getColumn(1);
		assertArrayEquals(expected,re);
		}
	
	@Test 
	public void getRow_Test1() {
		int [][] puzzle = {{1,2,3},
				           {5,2,3},
				           {1,2,3}};
		int [] expect = {5,2,3};
		LatinSquare ls = new LatinSquare(puzzle);
		int [] re = ls.getRow(1);
		assertArrayEquals(expect,re);
	}
	
	@Test 
	public void getRow_Test2() {
		int [][] puzzle = {{1,2,3},
				           {5,2,3},
				           {9,9,9}};
		int [] expected = {9,9,9};
		LatinSquare ls = new LatinSquare(puzzle);
		int [] re = ls.getRow(2);
		assertArrayEquals(expected,re);
	}
	
	@Test  
	public void isLatinSquare_Test1() {
		int [] [] puzzle = {{1,2,3},
							{3,1,2},
							{2,3,1}};
		LatinSquare ls = new LatinSquare(puzzle);
		assertTrue(ls.isLatinSquare());
		}
	
	@Test 
	public void isLatinSquare_Test2() {
		int [][] puzzle = {{1,2,3,4},
						   {1,1,4,3},
						   {3,4,1,2},
						   {4,3,2,1}};
		LatinSquare ls = new LatinSquare(puzzle);
		assertFalse(ls.isLatinSquare());
		} 
	
	@Test
	public void isLatinSquare_Test3() {
		int [][] puzzle = {{1,2,3,4,5,6},
				           {2,3,9,5,6,1},
				           {3,4,5,6,1,2},
				           {4,5,6,1,2,3},
				           {5,6,1,2,3,4},
				           {6,1,2,3,4,5}};
		LatinSquare ls = new LatinSquare(puzzle);
		assertFalse(ls.isLatinSquare());
		}
	

	}
	



