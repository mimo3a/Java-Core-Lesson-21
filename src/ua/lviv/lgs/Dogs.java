package ua.lviv.lgs;

import java.io.Serializable;

public class Dogs implements Serializable {
	@DogsAnnotation(id = 1, description = "only american breeds")
	private String breed;
	@DogsAnnotation(id = 2)
	private String name;
	private String color;
	@DogsAnnotation(id = 3, description = "no older 2 year")
	private int age;	
	private int weight;
	public Dogs(String breed, String name, String color, int age, int weight) {
		super();
		this.breed = breed;
		this.name = name;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}
	public String getBreed() {
		return breed;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dogs [breed=" + breed + ", name=" + name + ", color=" + color + ", age=" + age + ", weight=" + weight
				+ "]";
	}
	
	

}
