package game.entities;

import game.abstracts.Entity;

public class Campaing implements Entity{
	
	private int id;
	private String campaingName;
	private double discountRate;
	private String info;
	
	public Campaing() {
	}
	
	
	public Campaing(int id, String campaingName, double discountRate, String info) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.discountRate = discountRate;
		this.info = info;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaingName() {
		return campaingName;
	}


	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}
}