package tama;

import java.util.Scanner;
public class Tamagochi{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Pet p = new Pet();
		Eat e = new Eat();
		Eat pr = new Premium();
		Eat bb = new BestBuy();
		
		
		
		
		System.out.println("Hi! Welcome to Tamagochi");
		System.out.println("What would you like to name it?");
		//intro
		p.username();

		
		

		
		System.out.println("------------------------");
		for(int i = 0; i < 100; i++){
			
		p.condition();
		if(p.getGameover()){
		System.out.println("Game Over thanks for playing");
		//if gameover, it will break
		break;

		}

		
		p.menu();
		
		double check = p.getHunger();
		//to get the hunger value
		
		int choice = input.nextInt();
		// what player choices there are
		if (choice == 1){
			//eat choice
			System.out.println("How many treats do you want to give it?");
			System.out.println("1. Premium");
			System.out.println("2. Bestbuy");
			double food = input.nextDouble();
			if (choice == 1) {
				e.eatingFood();
				pr.eatingFood();
			}
			else{
				e.eatingFood();
				bb.eatingFood();
			}
			

		}
		else if (choice == 3){
			//sleep choice
				if(p.getHunger() > 0){
					System.out.println("How many minutes do you want " + p.getName() + " to sleep");
					double gotosleep = input.nextDouble();
					gotosleep = gotosleep*60/100;
					
					p.sleep(gotosleep);
			}
			else{
				System.out.println("You are too hungry to go to sleep go eat something!");
			}
		}
		else if (choice == 4){
			//give medicine choice
			System.out.println("Enter doses in multiplex of 5 to a max of 20");
			double drug = input.nextDouble();
			p.medicine(drug);
		}
		else if (choice == 5){
			//playing choice
				if(p.getEnergy() > 0){
					System.out.println("How many minutes do you want " + p.getName() + " to play");
					double minplay = input.nextDouble();
					minplay = minplay*60/100;
					p.play(minplay);
			}
			else{
				System.out.println("You are too hungry to go to sleep go eat something!");
			}
			

		}
		else if (choice == 2){
			//bathing choice
			System.out.println("How many minutes do you want to bath for?");
			double water = input.nextDouble();
			p.bath(water);
		}

		else if (choice == 6){
			System.out.println("------------------------");
			p.status();
			System.out.println("------------------------");
			
		}
		
		else if (choice == 0){
			//exit choice
			System.out.println("------------------------");
			System.out.println("Thanks for playing!");
			System.out.println("------------------------");
			break;
		}
	}
		
		
		
		
	}
}