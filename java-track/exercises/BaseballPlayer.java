
public class BaseballPlayer {
	private String name;
	private int number;
	private int hits;
	private int runs;
	private int rbi;
	private int gamesplayed;
	private int handedness;

	public BaseballPlayer(String name, int number, int hits, int runs, int rbi, int gamesplayed, int handedness) {
		this.name = name;
		this.number = number;
		this.hits = hits;
		this.runs = runs;
		this.rbi = rbi;
		this.gamesplayed = gamesplayed;
		this.handedness = handedness;
	}

	public void gamesCompleted(int hits, int rbi) {
		this.hits += hits;
		this.rbi += rbi;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getRbi() {
		return rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public int getGamesplayed() {
		return gamesplayed;
	}

	public void setGamesplayed(int gamesplayed) {
		this.gamesplayed = gamesplayed;
	}

	public int getHandedness() {
		return handedness;
	}

	public void setHandedness(int handedness) {
		this.handedness = handedness;
	}

}