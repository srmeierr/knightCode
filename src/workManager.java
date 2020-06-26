import java.util.Scanner;


public class workManager {
	public boolean checkManager;
	public String checkManagerName;
	public int checkManagerID;
	
	int[] workerSID = {1,2,3,4,5,6,7,8,9} ; 
	int[] ManagerSID = {10,11,12,13,14,15};

	public void ManagerController(boolean checkManager , String checkManagerName , int checkManagerID) {
		if(checkManager == true)
		{
	 		this.checkManager = checkManager;
			this.checkManagerName = checkManagerName;
			this.checkManagerID = checkManagerID;
		}
		else {
			Scanner sc = new Scanner(System.in);
			for(int i = 0;i < ManagerSID.length ; i++)
			{
				System.out.println("//         Please enter your ID         // ");
				int idCollector = sc.nextInt();
				if(idCollector == workerSID[i])
				{
					System.out.println("ID has been successfully, you are a Worker.");
				}
				else if(idCollector == ManagerSID[i]) {
					System.out.println("ID has been succesfully, you are a Manager");
				}
				else {
					System.out.println("Wrong ID");
				}
				
			}
			sc.close();

		}
	}
	
	
	
	
	
	
	
	
	
	
}