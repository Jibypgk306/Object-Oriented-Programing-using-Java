package encapsulation;

public class Display extends Stud {
	
	public void showdetails(String name,String adres,String email,int number,String proof,int proofid)
	{
		System.out.println(" Name:      "+name);
		System.out.println("\n Adress:     "+adres);
		System.out.println(" \nEmail:     "+email);
		System.out.println(" \nContact number:    "+number);
		System.out.println(" \nProof type:    "+proof);
		System.out.println(" \nProof type:    "+proofid);
	}
}
