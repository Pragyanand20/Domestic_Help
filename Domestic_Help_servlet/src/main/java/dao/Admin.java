package dao;

public class Admin {
	private int id;
	private String mail;
	private String name;
	private String mobile;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Admin(int id, String mail, String name, String mobile, String address) {
		this.id = id;
		this.mail = mail;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}
	public Admin() {
		
	}
	
}
