import java.util.ArrayList;
import java.util.ListIterator;

public class Details implements doctor{
	
	private ArrayList<Observer> observers;
	private ArrayList<String> s;
	//Iterator<Observer> i=observers.iterator();
	ListIterator<Observer> li ;
	ListIterator<String> lii ;
	
	private String TimeSlot;
	private String DateSlot;
	private int observerId;
	/*private String aviSlot[][]=new String[10][3];
	{
	aviSlot[0][0]="10-02-2015";
	aviSlot[0][1]="2:00-3:00" ;
	}*/
	
	String arr[][]={{"10-02-2015","10:00-11:00","0"},{"10-02-2015","02:00-04:00","0"},{"12-02-2015","10:00-11:00","0"}}; 
    
	
	
	public Details(){
		
		observers = new ArrayList<Observer>();
		s=new ArrayList<String>();
	}
	
	public void addPatients(Observer newObserver,int a) {
		
		observers.add(newObserver);
		String ss=Integer.toString(a);
		//System.out.println(a+"\n");
		//System.out.println(ss);
		/*if(s.size()>0)
		{
			s.remove(0);
		}*/
		s.add(ss);
		li = observers.listIterator();
		lii=s.listIterator();
	}

	
	public void nextPat() {
		System.out.println("\nNext Patient\n");
		
		if(lii.hasNext())
		{
		 System.out.println(s.get(0));
		 s.remove(0);
		}
		else
		{
			System.out.println("NONE");
		}
		
	}
	
	public void setSlot(String DateSlot,String TimeSlot){
		
		this.DateSlot = DateSlot;
		this.TimeSlot = TimeSlot;
		System.out.println(DateSlot +" Date ");
		System.out.println(TimeSlot +" Time \n");
		for(int i=0;i<3;i++)
		{
		if(arr[i][0]==DateSlot && arr[i][1]==TimeSlot && arr[i][2]!="1")
		{
		arr[i][2]="1";
		System.out.println("Slot Booked: "+(i+1)+"\n");
		s.remove(0);
		}
		else
		{
			System.out.println("Slot Failed for Slot "+(i+1)+"\n");
		}
		}
		notifyDoc();
		for(Observer observer : observers){
			
			observer.update(DateSlot,TimeSlot);
			
		}
		
		
		
	}

	@Override
	public void avaiSlots() {
		// TODO Auto-generated method stub
		System.out.println("Available Slots");
		for(int i=0;i<3;i++)
		{
			if(arr[i][2]!="1")
			{
			System.out.println("Slot "+ (i+1));
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println("\n");
			}
		}
		
	}
	
	public void notifyDoc()
	{
		System.out.println("Available Slots After Booking \n");
		for(int i=0;i<3;i++)
		{
			if(arr[i][2]!="1")
			{
		    System.out.println("Slot "+ (i+1));
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			    }
			System.out.println("\n");
			}
		}
	}
	
	
	public void nextSlotAvail()
	{
		System.out.println("Next Free for Booking Slots Booking \n");
		for(int i=0;i<3;i++)
		{
			if(arr[i][2]!="1")
			{
		    System.out.println("Slot "+ (i+1));
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
				
			    }
			}
			break;
		}
	}
		
		
		
	
	
	
}