package com.learning.design.pattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Logic For Cloning
		NetworkConnection conn=new NetworkConnection();
		conn.setIp(this.getIp());
		conn.setImportantData(this.importantData);
		for(String s: this.getDomains()) {
			conn.getDomains().add(s);
		}
		
		return conn;
	}
	private String ip;
	private String importantData;
	private List<String> domains=new ArrayList<>();
	
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}
	public void loadVeryImportantData() throws InterruptedException {
		this.importantData="Very Very Important Data";//Suppose it takes lots of time to load around 5 min
		domains.add("google.com");
		domains.add("yahoo.com");
		domains.add("youtube.com");
		domains.add("meta.com");
		domains.add("facebook.com");
		domains.add("instagram.com");
		domains.add("whatsapp.com");
		domains.add("gmail.com");

		Thread.sleep(5000);
	}
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
