package service;

import java.util.ArrayList;

import dao.businessDao;
import dao.riderDao;
import po.business;
import po.rider;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.managerDao;
import po.manager;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class riderService {
	public void register(rider riderreg) {
		riderDao dao = new riderDao();
		dao.insert(riderreg);
	}
private Map session;
	
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public riderService() {
		session=ActionContext.getContext().getSession();
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
	public ArrayList<rider> all()
	{
		riderDao b=new riderDao();
		return b.findALLRider();
	}
	public void pass(String id)
	{
		riderDao r=new riderDao();
		r.pass(id);
	}
	public void unpass(String id)
	{
		riderDao r=new riderDao();
		r.unpass(id);
	}
	public boolean login_rider(rider loginuser)
    {
  	  String id=loginuser.getId();
  	  String pwd=loginuser.getPwd();
  	  System.out.println(id);
  	  String hql="from rider  where id='" + id + "' and pwd='" + pwd + "'";
  	  riderDao dao = new riderDao();
		List<?> list = dao.findByHql(hql);
		rider r=new rider();
		r=(rider)list.get(0);
		session.put("rider_ylm1", r);
		if (list.isEmpty())
			return false;
		else
			return true;
    }
	public boolean updaterider(rider r)
	{
		riderDao o=new riderDao();
		if(o.updaterider(r))
			return true;
		else 
			return false;
	}
	public int changestate(String id,int state)
	{
		riderDao tDao=new riderDao();
		return tDao.update(id, state);
	}
}
