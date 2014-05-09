//*******************************************************
// Name.java
//
// Write a class Name that stores a person's first, 
// middle, and last names.
//*******************************************************

public class Name
{
  private String first;
  private String middle;
  private String last;


  //----------------------------------------------
  //Constructor -- 
  //----------------------------------------------
  public Name(String firstName, String middleName, String lastName)
  {
   	first = firstName;
    middle = middleName;
    last = lastName;
  }
  
  public String getFirst(){
  	return first;
  }
  
  public String getMiddle(){
  	return middle;
  }
  
  public String getLast(){
  	return last;
  }
  
  public String firstMiddleLast(){
  	return first + " " + middle + " " + last;
  }
  
  public String lastFirstMiddle(){
  	return last + ", " + first + " " + middle;
  }

	public boolean equals(Name name){
		return (first.equalsIgnoreCase(name.getFirst()) && middle.equalsIgnoreCase(name.getMiddle()) && last.equalsIgnoreCase(name.getLast()));
	}
	
	public int length(){
		return first.length() + middle.length() + last.length();
	}
	
	public String initials(){
		return first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
	}






}

