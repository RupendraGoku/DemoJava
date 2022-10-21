/*package in.ineuron.main;

public class Classsnippet {

	public static void main(String[] args) {
		int x=10;
		switch(x) 
		{
		System.out.println("hello");//missing --> case (statement parameter) 10:
		}

	}

}*/
//Statement is not a part of case lable so CompileTime Error
//Which means (System.out.println) isme case label nahi hai

/*package in.ineuron.main;

public class Classsnippet {

	public static void main(String[] args) {
		int x= 10; 
		int y = 20;
		switch(x) 
		{
		case 10:System.out.println("hello");
			break;
		case y:System.out.println("hiee");
			break;
		}

	}

}*/

// case expression constant expression hona cahiye --> case 10 naki case y {here compiler not know values of y its know data types only}
//but if you write like final int y=20 then compiler knows the values{final means compiler will get to know the value and compiler treats it as "CompileTime Constant".

/*package in.ineuron.main;
public class Classsnippet
{

public static void main(String[] args) 
	{
	int x = 10;
	final int y = 20;
	switch(x) {
	case 10:System.out.println("hello");
		break;
	case y:System.out.println("hiee");
		break;
			  }
	}

}
//final means compiler will get to know the value and compiler treats it as "CompileTime Constant".



/*package in.ineuron.main;
public class Classsnippet{ 
	public static void main(String args[]){
		int x=10; 
		switch(x+1) 
		{ 
			case 10:
			case 10+20:
			case  10+20+30:
		}
	}
}// kyuki case state... match nahi hai koi bhi x=(10+1)=11
*/


/*package in.ineuron.main;

public class Classsnippet
{
	public static void main(String[] args) 
	{
		byte x =10;
		switch(x) 
		{
		case 10:System.out.println("hello");
			break;
		case 100:System.out.println("hiee");
			break;
		case 1000:System.out.println("byee");// Type mismatch: cannot convert from int to byte 

			break;
		}
	
	}
}
*/
// kyuki case 1000 byte range se bahar hai 



/*package in.ineuron.main;
public class Classsnippet
{

	public static void main(String[] args) {
	
		byte x = 10;
		switch(x+1) // ye sahi hai kyuki yaha implicite type conversion ho raha matlab ki x (eg.->byte x=10) explicitely define keya gya hai
		{           // lekin [switch(x+1)] me compiler implicitely data conversion kar raha     
			case 10:System.out.println("hey");// x byte define hai magar switch me x+ 1-> yaha 1 ka default value int hai 
				break;                        //byte + int  ----> int   , so switch(int)
			case 100:System.out.println("hi");
				break;
			case 1000:System.out.println("byee");
				break;
		}
	}
}// no output beacause no case statme. satisfied see switch(x+1) matlb x=10+1=>11 kisi case me nahi hai 
*/

/*package in.ineuron.main;
 
public class Classsnippet
{
	
	public static void main(String[] args) {
		
		int x=97;
		switch(x) {
		case 97:System.out.println("97");
			break;
		case 'a':System.out.println("100"); // int x= 'a';	 x = 97
			break;
		}
	} // output--Duplicate case x=97
	           //Duplicate case 'a' == x kyu ki asci value 'a' ka 97 hota hai
	
}*/


package in.ineuron.main;
public class Classsnippet
{

public static void main(String[] args) 
	{
	int a = 5;
	int x = 10;
	switch(x) {
	case 10:a*=2;//System.out.println("hello");
	case 20:a*=3;
	case 30:a*=4;// casefall kyuki break state nahi hai to sara case run hoga uske baad output
			  }
	System.out.println(a);
	}
}
























































































