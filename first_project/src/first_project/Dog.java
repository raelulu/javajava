package first_project;

public class Dog extends Animal {
	
	public Dog( String name, int age) {
		super("강아지", name, age);
	}
	public void makeSound() {
		
		System.out.println(this.getSpecies()+"머엉머엉"+this.getName());
	}

}
