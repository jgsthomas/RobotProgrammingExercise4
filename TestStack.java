import java.util.ArrayList;
import java.util.Iterator;

import rp13.search.interfaces.Agenda;
import rp13.search.problem.puzzle.EightPuzzle;
import rp13.search.problem.puzzle.EightPuzzle.PuzzleMove;
import rp13.search.util.ActionStatePair;


public class TestStack<ActionStatePair> implements Agenda {
	
	private static ArrayList<ActionStatePair<PuzzleMove,EightPuzzle>> list;
		
	
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void push(Object _item) {
		// TODO Auto-generated method stub
		list.add( _item);
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object _item) {
		// TODO Auto-generated method stub
		return false;
	}

}
