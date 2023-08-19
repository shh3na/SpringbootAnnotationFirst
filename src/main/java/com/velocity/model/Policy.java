package com.velocity.model;

public class Policy {
	private Integer id;
	private String policyname;
	private Integer policyage;
	private String policydisc;

	public Integer getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public Integer getPolicyage() {
		return policyage;
	}

	public void setPolicyage(Integer policyage) {
		this.policyage = policyage;
	}

	public String getPolicydisc() {
		return policydisc;
	}

	public void setPolicydisc(String policydisc) {
		this.policydisc = policydisc;
	}
	

	public Policy(Integer id, String policyname, Integer policyage, String policydisc) {
		super();
		this.id = id;
		this.policyname = policyname;
		this.policyage = policyage;
		this.policydisc = policydisc;
	}

	public Policy() {
		
	}

	@Override
	public String toString() {
		return "ApiService [id=" + id + ", policyname=" + policyname + ", policyage=" + policyage + ", policydisc="
				+ policydisc + "]";
	}

}
