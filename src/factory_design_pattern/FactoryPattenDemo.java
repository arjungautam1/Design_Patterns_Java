/**
 * @author Arjun Gautam
 * Project :Design_Patterns_Java
 * Date : 2021-05-15
 * Time : 15:51
 */
package factory_design_pattern;

interface Shape {
    void getColor();

    void getPoint();
}


class GreenBox implements Shape {
    @Override
    public void getColor() {
        System.out.println("Green Box");
    }

    @Override
    public void getPoint() {
        System.out.println("Point 1");
    }
}

class RedBox implements Shape {
    @Override
    public void getColor() {
        System.out.println("Red Box");
    }

    @Override
    public void getPoint() {
        System.out.println("Point 2");
    }
}


class DriverClass {
    public Shape createGameObject(String color) {
        switch (color) {
            case "RED":
                return new RedBox();
            case "GREEN":
                return new GreenBox();
        }
        return null;
    }
}

public class FactoryPattenDemo {

    public static void main(String[] args) {
        DriverClass driverClass = new DriverClass();

        for (int i = 0; i < 50; i++) {
            if (Math.ceil(Math.random() * 100) % 2 == 0) {
                driverClass.createGameObject("RED").getPoint();
            } else {
                driverClass.createGameObject("GREEN").getPoint();
            }
        }


    }
}
