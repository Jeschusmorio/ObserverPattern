import java.util.ArrayList;
import java.util.List;

public class Channel {
	public String name;
	private String newVideoTitle;
	private List<Subscriber> subscribers = new ArrayList<>();
	
	public Channel(String channelName) {
		this.name = channelName;
	}
	public boolean isSubscribed(Subscriber sub) {
		return this.subscribers.contains(sub);
	}
	public void addSubscriber(Subscriber sub) {
		this.subscribers.add(sub);
	}
	public void removeSubscriber(Subscriber sub) {
		this.subscribers.remove(sub);
	}
	public void uploadVideo(String videoTitle) {
		this.newVideoTitle = videoTitle;
		for (int i = 0; i < subscribers.size(); i++) {
			subscribers.get(i).uploadNotify(this.newVideoTitle, this.name);
		}
	}
}
