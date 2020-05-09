
public class Animal {
	int height;
	String animal_type;
	public Animal(int height, String animal_type) {
		super();
		this.height = height;
		this.animal_type = animal_type;
	}
	
void showinfo()
{
	System.out.println(toString());
}

@Override
public String toString() {
	return "Animal [height=" + height + ", animal_type=" + animal_type + "]";
}

}
