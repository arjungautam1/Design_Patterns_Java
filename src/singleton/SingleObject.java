/**
 * @author Arjun Gautam
 * Project :Design Pattern
 * Date : 2021-01-21
 * Time : 12:46
 */
package singleton;

public class SingleObject {
    //Create an object of single object
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class can't be instantiated
    private SingleObject() {
    }

    //Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Design Pattern");
    }

}
