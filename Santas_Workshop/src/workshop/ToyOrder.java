package workshop;

import java.util.ArrayList;
import java.util.List;

public class ToyOrder implements MagicBoard {

	private List<Dwarf> dwarves;
	private String toyType;
	
	public ToyOrder() {
		this.dwarves = new ArrayList<>();
	}

	@Override
	public void subscribe(Dwarf dwarf) {
		this.dwarves.add(dwarf);
		dwarf.setToy(this);
	}

	@Override
	public void unsubscribe(Dwarf dwarf) {
		this.dwarves.remove(dwarf);
		dwarf.setToy(null);
	}

	@Override
	public void notifyDwarves() {
		for(Dwarf dwarf: this.dwarves) {
			dwarf.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.toyType;
	}

	public void setToyType(String toyType) {
		this.toyType = toyType;
		this.notifyDwarves();
	}

}