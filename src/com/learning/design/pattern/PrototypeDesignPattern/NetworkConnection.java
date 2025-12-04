package com.learning.design.pattern.PrototypeDesignPattern;

public class NetworkConnection implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	private String ip;
	private String importantData;
	
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
	}
	public void loadVeryImportantData() throws InterruptedException {
		this.importantData="Very Very Important Data";//Suppose it takes lots of time to load around 5 min
		Thread.sleep(5000);
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
