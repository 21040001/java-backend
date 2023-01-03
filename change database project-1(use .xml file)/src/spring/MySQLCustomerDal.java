package spring;

public class MySQLCustomerDal implements ICustomerDal{
	String conectstring;
	
	public String getConectstring() {
		return conectstring;
	}

	public void setConectstring(String conectstring) {
		this.conectstring = conectstring;
	}


	@Override
	public void add() {
		System.out.println("conect string:" + conectstring);
		System.out.println("MySQL eklendi");
		
	}

}
