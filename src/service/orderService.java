package service;
import java.util.ArrayList;

import dao.orderDao;
import dao.riderDao;
import po.order;
import po.rider;
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

}
