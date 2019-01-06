package service;

import java.util.ArrayList;
import java.util.List;

import dao.businessDao;
import dao.riderDao;
import po.business;
import po.rider;

public class businessService {
	public void register(business busreg) {
			businessDao dao = new businessDao();
			dao.insert(busreg);
	}
	public List getAllItems() {
		businessDao dao = new businessDao();
		List items = dao.findAll();
		return items;
	}
	public ArrayList<business> all()
	{
		businessDao b=new businessDao();
		return b.findALLBusiness();
	}
	public void pass(String id)
	{
		businessDao b=new businessDao();
		b.pass(id);
	}
	public void unpass(String id)
	{
		businessDao b=new businessDao();
		b.unpass(id);
	}
	public business findbyId(String id)
	{
		businessDao b=new businessDao();
		business t=b.findById(id);
		return t;
	}
	public business findbyName(String name)
	{
		businessDao b=new businessDao();
		business t=b.findByName(name);
		return t;
	}
	public business findbyPhone(String phone)
	{
		businessDao b=new businessDao();
		business t=b.findByPhone(phone);
		return t;
	}
}
