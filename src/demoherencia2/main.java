package DemoHerencia2;
import java.util.Scanner;
public class main {

    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Que tipo de cuenta quieres abrir?");
            System.out.println("1 = Cuenta Bancaria");
            System.out.println("2 = Cuenta de Ahorros");
            System.out.println("3 = Cuenta de Cheques");
            int cuenta = entrada.nextInt();
        
        if (cuenta == 1){    
        System.out.println("Escriba el numero de la cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Escriba el nombre del cliente.");
        String nombre = entrada.next();
        System.out.println("Escriba el apellido del cliente.");
        String apellido = entrada.next();
        Cliente cliente = new Cliente(nombre, apellido);
        
        CuentaBancaria cuentaBancaria = 
                new CuentaBancaria(numeroDeCuenta, cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1 = Ingresar los datos personales");
            System.out.println("2 = Ingresar  los datos del cliente");
            System.out.println("3 = Depositar Dinero");
            System.out.println("4 = Retirar Dinero");
            System.out.println("5 = Finalizar");
            int accion = entrada.nextInt();
            
            if (accion == 1){
                System.out.println("Escriba su fecha de nacimiento.");
                String fechaDeNacimiento;
                fechaDeNacimiento = entrada.nextLine();
                
                
                System.out.println("Escriba su direccion.");
                String direccion = entrada.nextLine();
                
                
               
                System.out.println("Escriba su ocupacion.");
                String acupacion= entrada.nextLine();
                
                System.out.println("Escriba su telefono.");
                String telefono= entrada.nextLine();
                
                System.out.println("Escriba  su email.");
                String email= entrada.nextLine();
                
                
                cliente.setFechaDeNacimiento(fechaDeNacimiento);
                cliente.setDireccion(direccion);
                cliente.setAcupacion(acupacion);
                cliente.setTelefono(telefono);
                cliente.setEmail(email);
            }
            
            if (accion == 2){
                System.out.println("El numero de la cuenta del cliente es: " 
                        +cuentaBancaria.getNumeroDeCuenta());
                System.out.println("El cliente se llama: " 
                        +cliente.getNombre());
                System.out.println("El apellido es: "
                        +cliente.getApellido());
                System.out.println("El día de nacimiento del cliente es: "
                        +cliente.getFechaDeNacimiento());
                System.out.println("La dirección del cliente es :"
                        +cliente.getDireccion());
                System.out.println("El trabajo del cliente es de :"
                        +cliente.getAcupacion());
                System.out.println("El numero telefonico del cliente es: "
                        +cliente.getTelefono());
                System.out.println("El correo electronico es: "
                        +cliente.getEmail());
            }
            
            if (accion == 3){
                System.out.println("¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 4){
                System.out.println("¿Cuanto dinero deseas retirar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 5){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        else {
            System.out.println("Cuenta no disponible.");
        }
    }
    
    
    
    

          
