import java.util.ArrayList;
public class Solver{
    //constants
    private static final int MOVE_UP = 1;
	private static final int MOVE_LEFT = 2;
	private static final int MOVE_RIGHT = 3;
	private static final int MOVE_DOWN = 4;

    public static final String BOX_NONSTORAGE = "b";
	public static final String BOX_INSTORAGE = "B";
	public static final String EMPTY_FLOOR = "e";
	public static final String KEEPER_NONSTORAGE = "k";
	public static final String KEEPER_INSTORAGE = "K";
	public static final String STORAGE = "s";
	public static final String WALL = "w";
	public static final String VOID = "x";

    //arraylist of state
    private ArrayList<State> frontier;
    private ArrayList<State> exploredList;

    public Solver(){
        this.frontier = new ArrayList<State>();
        this.exploredList = new ArrayList<State>();
    }

    //checks if movement is possible
    private boolean checkMove(int xAdder, int yAdder, State state){
       
        if(state.getCurrentState()[state.getXPosKeeper() + xAdder][state.getYPosKeeper() + yAdder].getCurrent().equals(WALL)){
            System.out.println("1st");
            return false;
        }
        if(state.getCurrentState()[state.getXPosKeeper() + xAdder][state.getYPosKeeper() + yAdder].getCurrent().equals(BOX_INSTORAGE) || 
            state.getCurrentState()[state.getXPosKeeper() + xAdder][state.getYPosKeeper() + yAdder].getCurrent().equals(BOX_NONSTORAGE) ){
            
            if(state.getCurrentState()[state.getXPosKeeper() + xAdder + xAdder][state.getYPosKeeper() + yAdder + yAdder].getCurrent().equals(WALL) || 
               state.getCurrentState()[state.getXPosKeeper() + xAdder + xAdder][state.getYPosKeeper() + yAdder + yAdder].getCurrent().equals(BOX_INSTORAGE) || 
               state.getCurrentState()[state.getXPosKeeper() + xAdder + xAdder][state.getYPosKeeper() + yAdder + yAdder].getCurrent().equals(BOX_NONSTORAGE)){
                System.out.println("2nd");
                return false;
            }
        }
        //System.out.println(state.getCurrentState()[state.getXPosKeeper() + xAdder][state.getYPosKeeper() + yAdder]);
        return true;
    }

    //checks all possible moves
    public ArrayList<Integer> actions(State currentState){
        ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
        if(checkMove(0,-1,currentState)){
            possibleMoves.add(MOVE_LEFT);
        }
        if(checkMove(0, 1,currentState)){
            possibleMoves.add(MOVE_RIGHT);
        }
        if(checkMove(-1,0,currentState)){
            possibleMoves.add(MOVE_UP);
        }
        if(checkMove(1,0,currentState)){
            possibleMoves.add(MOVE_DOWN);
        }
        return possibleMoves;
    }

    // private State move(State state, xAdder, yAdder, int direction){
    //     if(state.getCurrentState()[state.getXPosKeeper() + xAdder][state.getYPosKeeper() + yAdder].equals(EMPTY_FLOOR) ||
    //         state.getCurrentState()[state.getXPosKeeper() + xAdder][state.getYPosKeeper() + yAdder].equals(STORAGE) ){
            
    //         State newstate = new State(state.getCurrentState(), state.getCurrentState(), state.getXPosKeeper() + xAdder, state.getYPosKeeper() + yAdder, state.getActions().add(direction));
            

    //     }
    // }

    // private State results(State state, int direction){

    // }


}