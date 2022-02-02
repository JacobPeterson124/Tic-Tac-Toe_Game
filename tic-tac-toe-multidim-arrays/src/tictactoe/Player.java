package tictactoe;

public interface Player {
	
	Symbol getSymbol();
	
	Position getMove(Game game);

}
