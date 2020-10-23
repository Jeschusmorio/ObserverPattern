
public class YouTubeMain {

	public static void main(String[] args) {
		Subscriber s1 = new Subscriber("StillRosi");
		Subscriber s2 = new Subscriber("Bemoty");
		Subscriber s3 = new Subscriber("NoF4ll");
		
		Channel c1 = new Channel("Jeschusmorio");
		
		s1.subscribe(c1);
		s2.subscribe(c1);
		s3.subscribe(c1);
		s3.subscribe(c1); //liefert Fehler, da schon Abonnent
		
		c1.uploadVideo("EPIC Fortnite PRANK on Roommate (GONE SEXUAL) - MUST WATCH!!!");
		
		s2.unsubscribe(c1);
		s2.unsubscribe(c1); //liefert Fehler, da schon kein Abonnent mehr
		
		c1.uploadVideo("PEWDIEPIE just KILLED me in AMONG US!?!?!?"); //keine Nachricht mehr an Bemoty
		
	}

}
