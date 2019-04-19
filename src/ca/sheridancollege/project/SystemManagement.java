package ca.sheridancollege.project;



public abstract class SystemManagement extends Game {

	private int playerID;

    public SystemManagement(String givenName, String name) {
        super(givenName, name);
    }

	public int getPlayerID() {
		return this.playerID;
	}

	/**
	 * 
	 * @param playerID
	 */
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public abstract void declareWinner();
        
   
}