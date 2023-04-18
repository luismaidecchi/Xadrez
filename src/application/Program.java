package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		//Board board = new Board(8,8);
		
		//System.out.println(pos);
	
		
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
	
		
		
	
	}

}
