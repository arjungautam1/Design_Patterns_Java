/**
 * @author Arjun Gautam
 * Project :Design_Patterns_Java
 * Date : 2021-05-15
 * Time : 14:49
 */
package singleton.hotstar;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();

            System.out.println("Singleton object got created");

        }
        return instance;
    }
    public void streamingAPI() {
        System.out.println("Watching a movie...");
    }
}

public class HotStar {
    public static void main(String[] args) {

        Singleton obj=Singleton.getInstance();
        obj.streamingAPI();

        Singleton obj2=Singleton.getInstance();
        obj2.streamingAPI();
    }
}
