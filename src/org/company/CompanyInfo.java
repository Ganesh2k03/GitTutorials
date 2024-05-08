package org.company;

public class CompanyInfo {
	private void companyName(String name, String city, int pincode, long phone) {
		System.out.println("Company Info :"+name+"\n"+city+"\n"+pincode+"\n"+phone);
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName("zoho", "CBE", 641001, 8667767301l);
	}
}

