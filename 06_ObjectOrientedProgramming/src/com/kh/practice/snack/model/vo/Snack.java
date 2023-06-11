package com.kh.practice.snack.model.vo;
// vo. value object 값을 저장하고 관리하는 객체

// dto. data tranfer object 데이터 처리 객체

import java.io.Serializable;

public class Snack implements Serializable {

	private static final long serialVersionUID = 1L;

	private String kind; // 종류
	private String name; // 이름
	private String flavor; // 맛
	private int numOf; // 개수
	private int price; // 가격

	public Snack() {

	}

	// 값 생성자 대입, getter/setter 필드 대입

	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}

	@Override
	public String toString() {
		return kind + "(" + name + " - " + flavor + ") " + numOf + "개 " + price + "원";
	}

	public String information() {
		return kind + "(" + name + " - " + flavor + ") " + numOf + "개 " + price + "원";
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
