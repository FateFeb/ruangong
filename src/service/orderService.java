package service;
import java.util.ArrayList;

import dao.orderDao;
import dao.riderDao;
import po.order;
import po.rider;
import java.text.ParseException;
import dao.businessDao;
import po.business;
public class orderService {
	public order findbyId(String id)
	{
		orderDao b=new orderDao();
		System.out.println("123");
		order t=b.findById(id);
		System.out.println("456");
		return t;
	}
	public ArrayList<order> orderlist()
	{
		orderDao o=new orderDao();
		return o.findALLOrder();
	}
	public ArrayList<order> rfindorderlist()    //��ѯ����
	{
		orderDao o=new orderDao();
		return o.rfindorderlist();
	}
	
	public ArrayList<order> rfindorder2list(rider r) 
	{
		orderDao o=new orderDao();
		return o.rfindorder2list(r);
	}
	public ArrayList<order> rfindorder3list(rider r) 
	{
		orderDao o=new orderDao();
		return o.rfindorder3list(r);
	}
	
	public boolean finishorder(rider r,order or) throws ParseException
	{
		orderDao o=new orderDao();
		if(o.finishorder(r,or))
			return true;
		else 
			return false;
	}
	public boolean qiangorder(rider r,order or) throws ParseException
	{
		orderDao o=new orderDao();
		if(o.qiangorder(r,or))
			return true;
		else 
			return false;
	}
	public boolean register(order busreg) throws ParseException {
		orderDao dao = new orderDao();
		if(dao.insert(busreg))
			return true;
		else
			return false;
}
	public ArrayList<order> sfindorderlist(business r)  
	{
		orderDao o=new orderDao();
		return o.sfindorderlist(r);
	}
	
	public ArrayList<order> sfindorder2list(business r) 
	{
		orderDao o=new orderDao();
		return o.sfindorder2list(r);
	}
	public ArrayList<order> sfindorder3list(business r) 
	{
		orderDao o=new orderDao();
		return o.sfindorder3list(r);
	}
}
