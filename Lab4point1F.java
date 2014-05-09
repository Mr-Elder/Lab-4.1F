// ****************************************************************
//   Lab4point1F.java
//
//   This program will read in two names with each name having
//   the first middle and last name read in.
//          
// ****************************************************************
//import Student;

import static java.lang.System.out;
import java.util.Random;

public class Lab4point1F
{
    public static void main(String[] args)
    {
		
		Name person1, person2;
		
		person1 = new Name(GetInfo.getString("Enter first name : "), GetInfo.getString("Enter middle name : "), GetInfo.getString("Enter last name : "));
		person2 = new Name(GetInfo.getString("Enter first name : "), GetInfo.getString("Enter middle name : "), GetInfo.getString("Enter last name : "));
		
		GetInfo.showMessage("First middle last for person1 is : " + person1.firstMiddleLast() + "\n Last first middle is : " + person1.lastFirstMiddle() + "\nInitials : " + person1.initials() + "\nLength : " + person1.length());
				
		GetInfo.showMessage("First middle last for person2 is : " + person2.firstMiddleLast() + "\n Last first middle is : " + person2.lastFirstMiddle() + "\nInitials : " + person2.initials() + "\nLength : " + person2.length());
		
		if(person1.equals(person2)){
			 GetInfo.showMessage("They were the same name");
		}else{
			GetInfo.showMessage("They are not the same");
 		}
	}


}

