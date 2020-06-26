import java.util.Random;
import java.util.Scanner;

public class ItemUpgrade {
 	public boolean UpgradeFailed    = false;
	public boolean UpgradeSucceeded	= false;
	public boolean UpgradeTrading	= false;
	public boolean UpgradeNeedCoins	= false;
	public boolean UpgradeNoMatch	= false;
	public boolean UpgradeRental	= false;
	public int totalGold = 15000000;
	
	Random rnd = new Random();
	int sayi = rnd.nextInt(20000);

	int UpgradeTypeNormal = 1;
	int UpgradeTypePreview = 2;
	
	public boolean trina = false ;
	public boolean Accessories = false;
	
	public int GenRate = sayi;
	String[] Weapons = {"Shard","Raptor","Hell-Breaker","Staff",};
	String[] Accessorieses = {"Mino","Lego" ,"Foverin","Lilime"} ; 
	
	
	public void GoldLose() {
		totalGold -= 200000;
	}

	public void NormalUpgradeController(String ItemName) {
		if (ItemName == Weapons[0] && ItemName == Weapons[1] && ItemName == Weapons[2] && ItemName == Weapons[3])
		{
			UpgradeNeedCoins = true;
			System.out.println("You wanna Trina ? !");
			Scanner sc = new Scanner(System.in);
			String answer = sc.next();
			if(answer == "yes") {
				trina = true;
				if (GenRate > 5000 && GenRate < 10000) {
					GoldLose();
					UpgradeSucceeded = true;
				}
				else {
					if (GenRate > 0 && GenRate < 2000) {
						trina = false;
						GoldLose();
						UpgradeSucceeded = true;
					}
					else {
						trina = false;
						GoldLose();
						UpgradeFailed = true;
					}
				}
			}
			

		}
	}
	public void UpgradeAccessories () {
		if(Accessories = true) {
			if(GenRate > 0 && GenRate < 21000) {
				UpgradeNeedCoins = true;
				UpgradeSucceeded = true;				
				GoldLose();
			}
		}
		else if (GenRate > 5000 && GenRate < 7000) {
			UpgradeNeedCoins = true;
			UpgradeSucceeded = true;				
			GoldLose();
		}
		else {
			UpgradeFailed = true;
			UpgradeSucceeded = false;
			GoldLose();
		}
	}
	public void Upgrade(String opcode) {
		switch (opcode) {
		case "ITEM_UPGRADE":
			NormalUpgradeController(opcode);
			break;
		case "ITEM_ACCESSORIES":
			UpgradeAccessories();
			break;
		default: 
			UpgradeFailed    	= true;
			UpgradeSucceeded	= false;
			UpgradeTrading		= false;
			UpgradeNeedCoins	= false;
			UpgradeNoMatch		= false;
			UpgradeRental		= false;
			break;

		}
	}
	
	
}
