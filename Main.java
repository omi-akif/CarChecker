
public class Main {
	
	public static void main(String[] args) {
		
		//Tracing for getting the car in the production line
		Integer trace = 0;
		
		int inspectionLineState = 0;

		
		String carState = "IN"; // Initial state before inspection starts
		
		
		// To keep track of all the cars in different stations
		ListStack<Integer> tracker = new ListStack<Integer>(); 
		
		
		
		
		//Beginning of the line
		inspectionLineState++;
		
		
		// Inspection starts at 1
		
		tracker.push(trace);
		tracker.push(trace);
		tracker.push(trace);
		
		System.out.println("CAR STATUS: " + carState);
		
		// Car Deployed in Station 1
		inspectionLineState++;
		
		
		System.out.println("CAR STATUS: " + "Station 1 Complete = " + tracker.pop());
		

		
		
		// Car Deployed in Station 2
		inspectionLineState++;
		
		System.out.println("CAR STATUS: " + "Station 2 Complete = " + tracker.pop());
            		
		
		
		inspectionLineState++;
		
		System.out.println("CAR STATUS: " + "Station 3 Complete = " + tracker.pop());
		
		
		
		
		inspectionLineState++;
		
		carState = "OUT";
		System.out.println("CAR STATUS: " + carState);
	
		
		
	}

}
