import java.util.ArrayList;
import java.util.List;

import rp13.search.problem.puzzle.EightPuzzle;
import rp13.search.problem.puzzle.EightPuzzle.PuzzleMove;
import rp13.search.problem.puzzle.EightPuzzleSuccessorFunction;
import rp13.search.util.ActionStatePair;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			EightPuzzle state = EightPuzzle.orderedEightPuzzle();
			EightPuzzleSuccessorFunction sf = new EightPuzzleSuccessorFunction();
			System.out.println(state);
			
			List<ActionStatePair<PuzzleMove,EightPuzzle>> successors = new ArrayList<ActionStatePair<PuzzleMove, EightPuzzle>>();
			sf.getSuccessors(state, successors);
			
			for (ActionStatePair<PuzzleMove, EightPuzzle> actionStatePair : successors) {
				System.out.println("Applied move " + actionStatePair.getAction() + " and got:");
				System.out.println(actionStatePair.getState());
				
				state = actionStatePair.getState();
				//sf.getSuccessors(state, successors);
				
			}
			
			
	}

}
