class  Supermarket2{
//vegatables

static String vegatables[]={"potato","onion","brinjal","Carrot","ladisfinger","sweetPotato","Pumpkin","lemon"};
//biscuits

static String biscuits[]={"ParleG","Tiger","Can","Ton","Pin","Sinki","TaTu","sunfeast"};

//perfumes
static String perfumes[]={"Fog","Boy","Fuuut","Rppy","Denver","oooo","sky","BodySpray"};



//groceries
static String groceries[]={"grains","pepper","suger","salt","atta","maidha","colors","ghee"};
//alcogol

static String alcohol[]={"Mansionhouse","kingfisher","Royalchallengers","Redbull","localbrand","foreignBrand","MRRR","","kingfisher","Royalchallengers","Redbull","tuberg","signature","ub","hlibny","magic","super","hlibny","8pm","zubrk","crown","wisky","brandi","ballantine","mc ram","bag piper","ninly","old monk","berly","haywards","captain","cm ram"};

public static void main(String args[]){
	getperfumes();
	getvegatables();
}
	
public static void getperfumes(){
	System.out.println("Inside Get perfume");
	for(String per:perfumes){
		System.out.println(per);
	}
}
public static void getvegatables(){
	System.out.println("Inside Get vegatables");
	for(String veg:vegatables){
		System.out.println(veg);
	}
}
}

		
