package hw2.agents.moveorder;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import hw2.chess.search.DFSTreeNode;


public class CustomMoveOrderer
{

	/**
	 * TODO: implement me!
	 * This method should perform move ordering. Remember, move ordering is how alpha-beta pruning gets part of its power from.
	 * You want to see nodes which are beneficial FIRST so you can prune as much as possible during the search (i.e. be faster)
	 * @param nodes. The nodes to order (these are children of a DFSTreeNode) that we are about to consider in the search.
	 * @return The ordered nodes.
	 */
	static class SortByHeur implements Comparator<DFSTreeNode> {  
		// Used for sorting in ascending order of ID  
		public int compare(DFSTreeNode a, DFSTreeNode b){  
		return (int) (a.getMaxPlayerHeuristicValue() - b.getMaxPlayerHeuristicValue());  
		    }  
		}  
	
	
	public static List<DFSTreeNode> order(List<DFSTreeNode> nodes)
	{
		// by default get the CaptureMoves first
			
				nodes.sort(new SortByHeur());
				return nodes;
				
	


}

}
