/**
 * @author Arjun Gautam
 * Project :Design_Patterns_Java
 * Date : 2021-05-15
 * Time : 16:20
 */
package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unSubscibe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubsribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void upload(String title) {
        this.title = title;
        notifySubsribers();
    }

}
