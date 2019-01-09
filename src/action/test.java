package action;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	

}
