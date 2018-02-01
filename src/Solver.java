import java.util.ArrayList<E>;
public class Solver{
    //constants
    private static final int MOVE_UP = 0;
    private static final int MOVE_LEFT = 1;
    private static final int MOVE_RIGHT = 2;
    private static final int MOVE_DOWN = 3;

    //arraylist of state
    private ArrayList<State> frontier;

    public Solver(){
        this.frontier = new ArrayList<State>();
    }

    private ArrayList<int> State actions(State currentState){
        ArrayList<int> possibleMoves = new ArrayList<int>();
    }


}