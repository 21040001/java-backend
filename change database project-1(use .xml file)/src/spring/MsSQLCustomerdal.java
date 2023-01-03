package spring;

public class MsSQLCustomerdal implements ICustomerDal{
	String conectstring;
	
	public String getConectstring() {
		return conectstring;
	}

	public void setConectstring(String conectstring) {
		this.conectstring = conectstring;
	}

	@Override
	public void add() {
		System.out.println("ms sql stringi");
		System.out.println("MsSQL eklendi");
		
		
	}
	
