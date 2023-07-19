class SwitchBoardTester{
public static void main(String args[]){
	SwitchBoard sB1=new SwitchBoard("plastic","black");
	sB1.onAndOff();
	System.out.println(sB1.bType+" "+sB1.bColor);
	
	SwitchBoard sB2=new SwitchBoard("wooden","white");
	sB2.onAndOff();
	System.out.println(sB2.bType+" "+sB2.bColor);
	
	SwitchBoard sB3=new SwitchBoard("wooden","grey");
	sB3.onAndOff();
	System.out.println(sB3.bType+" "+sB3.bColor);
	
	SwitchBoard sB4=new SwitchBoard("steel","white");
	sB4.onAndOff();
	System.out.println(sB4.bType+" "+sB4.bColor);
	
	
	
	
}
}