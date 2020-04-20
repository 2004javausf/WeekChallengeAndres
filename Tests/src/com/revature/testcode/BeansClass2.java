package com.revature.testcode;

public class BeansClass2 {
	
	public String name;
	public int age;
	public int weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
