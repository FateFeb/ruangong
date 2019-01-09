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
import po.order;

import po.business;

public class orderDao {
	DataSource dataSource;
	private static final Log log = LogFactory.getLog(business.class);

	private static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ylm?useSSL=false";
		String username = "root";
		String password = "123456";
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,���ض�Ӧ����
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public List findAll() {
		log.debug("finding all Item instances");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		try {
			String queryString = "from order";
			Query queryObject = session.createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		} finally {
			session.close();
		}
	}

	public ArrayList<order> findALLOrder() {

		ArrayList<order> o = new ArrayList<order>();
		String sql = "SELECT * FROM order1 order by id desc";
		try (Connection conn = getConn();
				PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
				ResultSet rst = pstmt.executeQuery()) {

			while (rst.next()) {
				order b = new order();
				b.setId(rst.getString("id"));
				b.setRid(rst.getString("rid"));
				b.setBid(rst.getString("bid"));
				b.setGoods(rst.getString("goods"));
				b.setPrice(rst.getDouble("price"));
				b.setEnd(rst.getString("end"));
				b.setStarttime(rst.getString("starttime"));
				b.setGettime(rst.getString("gettime"));
				b.setEndtime(rst.getString("endtime"));
				b.setState(rst.getInt("state"));
				o.add(b);
			}
			return o;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public order findById(String id) {
		Connection conn = getConn();
		String sql = "SELECT * FROM order1 where id=" + id;
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rst = pstmt.executeQuery();
			order b = new order();
			while (rst.next()) {
				b.setId(rst.getString("id"));
				b.setRid(rst.getString("rid"));
				b.setBid(rst.getString("bid"));
				b.setGoods(rst.getString("goods"));
				b.setPrice(rst.getDouble("price"));
				b.setEnd(rst.getString("end"));
				b.setStarttime(rst.getString("starttime"));
				b.setGettime(rst.getString("gettime"));
				b.setEndtime(rst.getString("endtime"));
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
