package po;

import java.sql.Date;

public class order {
	private String id;
	private String bid;
	private String rid;
	private String goods;
	private String end;
	private double price;
	private String starttime;
	private String gettime;
	private String endtime;
	private int state;

	public order() {
	}
	public order(String id,String bid,String rid,String goods,String end,double price,String starttime,String gettime,String endtime,int state) {
		this.id=id;
		this.bid=bid;
		this.rid=rid;
		this.goods=goods;
		this.end=end;
		this.price=price;
		this.starttime=starttime;
		this.gettime=gettime;
		this.endtime=endtime;
		this.state=state;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getGettime() {
		return gettime;
	}
	public void setGettime(String gettime) {
		this.gettime = gettime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
