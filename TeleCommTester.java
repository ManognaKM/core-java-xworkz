class TeleCommTester{
	public static void main(String args[]){
		TeleComm.addSim("jio");
		TeleComm.addSim("airtel");
		TeleComm.addSim("bsnl");
		TeleComm.addSim("idea");
		TeleComm.addSim("vodafone");
		TeleComm.getAllSimsavilable();
		System.out.println("-----------After Update------------");
		TeleComm.updateSim("idea","idea 2.0");
		
		TeleComm.getAllSimsavilable();
	}
}