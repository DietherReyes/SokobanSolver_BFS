import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader{
	
	//constant variable
	private static final int MAX_COL = 10;
	private static final int MAX_ROW = 10;
	private static final int INITIAL_ROW = 0;
	public static final String KEEPER_NONSTORAGE = "k";
	public static final String KEEPER_INSTORAGE = "K";


	//input file to be read
	private String filename;
	private Tiles[][] board;
	
	//coordinated of the keeper
	private int xpos_keeper;
    private int ypos_keeper;

	//constructor of reader
	public Reader(String filename){
		this.filename = filename;
		this.board = new Tiles[MAX_ROW][MAX_COL];
		
	}
	

	//reads file and returns a 2d array
	public Tiles[][] readFile(){

		try{
			//reader per line
			BufferedReader reader = new BufferedReader(new FileReader(this.filename));
			String nextLine = reader.readLine();
			int currentRow = INITIAL_ROW;
			int iterator;
	
			while(nextLine != null){
				String[] line = nextLine.split(" ");
				for(iterator = 0; iterator < MAX_COL; iterator++){
					if(line[iterator].equals(KEEPER_INSTORAGE) || line[iterator].equals(KEEPER_NONSTORAGE)){
						this.xpos_keeper = currentRow;
						this.ypos_keeper = iterator;

						
					}
					this.board[currentRow][iterator] = new Tiles(currentRow, iterator, line[iterator]);
				}
				currentRow++;
				nextLine = reader.readLine();
			}
	
			
			return this.board;
		}catch(IOException ex){

			System.out.println("file not found");

		}	
		
		return this.board;
	}

	//getters
	public int getKeeperXPos(){
		return this.xpos_keeper;
	}

	public int getKeeperYPos(){
		return this.ypos_keeper;
	}

}