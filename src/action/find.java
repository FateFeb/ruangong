package action;

import po.business;
import po.order;
import po.rider;
import service.businessService;
import service.orderService;
import service.riderService;

public class find {
	private String state;
	public String getState() {
		return state;
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
	public String businessfind()
	{   
		businessService t=new businessService();
		if(columnName.equals("�˺�"))  
		{
			b=t.findbyId(text);
			if(b==null) return "fail";
			System.out.println(b.getAddress());
			if(b.getState()==1)state="����ʹ��";
			if(b.getState()==2)state="Ƿ��";
			if(b.getState()==3)state="����";
			return "success";
		}
		else if(columnName.equals("����"))  
		{   
			System.out.println("����");
			b=t.findbyName(text);   
			if(b==null) return "fail";
			System.out.println(b.getAddress());
			if(b.getState()==1)state="����ʹ��";
			if(b.getState()==2)state="Ƿ��";
			if(b.getState()==3)state="����";
			return "success";
		}
		else
		{
			b=t.findbyPhone(text);
			if(b==null) return "fail";
			System.out.println(b.getAddress());
			if(b.getState()==1)state="����ʹ��";
			if(b.getState()==2)state="Ƿ��";
			if(b.getState()==3)state="����";
			return "success";
		}
	}
	public String riderfind()
	{   
		riderService t=new riderService();
		if(columnName.equals("�˺�"))  
		{
			r=t.findbyId(text);
			if(r==null) return "fail";
			
			return "success";
		}
		if(columnName.equals("����"))  
		{
			r=t.findbyName(text);
			if(r==null) return "fail";
		
			return "success";
		}
		if(columnName.equals("�绰"))  
		{
			r=t.findbyPhone(text);
			if(r==null) return "fail";

			return "success";
		}
		return "success";
	}
	
}
