// Represents each Observer that is monitoring changes in the subject

public class Time implements Observer {
	
	private String TimeSlot;
	
	private String DateSlot;
	
	
	private static int observerIDTracker = 0;
		
	public int observerID;
	
	
	private Details d;
	
	public Time(Details d){
		
	
		this.d = d;
		this.observerID = ++observerIDTracker;
		System.out.println("\nPatient Name " + this.observerID +" Patient  ID " + this.observerID);
		

		d.addPatients(this,observerID);
		
	}

	public void update(String DateSlot,String TimeSlot) {
		
		this.DateSlot = DateSlot;
		this.TimeSlot = TimeSlot;
		printTheSlot();
		
	}
	
	public void printTheSlot(){
		System.out.println("Updating to Doctor \n");
		System.out.println(observerID + "\nDate: " + DateSlot + "\nTime: " + 
				TimeSlot +  "\n");
		
	}
	
	public Details getDetail()
	{
		return (this.d);
		
	}
	
}