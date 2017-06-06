package Dto;
import java.io.Serializable;

import CustomAnnotation.CustomAnnotation;
import CustomAnnotation.Order;

public class SubHoge implements Serializable {


	@Override
	public String toString() {
		return "SubHoge [subname=" + subname + ", subvalue=" + subvalue + "]";
	}

	@Order(value=2)
    @CustomAnnotation("a")
    private String subname;

	@Order(value=1)
    @CustomAnnotation("b")
    private int subvalue;

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getSubvalue() {
		return subvalue;
	}

	public void setSubvalue(int subvalue) {
		this.subvalue = subvalue;
	}




}