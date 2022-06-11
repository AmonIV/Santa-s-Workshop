package workshop;

public class Main {

	public static void main(String[] args) {
		//create santa and the dwarves
		Santa santa = Santa.getInstance();
		Dwarf jimbo = new DwarfWorker("Jimbo");
		Dwarf john = new DwarfWorker("John");
		Dwarf jordan = new DwarfWorker("Jordan");
		
		//get santa's magic board
		MagicBoard magicBoard = santa.getBoard();
		
		//subscribe the dwarves to the board
		magicBoard.subscribe(jimbo);
		magicBoard.subscribe(john);
		magicBoard.subscribe(jordan);
		
		//santa asks for bikes and the dwarves get them
		santa.orderBikes();
		
		//santa checks the toys
		santa.inspectToy(jimbo.showToy(), jimbo.getName());
		santa.inspectToy(john.showToy(), john.getName());
		santa.inspectToy(jordan.showToy(), jordan.getName());
		
		//santa asks for dolls and the dwarves get them
		santa.orderDolls();
		
		//santa checks the toys
		santa.inspectToy(jimbo.showToy(), jimbo.getName());
		santa.inspectToy(john.showToy(), john.getName());
		santa.inspectToy(jordan.showToy(), jordan.getName());
		
		//santa asks for different bikes and the dwarves get them
		santa.orderBmxBikes();
		
		//santa checks the toys
		santa.inspectToy(jimbo.showToy(), jimbo.getName());
		santa.inspectToy(john.showToy(), john.getName());
		santa.inspectToy(jordan.showToy(), jordan.getName());

	}

}
