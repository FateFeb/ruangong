package po;

public class rider {
  private String id;
  private String pwd;
  private String name;
  private String phone;
  private int state;
  private double money;
  public rider() {
	// TODO Auto-generated constructor stub
}
  public rider(String id,String pwd,String name,String phone,int state,double money)
{
this.id=id;
this.pwd=pwd;
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
