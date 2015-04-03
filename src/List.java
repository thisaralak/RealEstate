
public abstract class List {

	protected Listable[] list;
	protected int numItems;
	protected int currentPos;
	
	public List(int maxItem){
		numItems=0;
		list= new Listable[maxItem];
	}
	
	public boolean isFull() {
		return (list.length==numItems);
	}
	
	public int lengthIs() {
		return numItems;
	}
	
	public abstract boolean isThere(Listable item);
	
	public abstract Listable retrieve(Listable item);
	
	public abstract void insert(Listable item);
	
	public abstract void delete(Listable item);
	
	public  void reset(){
		currentPos=0;
	}
	
	public Listable getNextItem() {
		Listable next = list[currentPos];
		if(currentPos==numItems-1)
			currentPos=0;
		else
			currentPos++;
		return next.copy();
	}
}
