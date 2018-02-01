public class State{
    
    //current state of the board
    private String[][] currentState;

    //parent state of this state
    private String[][] parentState;

    //position of keeper
    private int xpos_keeper;
    private int ypos_keeper;

    //actions needed to arrive to this state from the initial state
    private String actions;

    //constructor
    public State(String[][] currentState, String[][] parentState, int x_keeper, int y_keeper, String actions){
        this.currentState = currentState;
        this.parentState = parentState;
        this.xpos_keeper = xpos_keeper;
        this.ypos_keeper = ypos_keeper;
        this.actions = actions;
    }

    //getters
    public String[][] getCurrentState(){
        return this.currentState;
    }

    public String[][] getParentState(){
        return this.parentState;
    }

    public int getXPosKeeper(){
        return this.xpos_keeper;
    }

    public int getYPosKeeper(){
        return this.ypos_keeper;
    }

    public String getActions(){
        return this.actions;
    }


}