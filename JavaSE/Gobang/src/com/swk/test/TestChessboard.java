package com.swk.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.swk.gobang.Chessboard;

public class TestChessboard {
	
	Chessboard board=new Chessboard();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testInitBoard() 
	{
		board.initBoard();	
	}

	@Test
	public void testPrintBoard() {
		board.printBoard();
	}

	@Test
	public void testSetBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoard() {
		fail("Not yet implemented");
	}

}
