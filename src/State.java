import java.util.ArrayList;
public class State{
    
    //current state of the board
    private Tiles[][] currentState;

    //parent state of this state
    private Tiles[][] parentState;

    //position of keeper
    private int xpos_keeper;
    private int ypos_keeper;

    //actions needed to arrive to this state from the initial state
    private  ArrayList<Integer> actions;

    //constructor
    public State(Tiles[][] currentState, Tiles[][] parentState, int xpos_keeper, int ypos_keeper, ArrayList<Integer> actions){
        this.currentState = currentState;
        this.parentState = parentState;
        this.xpos_keeper = xpos_keeper;
        this.ypos_keeper = ypos_keeper;
        this.actions = actions;
    }

    //getters
    public Tiles[][] getCurrentState(){
        return this.currentState;
    }

    public Tiles[][] getParentState(){
        return this.parentState;
    }

    public int getXPosKeeper(){
        return this.xpos_keeper;
    }

    public int getYPosKeeper(){
        return this.ypos_keeper;
    }

    public ArrayList<Integer> getActions(){
        return this.actions;
    }


}