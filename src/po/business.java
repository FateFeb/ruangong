package po;

public class business {
	private String id;
	private String pwd;
	private String address;
	private String name;
	private String phone;
	private int state;
	private double money;
	public business() {
		// TODO Auto-generated constructor stub
	}
	
	public business(String id,String pwd,String address,String name,String phone,int state,double money)
	{
		
	this.id=id;
	this.pwd=pwd;
	this.address=address;
	this.name=name;
	this.phone=phone;
	this.state=state;
	this.money=money;
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}
