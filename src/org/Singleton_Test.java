package org;

import javax.swing.plaf.TableHeaderUI;

public class Singleton_Test {

    public static void main(String[] args) {
        //test case 1
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);

        //test case 2
        for (int i = 0; i < 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getInstance());
                }
            }).start();
        }

    }
}
