public class Client{
	
	public static void main(String[] args){
		
		// Create the Subject object
		// It will handle updating all observers 
		// as well as deleting and adding them
		
		Details t = new Details();
		
		// Create an Observer that will be sent updates from Subject
		
		Time observer1 = new Time(t);
		
		t.avaiSlots();
		t.setSlot("12-02-2015", "10:00-11:00");
	
		//t.nextPat();
		t.nextSlotAvail();
		
		Time observer2 = new Time(t);
		t.avaiSlots();
		t.nextPat();
		t.setSlot("12-02-2015", "10:00-11:00");
		t.nextPat();
		
		Time observer3 = new Time(t);	
		t.nextSlotAvail();
		t.nextPat();
	}
	
}