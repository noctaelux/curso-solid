package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {

		EagerRegistry instance1 = EagerRegistry.getInstance();
		EagerRegistry instance2 = EagerRegistry.getInstance();
		System.out.println(instance1 == instance2);

		instance1.getContador();
		instance2.getContador();
		instance2.getContador();
		instance1.getContador();

		System.out.println("--------------------------------");

		LazyRegistryWithDCL instancel1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL instancel2 = LazyRegistryWithDCL.getInstance();
		System.out.println(instancel1 == instancel2);

		instancel1.getContador();
		instancel2.getContador();
		instancel2.getContador();
		instancel1.getContador();

		System.out.println("--------------------------------");

		LazyRegistryIODH instance1io = LazyRegistryIODH.getInstance();
		LazyRegistryIODH instance2io = LazyRegistryIODH.getInstance();
		System.out.println(instance1io == instance2io);

		instance1io.getContador();
		instance2io.getContador();
		instance2io.getContador();
		instance1io.getContador();

		System.out.println("--------------------------------");

		RegistryEnum enumInstance1 = RegistryEnum.INSTANCE;
		RegistryEnum enumInstance2 = RegistryEnum.INSTANCE;

		enumInstance1.someMethod();
		enumInstance2.someMethod();

	}

}
