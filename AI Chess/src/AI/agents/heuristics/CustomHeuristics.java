package hw2.agents.heuristics;

import hw2.chess.game.move.Move;
import hw2.chess.game.piece.Piece;
import hw2.chess.game.piece.PieceType;
import hw2.chess.game.player.Player;
import hw2.chess.search.DFSTreeNode;
import java.util.Set;

public class CustomHeuristics{
	
	public static Player getMinPlayer(DFSTreeNode node){
		return DefaultHeuristics.getMaxPlayer(node).equals(node.getGame().getCurrentPlayer()) ? node.getGame().getOtherPlayer() : node.getGame().getCurrentPlayer();
	}
	
	public static Player getMaxPlayer(DFSTreeNode node){
		return node.getMaxPlayer();
	}


		
	public static Set<Piece> maxpieces (DFSTreeNode node)
		{
			return  node.getGame().getBoard().getPieces(DefaultHeuristics.getMaxPlayer(node));

		}
	public static Set<Piece> minpieces (DFSTreeNode node)
	{
		return  node.getGame().getBoard().getPieces(DefaultHeuristics.getMinPlayer(node));

	}
	
	public static double maxpoints(DFSTreeNode node) {
		
		double counter=0;
		Set<Piece> maxpieces = maxpieces(node);
		
		for (Piece piece : maxpieces) {
			counter+=Piece.getPointValue(piece.getType());
			
			
		}
		return counter;
		
	}


	public static double minpoints(DFSTreeNode node) {
		
		Set<Piece> minpieces = maxpieces(node);
		double counter=0;
		
		for (Piece piece : minpieces) {
			counter+=Piece.getPointValue(piece.getType());
			
			
		}
		return counter;
		
	}
	
	

	
	
	
	/**
	 * TODO: implement me! The heuristics that I wrote are useful, but not very good for a good chessbot.
	 * Please use this class to add your heuristics here! I recommend taking a look at the ones I provided for you
	 * in DefaultHeuristics.java (which is in the same directory as this file)
	 */
	public static double getMaxPlayerHeuristicValue(DFSTreeNode node){
		System.out.print("This is the hueristic noting");
		System.out.print(maxpoints(node)- minpoints(node));
		return maxpoints(node)- minpoints(node);
		
		
	}
}


	
