package dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import po.business;
import po.rider;

public class businessDao {
	DataSource dataSource;
	private static final Log log = LogFactory.getLog(business.class);
	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/ylm";
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
	public static int insert(business businessreg) {
		 
	
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "insert into business (id,pwd,name,phone,address,state) values(?,?,?,?,?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setString(1, businessreg.getId());
	        pstmt.setString(2, businessreg.getPwd());
	        pstmt.setString(3, businessreg.getName());
	        pstmt.setString(4, businessreg.getPhone());
	        pstmt.setString(5, businessreg.getAddress());
	        pstmt.setInt(6, 2);
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	public static int update(String id,int state) {
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "update business set state='" + state + "' where id='" + id + "'";
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
	public List findAll() {
		log.debug("finding all Item instances");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		try {
			String queryString = "from business";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		} finally {
			session.close();
		}
	}
	public ArrayList<business> findALLBusiness()
	{   
		
		ArrayList<business> b=new ArrayList<business>();
		String sql="SELECT * FROM business where state=2";
		try(Connection conn=getConn();
				PreparedStatement pstmt=(PreparedStatement)conn.prepareStatement(sql);
				ResultSet rst=pstmt.executeQuery())
		{   
			
			while(rst.next()) {
				business s=new business();
				s.setId(rst.getString("id"));
				s.setName(rst.getString("name"));
				s.setAddress(rst.getString("address"));
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
		    String sql = "update business set state='" +t+ "' where id='" + id + "'";
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
		    String sql = "update business set state='" +t+ "' where id='" + id + "'";
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
	public business findById(String id)
	{   
		 Connection conn = getConn();
		String sql="SELECT * FROM business where id="+id;
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        ResultSet rst=pstmt.executeQuery();
	            business b=new business();
		        while (rst.next()) {
		           b.setId(rst.getString("id"));
		           b.setName(rst.getString("name"));
		           b.setAddress(rst.getString("address"));
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
	public business findByName(String name)
	{   
		 Connection conn = getConn();
		String sql="SELECT * FROM business where name="+name;
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        ResultSet rst=pstmt.executeQuery();
	            business b=new business();
		        while (rst.next()) {
		           b.setId(rst.getString("id"));
		           b.setName(rst.getString("name"));
		           b.setAddress(rst.getString("address"));
		           b.setPhone(rst.getString("phone"));
		           b.setState(rst.getInt("state"));
		           return b;
		             
		        }
		            System.out.println("============================");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return null;
	}
	public business findByPhone(String phone)
	{   
		 Connection conn = getConn();
		String sql="SELECT * FROM business where phone= "+phone+' ';
		 PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement)conn.prepareStatement(sql);
		        ResultSet rst=pstmt.executeQuery();
	            business b=new business();
		        while (rst.next()) {
		           b.setId(rst.getString("id"));
		           b.setName(rst.getString("name"));
		           b.setAddress(rst.getString("address"));
		           b.setPhone(rst.getString("phone"));
		           b.setState(rst.getInt("state"));
		           return b;
		             
		        }
		            System.out.println("============================");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return null;
	}
}
