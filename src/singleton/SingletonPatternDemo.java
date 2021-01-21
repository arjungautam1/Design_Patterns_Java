/**
 * @author Arjun Gautam
 * Project :Design Pattern
 * Date : 2021-01-21
 * Time : 12:54
 */
package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal constructor
//        SingleObject object=new SingleObject();

        //Get only the object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();

    }
}
