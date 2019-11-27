package encapsulation;
public class cust {
	String name;
	String adres;
	String number;
	String email;
	String proof;
	String proofid;
	public String getName() {
		return name;
	}
	public boolean setName(String name)
    {
        if (name.matches("^[a-z]*$"))
        {
            this.name=name;
            return true;
        }
        else
        {
            System.out.println("Invalid Name");
            return false;
        }
    }
	public String getAdres() {
		return adres;
	}
	public boolean setAdres(String adres)
    {
        if (adres.matches("^[a-z]*$"))
        {
            this.adres=adres;
            return true;
        }
        else
        {
            System.out.println("Invalid Adress");
            return false;
        }
    }
	public String getNumber() {
		return number;
	}
	public boolean setNumber(String number)
    {
        if (number.matches("^[0-9]*$"))
        {
            this.number=number;
            return true;
        }
        else
        {
            System.out.println("Invalid Contact Number");
            return false;
        }
    }
	public String getEmail()
    {
        return this.email;
    }

	public boolean setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
            System.out.println("Invalid Email");
            return false;
        }
    }
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	
}