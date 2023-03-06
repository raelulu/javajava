package first_project;

public class Cat extends Animal  {
	
	public Cat( String name, int age) {
		super("고양이", name, age);
	}
	public void makeSound() {
		System.out.println(this.getSpecies()+"야오옹"+this.getName());
	}

}
