
public abstract class Entity {
	private int uid =0;

	public Entity () {
		this.uid += 1;
	}
	public int getUid() {
		return uid;
	}
}
