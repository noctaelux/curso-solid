package com.coffeepoweredcrew.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

    private final static EagerRegistry INSTANCE = new EagerRegistry();
    private int contador = 0;

    private EagerRegistry(){}

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }

    public void getContador() {
        System.out.println(contador++);
    }
}