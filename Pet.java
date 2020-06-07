package tama;

import java.util.Scanner;
public class Pet{
	private String name;
	private double energy;
	private boolean cleanliness;
	private double health;
	private double happiness;
	private double hunger;
	public boolean gameover;
	//all the data types
	
	Scanner input = new Scanner(System.in);
	public Pet(){
		name = "";
		energy = 5;
		cleanliness = false;
		health = 50;
		happiness = 50;
		hunger = 50;
		gameover = false;
		//scanner to find the values
	}
	public void setName(String n){
		this.name = "";
		//input name method
	}

	public void setHunger(double h){
		this.hunger = h;
		//set hunger method
	}
	
	public void setEnergy(double e){
		this.energy = e;
		//set energy method
	}

	public void setCleanliness(boolean c){
		this.cleanliness = c;
		//set cleanliness method
	}
	
	public void setGameover(boolean go){
		this.gameover = false;
		//to see if the game is over or not method
	}

	public void setHappiness(double hap){
		this.happiness = hap;
		//set happiness method
	}	

	public void setHealth(double hea){
		this.health = hea;
		//set health method
	}	
	
	public double getHunger(){
		return hunger;
		//returning hunger value
	}
	public boolean getCleanliness(){
		return cleanliness;
		//returning cleanliness value (yes/no)
	}
	public boolean getGameover(){
		return gameover;
		//returning if the game is over or not
	}
	public double getHappiness(){
		return happiness;
		//returning happiness value
	}
	public double getHealth(){
		return health;
		//returning health value
	}
	public double getEnergy(){
		return energy;
		//returning energy value
	}	
	public String getName(){
		return name;
		//returning the name of pet
	}

	
	
// EAT METHOD
	public double eat(double food){
		double fulcheck = hunger;
		hunger = hunger + food; 

		double fed = food/10;
		energy = energy + fed;

		return hunger;
	}
	
//	BATH METHOD
	public boolean bath(double water){
		cleanliness = true;
		if(water > 10){
			health =- 1;
		}
		
		System.out.println("------------------------");
		System.out.println("You Bath " + getName() + " Its clean now!");
		System.out.println("------------------------");
		return cleanliness;
	}
	
	
//	SLEEP METHOD	
	public double sleep(double tidur){

		energy = energy + tidur; 
		hunger = hunger - tidur;
		cleanliness = false;
			System.out.println("------------------------");
			System.out.println(getName() + " had a good nap");
			System.out.println("------------------------");
		
		return energy;
	}

//	MEDICINE METHOD
	public double medicine(double obat){ 
		happiness = happiness/2;
		int counters = 0;
		int counter = 0;
			if(obat == 5 || obat ==10 || obat ==15){
				health =+ obat;
				System.out.println("------------------------");
				System.out.println("You gave " + getName() + " his medicine");
				System.out.println("------------------------");
			}
			else if(obat == 20 && counters < 3){
				health =+ obat;
				System.out.println("------------------------");
				System.out.println("You gave " + getName() + " his medicine");
				System.out.println("------------------------");
				counters++;
			}
			else{
				System.out.println("Pleas Enter doses in multiples of 5 to a max of 20 you can only do a dose of 20 3 times");
				}
				
			
		return health;
	}
	
//	PLAYING METHOD
	public double play(double minplay){
		happiness = happiness + minplay;
		energy = energy - minplay;
		System.out.println("------------------------");
		System.out.println("You play with " + getName() + " for a bit");
		System.out.println("------------------------");
		return happiness;
	}
	
// ENTER USERNAME METHOD
	public void username(){
		name = input.next();
	}
	
	public void menu(){
		System.out.println("");
		System.out.println("What would you like to do with " + getName());
		System.out.println("");
		System.out.println("1: Eat");
		System.out.println("2: Bath");
		System.out.println("3: Sleep");
		System.out.println("4: Give Medicine");
		System.out.println("5: Play");
		System.out.println("6: Check Status");
		System.out.println("0: Exit");
	}

	public void status(){
		System.out.println("Fullness = " + getHunger());
		System.out.println("Happiness = " + getHappiness());
		System.out.println("Energy = " + getEnergy());
		System.out.println("Health = " + getHealth());
		System.out.println("Clean/Dirty = " + (getCleanliness()?"Clean":"Dirty"));

	}
	
	public void condition(){
		if(getHealth() <= 0){
				System.out.println("You are Sick, drink some medicine!");
		}if(getHealth() <= -5){
				System.out.println("You got sick and died");
				gameover = true;
		}if(getHunger() <= 0){
			System.out.println("You are Hungry, Eat Some food!!!!");
		}if(getHunger() <= -20){
				System.out.println("You died of starvation");
			gameover = true;
		}
		if(getEnergy() <= -20){
				System.out.println("You died of starvation");
			gameover = true;
		}
	}
}