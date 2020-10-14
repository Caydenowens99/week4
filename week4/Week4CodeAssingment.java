package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4CodeAssingment {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> employeeNames = new ArrayList <String>();
		employeeNames.add("Jim");
		employeeNames.add("Dwight");
		employeeNames.add("Oscar");
		employeeNames.add("Kevin");
		employeeNames.add("Micahel");
		
		Map <Integer, String> employeeMap = new HashMap <Integer, String>();

		
		Set <Integer> ids = new HashSet <Integer>();
		
		int counter =0;
		for(String name: employeeNames) {
			ids.add(counter);
			counter++;
		}
		
		
			
		for (int id : ids ) {
			employeeMap.put(id, employeeNames.get(id));
		}
		System.out.println(employeeMap);
		
	    Set <Integer> x = employeeMap.keySet();
	   
	    for (int id : employeeMap.keySet()) {
	    	System.out.println(id + " : " + employeeMap.get(id));
	    }
	    	
	    StringBuilder idsBuilder = new StringBuilder();
	    
	    	for (int id : ids) {
	    		idsBuilder.append(id + " - ");
	    	}
	 	    System.out.println(idsBuilder);

	 	    StringBuilder namesBuilder = new StringBuilder();
	 	 
	 	    for (String name : employeeNames) {
	 	    	namesBuilder.append(name + " - ");
	 	    }
	 	    System.out.println(namesBuilder);
	 
	
	    
	    
	    
		}
			
	
		

		
	}

