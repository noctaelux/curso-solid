package com.cpc.dp.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {

		//Forma tradicional
		User user = createUser();
		UserDTOBuilder webDTOBuilder = new UserWebDTOBuilder();
		UserDTO userDTO = directCreate(webDTOBuilder, user);
		System.out.println(userDTO);

		//Forma más típica
		Producto producto = crearProducto();
		ProductoDTO productoDTO = null;
		productoDTO = directCreate(ProductoDTO.getBuilder(), producto);
		System.out.println(productoDTO);
	}

	public static UserDTO directCreate(UserDTOBuilder builder, User user){
		return builder
				.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withBirthday(user.getBirthday())
				.withAddress(user.getAddress())
				.build();
	}

	public static ProductoDTO directCreate(ProductoDTO.ProductoDTOBuilder productoBuilder, Producto producto){
		return productoBuilder
				.withNombre(producto.getNombre())
				.withDepartamento(producto.getDepartamento())
				.withProveedor(producto.getProveedor())
				.withPasillo(producto.getPasillo())
				.withAnaquel(producto.getAnaquel())
				.build();
	}

	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}

	public static Producto crearProducto(){
		Producto producto = new Producto();
		producto.setNombre("Producto de Prueba");
		producto.setProveedor("Rubber Duck Inc.");
		producto.setDepartamento("Test Products");
		producto.setPasillo("11");
		producto.setAnaquel("D5");
		return producto;
	}
}
