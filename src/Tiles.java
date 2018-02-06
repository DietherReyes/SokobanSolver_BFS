public class Tiles{
	//constants
	public static final String BOX_NONSTORAGE = "b";
	public static final String BOX_INSTORAGE = "B";
	public static final String EMPTY_FLOOR = "e";
	public static final String KEEPER_NONSTORAGE = "k";
	public static final String KEEPER_INSTORAGE = "K";
	public static final String STORAGE = "s";
	public static final String WALL = "w";
	public static final String VOID = "x";

	//coordinates
	private int xPos;
	private int yPos;

	//holder of the default tile type
	private String root;

	//holder of the current tile type
	private String current;

	//constructor
	public Tiles(int xPos, int yPos, String current){
		this.xPos = xPos;
		this.yPos = yPos;
		this.current = current;
		//set the root
		this.setRoot();
		
	}

	//set the default tile, depends on the current tile
	private void setRoot(){
		switch(this.current){
			
			case BOX_INSTORAGE:
				this.root = STORAGE; break;
			case KEEPER_INSTORAGE:
				this.root = STORAGE; break;
			case WALL:
				this.root = WALL; break;
			case VOID:
				this.root = VOID; break;
			case STORAGE: 
				this.root = STORAGE; break;
			default:
				this.root = EMPTY_FLOOR; break;

		}
	}



	//getters and setters
	public void setCurrent(String current){
		this.current = current;
	}

	public String getCurrent(){
		return this.current;
	}

	public String getRoot(){
		return this.root;
	}

}