package impl;

import interfaces.HelloSpring;

public class HelloSpringImpl implements HelloSpring {
    @Override
    public void sayHello() {
        System.out.println("Hello Spring");
    }
}
