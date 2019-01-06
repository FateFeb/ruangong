package service;

import dao.businessDao;
import dao.riderDao;
import po.business;
import po.rider;

public class riderService {
	public void register(rider riderreg) {
		riderDao dao = new riderDao();
		dao.insert(riderreg);
	}
	public rider findbyId(String id)
	{
		riderDao b=new riderDao();
		rider t=b.findById(id);
		return t;
	}
	public rider findbyName(String name)
	{
		riderDao b=new riderDao();
		rider t=b.findByName(name);
		return t;
	}
	public rider findbyPhone(String phone)
	{
		riderDao b=new riderDao();
		rider t=b.findByPhone(phone);
		return t;
	}
}
