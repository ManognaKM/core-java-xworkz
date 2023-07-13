class AmazonPrime{
//kannada Movies
static String kannadaMovies[]={"Kgf","DIA","Tagaru","Kanthara","Robert","GGRV","UPPi","super","A","swasthik","Mufthi","Tarak","appu","natasarvabouma","Hondisibariyiri","om","power","Yuvarathna","Odeya","yejamana","kabza","Uppi2","gajakesari","bajarangi","vajrakaya"};
//telugu movies
static String teluguMovies[]={"arya","bahubali","Adhipurush","Radheshyam","bahubali2","rrr","devara","kushi","mallirava","hit1","happydays","godavari","mirchi","salara","pushpa","pushpa2","power","pooja","liger","killer","arya2","Uppena","rangastalam","raccha","D"};
//hindi movies
static String hindiMovies[]={"patan","chichore","bajarangibahijan","Kanthara","Robert","GGRV","UPPi","super","A","swasthik","Mufthi","Tarak","appu","natasarvabouma","dabang","war","tiger","antim","bholaa","shezada","","raddhe","kutty","anek","tanji"};
//english movies
static String englishMovies [] = {"Avengers: Endgame", "The Dark Knight", "Inception", "Pulp Fiction", "The Shawshank Redemption","Fight Club", "The Matrix", "Interstellar", "The Godfather", "Goodfellas", "The Social Network", "Forrest Gump", "The Lord of the Rings: The Fellowship of the Ring","The Wolf of Wall Street", "Gladiator", "The Departed", "The Avengers", "The Lion King","Jurassic Park", "Titanic", "Harry Potter and the Philosopher's Stone", "The Great Gatsby",
        "Back to the Future", "The Prestige", "The Revenant"};
//Malyalam movies
static String malyalamMovies[]={"pada","salute","2018","kala","pemam","jallikattu","one","karup","nayattu","hridayam","iratta","Tarak","drishyam","love","dada","papa","naradan","banglore days","oh my darling","puzhu","kaapa","JGM","joshep","traffic","romancham"};

public static void main(String args[]){
	System.out.println("Kannada Movies");
	
	for(String kan:kannadaMovies){
		System.out.println(kan);
	}	
	
	System.out.println("telugu Movies");
	
	for(String tel:teluguMovies){
		System.out.println(tel);
	}
	System.out.println("hindi Movies");
	for(String hin:hindiMovies){
		System.out.println(hin);
	}
	
	
	
	
	System.out.println("English Movies");
	
	for(String eng:englishMovies){
		System.out.println(eng);
	}
	
	System.out.println("Malyalam Movies");
	for(String mal:malyalamMovies){
		System.out.println(mal);
	}
	
}
}
	
		