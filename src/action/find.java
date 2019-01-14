package action;

import po.business;
import po.order;
import po.rider;
import service.businessService;
import service.orderService;
import service.riderService;
import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import dao.businessDao;
import dao.riderDao;

public class find {
	private String state;
	private Map session;
	public find() {
		session=ActionContext.getContext().getSession();
	}
	public String getState() {
		return state;
	}
ArrayList<order> ol=new ArrayList();
	
	public ArrayList<order> getOl() {
		return ol;
	}
	public void setOl(ArrayList<order> ol) {
		this.ol = ol;
	}
	public void setState(String state) {
		this.state = state;
	}
	private order order;
	public order getOrder() {
		return order;
	}
	public void setOrder(order order) {
		this.order = order;
	}
	private rider r;
	public rider getR() {
		return r;
	}
	public void setR(rider r) {
		this.r = r;
	}
	private business b;
	public business getB() {
		return b;
	}
	public void setB(business b) {
		this.b = b;
	}
	private String text;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	private String columnName;
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String orderfind()
	{
		orderService t=new orderService();
		order=t.findbyId(text);
		if(order==null) return "fail";
		System.out.println(order.getBid());
		System.out.println("666");
		return "success";
		
	}
	public String riderfindo2()
	{
		orderService t=new orderService();
		if(columnName.equals("查询可抢订单"))  
		{
		 rider r=new rider();
		 r=(rider)session.get("rider_ylm");
		 System.out.println(r.getId());
		 ol=t.rfindorderlist();
		 return "success1";
		}
		else if(columnName.equals("查询已抢未完成订单")){
			rider r=new rider();
			 r=(rider)session.get("rider_ylm");
			 System.out.println(r.getId());
		  ol=t.rfindorder2list(r);
			 return "success2";
		}
		else {
			rider r=new rider();
			 r=(rider)session.get("rider_ylm");
			 System.out.println(r.getId());
		  ol=t.rfindorder3list(r);
			 return "success3";
		}
	}
	public String storefindo()
	{
		orderService t=new orderService();
		if(columnName.equals("查询未接订单"))  
		{
		 business r=new business();
		 r=(business)session.get("business_ylm");
		 System.out.println(r.getId());
		 ol=t.sfindorderlist(r);
		 return "success1";
		}
		else if(columnName.equals("查询已接未完成订单")){
			business r=new business();
			 r=(business)session.get("business_ylm");
			 System.out.println(r.getId());
		  ol=t.sfindorder2list(r);
			 return "success2";
		}
		else {
			business r=new business();
			 r=(business)session.get("business_ylm");
			 System.out.println(r.getId());
		  ol=t.sfindorder3list(r);
			 return "success3";
		}
	}
	public String businessfind()
	{   
		businessService t=new businessService();
		if(columnName.equals("账号"))  
		{
			b=t.findbyId(text);
			if(b==null) return "fail";
			System.out.println(b.getAddress());
			if(b.getState()==1)state="正常";
			if(b.getState()==2)state="待审核";
			if(b.getState()==3)state="冻结";
			return "success";
		}
		else if(columnName.equals("名称"))  
		{   
			b=t.findbyName(text);   
			if(b==null) return "fail";
			System.out.println(b.getAddress());
			if(b.getState()==1)state="正常";
			if(b.getState()==2)state="待审核";
			if(b.getState()==3)state="冻结";
			return "success";
		}
		else
		{
			b=t.findbyPhone(text);
			if(b==null) return "fail";
			System.out.println(b.getAddress());
			if(b.getState()==1)state="正常";
			if(b.getState()==2)state="待审核";
			if(b.getState()==3)state="冻结";
			return "success";
		}
	}
	public String riderfind()
	{   
		riderService t=new riderService();
		if(columnName.equals("账号"))  
		{
			r=t.findbyId(text);
			if(r==null) return "fail";
			if(r.getState()==1)state="正常";
			if(r.getState()==2)state="待审核";
			if(r.getState()==3)state="冻结";
			return "success";
		}
		if(columnName.equals("电话"))  
		{
			r=t.findbyPhone(text);
			if(r==null) return "fail";
			if(r.getState()==1)state="正常";
			if(r.getState()==2)state="待审核";
			if(r.getState()==3)state="冻结";
			return "success";
		}
		return "success";
	}
	public String toone()
	{return "success";}
	public String tothree()
	{return "success";}
	public String toone2()
	{
		if(columnName.equals("商家"))  
		{
			businessDao t=new businessDao();
			int o=t.update(text, 1);
			System.out.println(o);
			if(o!=0) return "success";
		}
		if(columnName.equals("骑手"))  
		{
			riderDao t=new riderDao();
			int o=t.update(text, 1);
			System.out.println(o);
			if(o!=0) return "success";
		}
		return "fail";
	}
	public String tothree2()
	{
		if(columnName.equals("商家"))  
		{
			businessDao t=new businessDao();
			int o=t.update(text, 3);
			System.out.println(o);
			if(o!=0) return "success";
		}
		if(columnName.equals("骑手"))  
		{
			riderDao t=new riderDao();
			int o=t.update(text, 3);
			System.out.println(o);
			if(o!=0) return "success";
		}
		return "fail";
	}
	
}
