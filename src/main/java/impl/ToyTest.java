package impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ToyTest {


    static void printinfo(Class cc) {
        System.out.println("Class name : " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;

        try {
            c = Class.forName("impl.FancyToy");
        } catch (ClassNotFoundException e){
            log.error("Class not found");
            System.exit(1);
        }
        printinfo(c);

        for (Class face : c.getInterfaces()){
            printinfo(face);
        }

        Class up = c.getSuperclass();

        Object o = null;

        try {
            o = up.newInstance();
        } catch (InstantiationException f){
            log.error("Can't instantiate");
            System.exit(1);
        } catch (IllegalAccessException i) {
            log.error("Can't access");
            System.exit(1);
        }

        printinfo(o.getClass());

    }
}
