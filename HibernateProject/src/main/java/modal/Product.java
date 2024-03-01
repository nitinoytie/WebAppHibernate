package modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private String pname,pdec,imgurls;
	private int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdec() {
		return pdec;
	}
	public void setPdec(String pdec) {
		this.pdec = pdec;
	}
	public String getImgurls() {
		return imgurls;
	}
	public void setImgurls(String imgurls) {
		this.imgurls = imgurls;
	}
	
	
}
