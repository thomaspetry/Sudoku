package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectString ="123456789912345678891234567789123456678912345567891234456789123345678912234567891";

	@Test
	public void test81CharactersLongCorrectString() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int test = sudoku.verify(correctString);
		assertEquals(test, test=0);
	}
	
	@Test
	public void test81CharactersLongIncorrectString() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int test = sudoku.verify(incorrectString);
		assertEquals(test, test=-5);
	}

}
