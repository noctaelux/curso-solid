package com.coffeepoweredcrew.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH(){}

    private int contador = 0;

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }

    public void getContador(){
        System.out.println(contador++);
    }

    private static class RegistryHolder{
        static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

}
