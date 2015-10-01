package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	
	public int verify(String candidateSolution) {
		return 0;
	}
	
	public int ruleLength(String sudoku) {
		if (sudoku.length() != 81)
			return -5;
		return 0;
	}

	public int rule1(String sudoku) {
		for( int i = 0; i < sudoku.length(); i++ )
		     if(!Character.isDigit(sudoku.charAt(i)))
		       return -1;
		return 0;
	}
}
