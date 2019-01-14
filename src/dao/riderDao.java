package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import po.business;
import po.rider;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class riderDao {
	private Log log = LogFactory.getLog(managerDao.class);
	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/ylm?useSSL=false";
	    String username = "root";
	    String password = "123456";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,���ض�Ӧ����
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	public static int update(String id,int state) {
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "update rider set state='" + state + "' where id='" + id + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        i = pstmt.executeUpdate();
	        System.out.println("resutl: " + i);
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	public static int insert(rider riderreg) {
		 
	
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "insert into rider (id,pwd,name,phone,state,money) values(?,?,?,?,?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setString(1, riderreg.getId());
	        pstmt.setString(2, riderreg.getPwd());
	        pstmt.setString(3, riderreg.getName());
	        pstmt.setString(4, riderreg.getPhone());
	        pstmt.setInt(5, 2);
	        pstmt.setInt(6, 0);
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	public List findByHql(String hql) {
		log.debug("finding CheckUser instance by hql");
		SessionFactory sf = null;
		sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		try {
			String queryString = hql;
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by hql failed", re);
			throw re;
		} finally {
			session.close();
		}
	}
	public rider findById(String id)
	{   
		 Connection conn = getConn();
		String sql="SELECT * FROM rider  where id="+id;
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        ResultSet rst=pstmt.executeQuery();
		        rider  b=new rider ();
		        while (rst.next()) {
		           b.setId(rst.getString("id"));
		           b.setName(rst.getString("name"));
		           b.setPhone(rst.getString("phone"));
		           b.setState(rst.getInt("state"));
		           b.setMoney(rst.getDouble("money"));
		           return b;
		             
		        }
		            System.out.println("============================");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return null;
	}
	public rider  findByName(String name)
	{   
		 Connection conn = getConn();
		String sql="SELECT * FROM rider  where name="+name;
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        ResultSet rst=pstmt.executeQuery();
		        rider  b=new rider();
		        while (rst.next()) {
		           b.setId(rst.getString("id"));
		           b.setName(rst.getString("name"));
		           b.setPhone(rst.getString("phone"));
		           b.setState(rst.getInt("state"));
		           b.setMoney(rst.getDouble("money"));
		           return b;
		             
		        }
		            System.out.println("============================");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return null;
	}
	public rider  findByPhone(String phone)
	{   
		 Connection conn = getConn();
		String sql="SELECT * FROM rider  where phone="+phone;
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        ResultSet rst=pstmt.executeQuery();
		        rider  b=new rider();
		        while (rst.next()) {
		           b.setId(rst.getString("id"));
		           b.setName(rst.getString("name"));
		           b.setPhone(rst.getString("phone"));
		           b.setState(rst.getInt("state"));
		           b.setMoney(rst.getDouble("money"));
		           return b;
		             
		        }
		            System.out.println("============================");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return null;
	}
	public ArrayList<rider> findALLRider()
	{   
		
		ArrayList<rider> b=new ArrayList<rider>();
		String sql="SELECT * FROM rider where state=2";
		try(Connection conn=getConn();
				PreparedStatement pstmt=(PreparedStatement)conn.prepareStatement(sql);
				ResultSet rst=pstmt.executeQuery())
		{   
			
			while(rst.next()) {
				rider s=new rider();
				s.setId(rst.getString("id"));
				s.setName(rst.getString("name"));
				s.setPhone(rst.getString("phone"));
				s.setMoney(rst.getDouble("money"));
				s.setState(rst.getInt("state"));
				b.add(s);
			}
			return b;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	public void pass(String id)
	{
		   Connection conn = getConn();
		    int i = 0;
		    int t=1;
		    String sql = "update rider set state='" +t+ "' where id='" + id + "'";
		    PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement) conn.prepareStatement(sql);
		        i = pstmt.executeUpdate();
		        System.out.println("resutl: " + i);
		        pstmt.close();
		        conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
	}
	public void unpass(String id)
	{
		   Connection conn = getConn();
		    int i = 0;
		    int t=3;
		    String sql = "update rider set state='" +t+ "' where id='" + id + "'";
		    PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement) conn.prepareStatement(sql);
		        i = pstmt.executeUpdate();
		        System.out.println("resutl: " + i);
		        pstmt.close();
		        conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
	}
	public boolean updaterider(rider r) {
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "update rider Set name='"+r.getName()+"', pwd='"+r.getPwd()+"',phone='"+r.getPhone()+"'WHERE id='"+r.getId()+"'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	        return true;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
}
