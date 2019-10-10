package cn.com.mybatis.po;

import java.util.HashMap;

public class GamePlayer {
	private int id;
	private String name;
	private String gender;
	private String level;
	private String ptype;
	private String svalue ;//
	private String power;//
	private String ranges;
	private HashMap<String, String> p_type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getSvalue() {
		return svalue;
	}
	public void setSvalue(String svalue) {
		this.svalue = svalue;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getRanges() {
		return ranges;
	}
	public void setRanges(String ranges) {
		this.ranges = ranges;
	}
	public HashMap<String, String> getP_type() {
		return p_type;
	}
	public void setP_type(HashMap<String, String> p_type) {
		this.p_type = p_type;
	}
	
}
