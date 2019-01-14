package service;

import java.util.ArrayList;
import java.util.List;

import dao.businessDao;
import dao.riderDao;
import po.business;
import po.rider;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.managerDao;
import po.manager;
public class businessService {
	public void register(business busreg) {
			businessDao dao = new businessDao();
			dao.insert(busreg);
	}
private Map session;
	
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public businessService()
	{
		session=ActionContext.getContext().getSession();
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
	 public boolean login_store(business loginuser)
     {
   	  String id=loginuser.getId();
   	  String pwd=loginuser.getPwd();
   	  String hql="from business as user  where id='" + id + "' and pwd='" + pwd + "'";
   	  businessDao dao = new businessDao();
 		List<?> list = dao.findByHql(hql);
 		business r=new business();
		r=(business)list.get(0);
		session.put("business_ylm1", r);
		if (list.isEmpty())
			return false;
		else
			return true;
    }
	public boolean updatestore(business r)
	{
		businessDao o=new businessDao();
		if(o.updatestore(r))
			return true;
		else 
			return false;
	}
	public int changestate(String id,int state)
	{   
		businessDao o=new businessDao();
		return o.update(id, state);
	}
}
