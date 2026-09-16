public class Challenger {
	public int rank;
	public String name;
	public String personality;

	public Challenger(String name, String personality, int rank) {
		this.name = name;
		this.personality=personality;
		this.rank=rank;
	}
	public String getName() {
		return name;
	}
	public String getPersonality() {
        return personality;
	}
	public int getRank() {
		return rank;
	}


}