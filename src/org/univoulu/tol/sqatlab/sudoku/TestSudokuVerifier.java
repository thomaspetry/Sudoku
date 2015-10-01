package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectString ="123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	String tooLongString ="1234567899123456788912345677891234566789123455678912344567891233456789122345678914587";
	
	SudokuVerifier sudoku = new SudokuVerifier();

	@Test
	public void test81CharactersLongCorrectStringResults0() {
		int test = sudoku.ruleLength(correctString);
		assertEquals(test, test=0);
	}
	
	@Test
	public void test81CharactersLongTooLongStringResultsMinus5() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int test = sudoku.ruleLength(tooLongString);
		assertEquals(test, test=-5);
	}
	
	@Test
	public void testRule1Results0() {
		SudokuVerifier sudoku = new SudokuVerifier();
		int test = sudoku.ruleLength(tooLongString);
		assertEquals(test, test=-5);
	}

}
