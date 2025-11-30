package AmazonJavaDeveloperCourse;

public class Hero {
	
	String name = "Hero";
	int strength = 20;
	int health = 100;
	String specialPower = "Fire Blast";
	
	
	public int calculatePunchDamage() {
		return strength * 2;
	}
	
	public void heroDetails() {
		System.out.println("Name : "+name);
		System.out.println("Strength : "+strength);
		System.out.println("Health : "+health);
		System.out.println("Special Power : "+specialPower);
	}

}
