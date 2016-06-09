
package demoherencia2;

/**
 *
 * @author TRV01
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String acupacion;
    private String telefono;
    private String email;
    
    Cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = "00/00/00";
        this.direccion = "0";
        this.acupacion = "0";
        this.telefono = "(000)000-0000";
        this.email= "0";
    }
    
    //Getter
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getAcupacion(){
        return acupacion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    
    //Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido =  apellido;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setAcupacion(String acupacion){
        this.acupacion = acupacion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setEmail(String email){
        this.email = email;
}

    void setdireccion(String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    


