package workshop;

public interface MagicBoard {
	
	void subscribe(Dwarf dwarf);
	void unsubscribe(Dwarf dwarf);
	
	void notifyDwarves();
	String getUpdate();
}
