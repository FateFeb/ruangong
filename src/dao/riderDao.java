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
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class riderDao {
	private Log log = LogFactory.getLog(managerDao.class);
	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/ylm";
	    String username = "root";
	    String password = "123456";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	public static int insert(rider riderreg) {
		 
	
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "insert into rider (id,pwd,name,phone,state) values(?,?,?,?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setString(1, riderreg.getId());
	        pstmt.setString(2, riderreg.getPwd());
	        pstmt.setString(3, riderreg.getName());
	        pstmt.setString(4, riderreg.getPhone());
	        pstmt.setInt(5, 2);
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
	
}
