
package domain;


public class test {


    public static void main(String[] args) {
        Empleado em1 = new Empleado("Lisa", 5000);
        //System.out.println("Empleado 1: "+em1.mostrarDetalles());
        
        Gerente gerente1 =  new Gerente("Lizeth", 8000, "Software Developer");
        //System.out.println(gerente1.mostrarDetalles());
        
        imprimir(em1);
        imprimir(gerente1);
    
    }

    private static void imprimir(Empleado empleado) {
            System.out.println("Empleado = "+empleado.mostrarDetalles());
    }
    
}
