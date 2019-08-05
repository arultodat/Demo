package com.example.demo;

/*import javax.persistence.*;*/
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employe")

public class Employe implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7876710454190505232L;
	@Id
	
	private Integer empid;
	private String name;
	private java.util.Date doj;
	private String desgiantion;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.Date getDoj() {
		return doj;
	}
	public void setDoj(java.util.Date date) {
		this.doj = date;
	}
	public String getDesgiantion() {
		return desgiantion;
	}
	public void setDesgiantion(String desgiantion) {
		this.desgiantion = desgiantion;
	}
	@Override
	public String toString() {
		return "Employe [empid=" + empid + ", name=" + name + ", doj=" + doj + ", desgiantion=" + desgiantion + "]";
	}

	

}
