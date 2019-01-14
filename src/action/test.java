package action;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.text.ParseException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.businessDao;
import po.business;
import po.manager;
import po.order;
import po.rider;
import service.businessService;
import service.managerService;
import service.orderService;
import service.riderService;

public class test extends ActionSupport {
	private ArrayList<order> orderlist;
	private Map session;
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public test() {
		session=ActionContext.getContext().getSession();
	}
	public ArrayList<order> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(ArrayList<order> orderlist) {
		this.orderlist = orderlist;
	}
	private manager loginUser;
	private rider registerUser;
	private business bregisterUser;
	private List items;
	private business cBusiness;
    private String columnName;
    private int count;
	public int getCount() {
		return count;
	}
	private rider loginriderUser;
    private business loginstoreUser;
    private order order;
    private rider rider;
    private business business;
    
	public business getBusiness() {
		return business;
	}
	public void setBusiness(business business) {
		this.business = business;
	}
	public order getOrder() {
		return order;
	}
	public void setOrder(order order) {
		this.order = order;
	}
	public rider getRider() {
		return rider;
	}
	public void setRider(rider rider) {
		this.rider = rider;
	}
	public rider getLoginriderUser() {
		return loginriderUser;
	}
	public void setLoginriderUser(rider loginriderUser) {
		this.loginriderUser = loginriderUser;
	}
	public business getLoginstoreUser() {
		return loginstoreUser;
	}
	public void setLoginstoreUser(business loginstoreUser) {
		this.loginstoreUser = loginstoreUser;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public business getcBusiness() {
		return cBusiness;
	}

	public void setcBusiness(business cBusiness) {
		this.cBusiness = cBusiness;
	}

	public business getBregisterUser() {
		return bregisterUser;
	}

	public void setBregisterUser(business bregisterUser) {
		this.bregisterUser = bregisterUser;
	}

	public rider getRegisterUser() {
		return registerUser;
	}

	public void setRegisterUser(rider registerUser) {
		this.registerUser = registerUser;
	}

	public manager getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(manager loginUser) {
		this.loginUser = loginUser;
	}

	/*
	 * public void validate() { String id = loginUser.getId(); String pwd =
	 * loginUser.getPwd(); if (id == null || id.equals("")) {
	 * this.addFieldError("loginUser.id", "�����������û�����"); } if (pwd == null ||
	 * pwd.equals("")) { this.addFieldError("loginUser.pwd", "��������������"); } }
	 */
	public String login() {
		managerService userServ = new managerService();
		orderService os=new orderService();
		orderlist=os.orderlist();
		session.put("orderlist", orderlist);
      if (userServ.login(loginUser)) {
			count=4;
			return "success";
		}
		return "fail";
	}

	public String riderreg() {
		riderService r = new riderService();
		try {
			r.register(registerUser);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "fail";
		}
	}

	public String busreg() {
		businessService r = new businessService();
		try {
			r.register(bregisterUser);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "fail";
		}
	}
    
	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}
	/*
	 * 
	 * 审核商家
	 */
	public String getAllItems() {
		businessService busServ = new businessService();
		
		if (!busServ.all().isEmpty()) {
			cBusiness=busServ.all().get(0);
			System.out.println(cBusiness.getId());
		return "success";    
		}
		else return "fail";
	}
       public String checkrider() {
		
    	   riderService ridServ = new riderService();
		if (!ridServ.all().isEmpty()) {
			registerUser=ridServ.all().get(0);
		return "success";    
		}
		else return "fail";
	}
	public String  pass() {
		businessService busServ = new businessService();
		cBusiness=busServ.all().get(0);
		busServ.pass(cBusiness.getId());
		return "success";
	}
	public String  unpass() {
		businessService busServ = new businessService();
		cBusiness=busServ.all().get(0);
		busServ.unpass(cBusiness.getId());
		return "success";
	}
	public String businessfind()
	{
		System.out.println(columnName);
		return "success";
	}
	public String riderpass()
	{
		riderService rs=new riderService();
		registerUser=rs.all().get(0);
		rs.pass(registerUser.getId());
		return "success";
	}
	public String riderunpass()
	{
		riderService rs=new riderService();
		registerUser=rs.all().get(0);
		rs.unpass(registerUser.getId());
		return "success";
	}
	
	public String login_rider() {
		riderService userServ = new riderService();
		orderService os=new orderService();
	/*	orderlist=os.orderlist();
		session.put("orderlist", orderlist);*/
      if (userServ.login_rider(loginriderUser)) {
			count=4;
			session.put("rider_ylm", loginriderUser);
			return "success";
		}
		return "fail";
	}
	public String finishorder() throws ParseException {
		riderService userServ = new riderService();
		orderService os=new orderService();
      if (os.finishorder(rider,order)) {
			count=4;
			//session.put("rider_ylm", loginriderUser);
			return "success";
		}
		return "fail";
	}
	public String qiangorder() throws ParseException {
		riderService userServ = new riderService();
		orderService os=new orderService();
      if (os.qiangorder(rider,order)) {
			count=4;
			//session.put("rider_ylm", loginriderUser);
			return "success";
		}
		return "fail";
	}
	public String login_store() {
		businessService userServ = new businessService();
		orderService os=new orderService();
		/*orderlist=os.orderlist();
		session.put("orderlist", orderlist);*/
		int num=1000;
		session.put("n", num);
      if (userServ.login_store(loginstoreUser)) {
			count=4;
			session.put("business_ylm", loginstoreUser);
			return "success";
		}
		return "fail";
	}
	public String updaterider() {
		riderService userServ = new riderService();
		orderService os=new orderService();
		/*orderlist=os.orderlist();
		session.put("orderlist", orderlist);*/
      if (userServ.updaterider(rider)) {
			count=4;
			session.put("rider_ylm1", rider);
			return "success";
		}
		return "fail";
	}
	public String updatestore() {
		businessService userServ = new businessService();
		orderService os=new orderService();
		/*orderlist=os.orderlist();
		session.put("orderlist", orderlist);*/
      if (userServ.updatestore(business)) {
			count=4;
			session.put("business_ylm1", business);
			return "success";
		}
		return "fail";
	}
	public String sendorder() {
		orderService r = new orderService();
		try {
			r.register(order);
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "fail";
		}
	}
}
