import java.util.ArrayList;
public class Main{

	public static void main(String[] args){

		//filename
		String filename = "../input.in";

		//instantiate a reader for the file
		Reader reader = new Reader(filename);

		//read the file
		Tiles[][] board = reader.readFile();

        ArrayList<Integer> act = new ArrayList<Integer>();
		State state = new State(board, board, reader.getKeeperXPos(), reader.getKeeperYPos(), act );



        Solver solve  = new Solver();
        ArrayList<Integer> ans = solve.actions(state);
        for (Integer temp : ans) {
			System.out.println(temp);
		}
    }
    
}