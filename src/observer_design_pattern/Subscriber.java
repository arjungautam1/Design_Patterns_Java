/**
 * @author Arjun Gautam
 * Project :Design_Patterns_Java
 * Date : 2021-05-15
 * Time : 16:16
 */
package observer_design_pattern;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hey "+name+" Video Uploaded");
    }

    public void subscribeChannel(Channel ch) {
        channel = ch;
    }

}
