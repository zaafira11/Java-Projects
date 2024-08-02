package com.cgday3;



public class encapsule {
	private String name;
	private int id;
	private String mail;
	private long mobilenum;
	/**
	 * 
	 */
	public encapsule() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param id
	 * @param mail
	 * @param mobilenum
	 */
	public encapsule(String name, int id, String mail, long mobilenum) {
		super();
		this.name = name;
		this.id = id;
		this.mail = mail;
		this.mobilenum = mobilenum;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the mobilenum
	 */
	public long getMobilenum() {
		return mobilenum;
	}
	/**
	 * @param mobilenum the mobilenum to set
	 */
	public void setMobilenum(long mobilenum) {
		this.mobilenum = mobilenum;
	}
	@Override
	public String toString() {
		return "encapsule [name=" + name + ", id=" + id + ", mail=" + mail + ", mobilenum=" + mobilenum + "]";
	}
}
