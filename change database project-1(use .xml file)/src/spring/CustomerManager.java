package spring;

public class CustomerManager implements CustomerService {
	private ICustomerDal customerDal;
	
	//public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;}
	
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
		}
}
