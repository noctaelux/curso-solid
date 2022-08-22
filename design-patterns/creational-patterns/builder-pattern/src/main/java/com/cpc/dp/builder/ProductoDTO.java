package com.cpc.dp.builder;

public class ProductoDTO {

    private String id;
    private String nombre;
    private String proveedor;
    private String departamento;
    private String pasillo;
    private String anaquel;

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    private void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDepartamento() {
        return departamento;
    }

    private void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPasillo() {
        return pasillo;
    }

    private void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    public String getAnaquel() {
        return anaquel;
    }

    private void setAnaquel(String anaquel) {
        this.anaquel = anaquel;
    }

    public static ProductoDTOBuilder getBuilder(){
        return new ProductoDTOBuilder();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductoDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", proveedor='").append(proveedor).append('\'');
        sb.append(", departamento='").append(departamento).append('\'');
        sb.append(", pasillo='").append(pasillo).append('\'');
        sb.append(", anaquel='").append(anaquel).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class ProductoDTOBuilder {
        private String nombre;
        private String proveedor;
        private String departamento;
        private String pasillo;
        private String anaquel;
        private ProductoDTO productoDTO;

        public ProductoDTOBuilder withNombre(String nombre){
            this.nombre = nombre;
            return this;
        }

        public ProductoDTOBuilder withProveedor(String proveedor){
            this.proveedor = proveedor;
            return this;
        }

        public ProductoDTOBuilder withDepartamento(String departamento){
            this.departamento = departamento;
            return this;
        }

        public ProductoDTOBuilder withPasillo(String pasillo){
            this.pasillo = pasillo;
            return this;
        }

        public ProductoDTOBuilder withAnaquel(String anaquel){
            this.anaquel = anaquel;
            return this;
        }

        public ProductoDTO build(){

            //Lanza una excepción si el nombre es nulo o está en blanco.
            if(nombre == null || nombre.isEmpty()){
                throw new IllegalArgumentException("El nombre del producto es requerido.");
            }

            this.productoDTO = new ProductoDTO();
            productoDTO.setId("randomId");
            productoDTO.setNombre(nombre);
            productoDTO.setProveedor(proveedor);
            productoDTO.setDepartamento(departamento);
            productoDTO.setPasillo(pasillo);
            productoDTO.setAnaquel(anaquel);
            return productoDTO;
        }

        public ProductoDTO getProducto(){
            return productoDTO;
        }
    }
}
