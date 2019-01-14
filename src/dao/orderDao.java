package dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import javax.sql.DataSource;
import po.rider;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import po.order;
import java.util.Map;
import po.business;
import com.opensymphony.xwork2.ActionContext;

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
	private Map session;
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public orderDao()
	{
		session=ActionContext.getContext().getSession();
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
		String sql = "SELECT * FROM order1 order by id desc limit 5";
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
	public ArrayList<order> rfindorderlist()
	{
		ArrayList<order> o = new ArrayList<order>();
		String sql = "SELECT * FROM order1 where state=2 order by id desc";
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
	public ArrayList<order> rfindorder2list(rider r)
	{
		ArrayList<order> o = new ArrayList<order>();
		 System.out.println(r.getId());
		String sql = "SELECT * FROM order1 where state=3 and rid ="+r.getId()+" order by id desc";
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
		}}
	
		public ArrayList<order> rfindorder3list(rider r)
		{
			ArrayList<order> o = new ArrayList<order>();
			 System.out.println(r.getId());
			String sql = "SELECT * FROM order1 where state=1 and rid ="+r.getId()+" order by id desc";
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
		public boolean finishorder(rider r,order or) throws ParseException
		{
			Connection conn = getConn();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
			Date a=null;
		    a= (Date) df.parse(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
			Timestamp t = new Timestamp(a.getTime());
         	String sql = "Update order1 Set state=1,endtime='"+t+"' WHERE id="+or.getId();
			PreparedStatement pstmt;
			try {
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				pstmt.executeUpdate();
				return true;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		public boolean qiangorder(rider r,order or) throws ParseException
		{
			Connection conn = getConn();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
			Date a=null;
		    a= (Date) df.parse(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
			Timestamp t = new Timestamp(a.getTime());
			String sql = "Update order1 Set state=3 , rid="+r.getId()+", gettime='"+t+"' WHERE id="+or.getId();
			PreparedStatement pstmt;
			try {
				pstmt = (PreparedStatement) conn.prepareStatement(sql);
				pstmt.executeUpdate();
				return true;
			}
			catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
		public boolean insert(order o) throws ParseException {
		    Connection conn = getConn();
		    String s="";
		    int n=(int) session.get("n");
		    n+=1;
		    s=String.valueOf(n);
		    System.out.println(n);
		    session.put("n", n);
		    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date a=null;
		    a= (Date) df.parse(df.format(new Date()));
			Timestamp t = new Timestamp(a.getTime());
		    String sql = "insert into order1 (id,bid,goods,end,price,state,starttime) values(?,?,?,?,?,?,?)";
		    PreparedStatement pstmt;
		    try {
		        pstmt = (PreparedStatement) conn.prepareStatement(sql);
		        pstmt.setString(1, s);
		        pstmt.setString(2, o.getBid());
		        pstmt.setString(3, o.getGoods());
		        pstmt.setString(4, o.getEnd());
		        pstmt.setDouble(5, o.getPrice());
		        pstmt.setInt(6, 2);
		        pstmt.setTimestamp(7, t);
		        pstmt.executeUpdate();
		        pstmt.close();
		        conn.close();
		        return true;
		    } catch (SQLException e) {
		        e.printStackTrace();
		        return false;
		    }
		}
		public ArrayList<order> sfindorderlist(business r)
		{
			ArrayList<order> o = new ArrayList<order>();
			String sql = "SELECT * FROM order1 where state=2 and bid ="+r.getId()+" order by id desc";
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
		public ArrayList<order> sfindorder2list(business r)
		{
			ArrayList<order> o = new ArrayList<order>();
			 System.out.println(r.getId());
			String sql = "SELECT * FROM order1 where state=3 and bid ="+r.getId()+" order by id desc";
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
			}}
		
			public ArrayList<order> sfindorder3list(business r)
			{
				ArrayList<order> o = new ArrayList<order>();
				 System.out.println(r.getId());
				String sql = "SELECT * FROM order1 where state=1 and bid ="+r.getId()+" order by id desc";
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
}
