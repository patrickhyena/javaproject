package tama;

class Premium extends Eat implements isEating {
	//inheriting from Eat class, using interface isEating
	public void eatingFood() {
		System.out.println("It ate high quality food");
		System.out.println("------------------------");
		//polymorphism to declare which type of food it ate
	}
}
class BestBuy extends Eat {
	//inheriting from Eat class
	public void eatingFood() {
		System.out.println("It ate subpar quality food.");
		System.out.println("------------------------");
		//polymorphism to declare which type of food it ate
	}
}



public class Eat {
	Pet p = new Pet();
	public void eatingFood() {
		double fulcheck = 0;
		
		
			if(p.getHunger() > 100){
			p.setHunger(fulcheck);
			System.out.println("------------------------");
			System.out.println("it  cant eat that much, hes too full!");
			System.out.println("Fullness = " + p.getHunger());
			//if its too full it can't eat
		}else{
			
			System.out.println("------------------------");
			System.out.println(p.getName() + " loved the food");
			System.out.println("Fullness = " + p.getHunger());
			//if not too full it can eat, will display this message
		}
	}
}

