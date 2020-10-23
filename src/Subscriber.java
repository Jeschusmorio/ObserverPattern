
public class Subscriber {
	public String name;
	
	public Subscriber(String userName) {
		this.name = userName;
	}
	public void uploadNotify(String videoTitle, String channelName) {
		System.out.println("Hey, " + this.name + ", " + channelName + " just uploaded a new video " + 
				"titled: " + videoTitle);
	}
	private boolean isSubscribedToChannel(Channel c) {
		return c.isSubscribed(this);
	}
	public void subscribe(Channel c) {
		if (this.isSubscribedToChannel(c)) {
			System.out.println("Already subscribed to " + c.name);
		}
		else {
			c.addSubscriber(this);
		}
	}
	public void unsubscribe(Channel c) {
		if (this.isSubscribedToChannel(c)) {
			c.removeSubscriber(this);
		}
		else {
			System.out.println("Already not subscribed to " + c.name);
		}
	}
}
