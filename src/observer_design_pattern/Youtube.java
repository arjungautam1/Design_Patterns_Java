/**
 * @author Arjun Gautam
 * Project :Design_Patterns_Java
 * Date : 2021-05-15
 * Time : 16:16
 */
package observer_design_pattern;

public class Youtube {
    public static void main(String[] args) {
        Channel arjuncodes = new Channel();

        Subscriber subscriber = new Subscriber("Pooja");
        Subscriber subscriber1 = new Subscriber("Hari");
        Subscriber subscriber2 = new Subscriber("Ram");
        Subscriber subscriber3 = new Subscriber("Krishna");
        Subscriber subscriber4 = new Subscriber("Prince");

        arjuncodes.subscribe(subscriber);
        arjuncodes.subscribe(subscriber1);
        arjuncodes.subscribe(subscriber2);
        arjuncodes.subscribe(subscriber3);
        arjuncodes.subscribe(subscriber4);

        subscriber.subscribeChannel(arjuncodes);

        arjuncodes.upload("How to install Java");



    }


}
