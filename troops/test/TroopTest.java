package troops.test;

import java.util.Scanner;
import troops.Troop;
import troops.TroopBSO;

public class TroopTest {

	private static Troop troop;
	private static Scanner sc;

	public static void main(String[] args) {
		troop = new Troop();
		sc = new Scanner(System.in);
		int todo;
		while(true){
			System.out.println("\nTroop-traning-> start-training");
			System.out.println("1. Train troops");
			System.out.println("2. View Troop Camp");
			System.out.println("What do you want to do?");
			todo = sc.nextInt();
			if(todo == 1){
				System.out.println("1. Archer");
				System.out.println("2. Barbarian");
				System.out.println("Which troop you want to train ? ");
				int troopType = sc.nextInt();
				int numOftroop;
				if(troopType == 1){
					System.out.println("How many Archer you want to train ? ");
					numOftroop = sc.nextInt();
					TroopBSO.barracks(troopType, numOftroop);
					troop.setNoOfArcher(troop.getNoOfArcher()+numOftroop);
				}else if(troopType == 2){
					System.out.println("How many Barbarian you want to train ? ");
					numOftroop = sc.nextInt();
					TroopBSO.barracks(troopType, numOftroop);
					troop.setNoOfBarbarian(troop.getNoOfBarbarian()+numOftroop);
				}else {
					System.out.println("Please select proper trooper");
				}
			}else if(todo == 2){
				TroopBSO.showArmyCamp(troop);
			}else{
				System.out.println("Please select proper troop");
			}
		} 
	}
}
