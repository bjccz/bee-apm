package net.beeapm.demo.service.thread;

/**
 * @author yuan
 * @date 2020/05/29
 */
public class HelloThreadService {
    public String sayHelloThread(String str) {
        System.out.println("sayHelloThread = " + str);
        return "<good " + str + ">";
    }
}
