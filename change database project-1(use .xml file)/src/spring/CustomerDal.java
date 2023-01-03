package spring;

public class CustomerDal implements ICustomerDal {
	String conectstring;
	
	public String getConectstring() {
		return conectstring;
	}

	public void setConectstring(String conectstring) {
		this.conectstring = conectstring;
	}

	public void add() {
		System.out.println("metinsel deg'er "+ conectstring);
		System.out.println("oracle eklendi");
	}


}
