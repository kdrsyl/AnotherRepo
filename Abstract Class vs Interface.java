Abstract Class vs Interface

- Abstract classes and Interfaces are used to achieve abstraction in Java

- We can not instantiate abstract classes and Interfaces
	
	public abstract class Food{}

	public interface Cookable{}

	Food food = new Food(); //ERROR
	Cookable cook = new Cookable(); //ERROR

- We use abstract classes for setting foundation for sub classes. 

- Interfaces are used to add a feature to classes by providing abstract methods.

- Class can extends ONE abstract class 

- Class can implement MULTIPLE interfaces 

	public interface Cookable{}
	public interface Bakeable{}
	public abstract class Food{}

	public class Bread extends Food implements Bakeable{}

	public class Patotoes extends Food implements Cookable,Bakeable{}

- Methods 

	- Abstract classes can have abstract and non-abstract methods
	- Interfaces can have abstract,default,static methods 
	- Concrete class is responsible for providing implementation

	public abstract class Food{

		public abstract void eat();  //void eat(); - > it will not work

		public void serve(){}

		public static void buy(){}

	}

	public interface Cookable{

		public abstract void cook();

		void store();
	}

	public interface Bakeable{

		public default void bakeInOven(){}

		public static void bake(String str){}

	}

	public class Bread extends Food implements Bakeable{

		@Override
		public void eat(){}


	}

	public class Patotoes extends Food implements Cookable,Bakeable{

		@Override
		public void eat(){}

		@Override
		public void cook(){}

		@Override
		public void store(){}

	}


- Variables:

	- Abstract classes can have instance, static, and final variables 
	- Interfaces can only have "public static final" variables 


	public abstract class Food{

		String name;
		public static int amount;
		public final boolean EDIBLE=true;

	}

	public interface Cookable{

		public static final String ACTION = "Cook";

		boolean CAN_BE_COOKED=true; //public static final boolean CAN_BE_COOKED=true
	}


- Constructor

	- Abstract classses can have Constructors
	- Interfaces can not have Constructors

	public abstract class Food{

		String name;

		public Food(String name){
			this.name=name;
		}

		public Food(){
			this.name="Pizza";
		}
	}

	public interface Cookable{

		//we can not add constructor
	}

	public class Pizza extends Food{

		public Pizza(){
			super("Pasta");
		}
	}


- Access modifiers

	- Abstract classes can use all access modifiers with variables and methods
	- Interfaces can only use public access modifier 

	(Java-11 private final available too - do not worry)

	public abstract class Food{
		public String name;
		protected int quantity;
		boolean isSpicy;
		private boolean isTasty;
	}

	public interface Cookable{
		public static final String ACTION = "Cookable";
	}


- Inheritance

	- Abstract classes can extend a single abstract or non-abstract class and implement interfaces 
	- Interfaces can extend multiple interfaces 
	- Interfaces support multiple inheritance 
	- Interfaces can not extend classes 


	public abstract class Food{}
	public interface Fryable{}
	public interface Grillable{}

	public interface Cookable extends Fryable,Grillable;

	public abstract class Soup extends Food{} 



	THE END...











