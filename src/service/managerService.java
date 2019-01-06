package service;

import po.manager;

import java.util.List;

import dao.managerDao;
public class managerService {
      public boolean login(manager loginuser)
      {
    	  String id=loginuser.getId();
    	  String pwd=loginuser.getPwd();
    	  String hql="from manager as user  where id='" + id + "' and pwd='" + pwd + "'";
    	  managerDao dao = new managerDao();
  		List<?> list = dao.findByHql(hql);
  		if (list.isEmpty())
  			return false;
  		else
  			return true;
      }
}
