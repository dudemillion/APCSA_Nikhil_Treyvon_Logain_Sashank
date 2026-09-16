public class Challenger {
	public int rank;
	public String name;
	public Personality personality;

	public Challenger(String name, Personality personality, int rank) {
		this.name = name;
		this.personality=personality;
		this.rank=rank;
	}
	public String getName() {
		return name;
	}
	public Personality getPersonality() {
        return personality;
	}
	public int getRank() {
		return rank;
	}


}