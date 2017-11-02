package troops;

public class TroopBSO extends Troop  {
	
	
	public static int barracks(int troopType, int sizeOfTroop){
		System.out.println("Training...");
		for(int i=1 ;i<=sizeOfTroop;i++){
			try {
				if(troopType==1){
					Thread.sleep(6000);
					System.out.println();
				}else if(troopType==2){
					Thread.sleep(3000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Training complete. Troops are available in the troop camp.");
		return sizeOfTroop;
	}
	
	public static void showArmyCamp(Troop troop){
		System.out.println("Archers: "+troop.getNoOfArcher());
		System.out.println("Barbarian: "+troop.getNoOfBarbarian());
		
	} 
}
