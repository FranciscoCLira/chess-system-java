package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;   // nao é necessario colocar 
	}

	protected  Board getBoard() {
		return board;
	}


}
