//Nombre: Juan López Estrella
//Matricula: 2023114
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

public class HR_Main {

    public static void main(String[] args) {
// CREACION DE OBJETO
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
        e1.firstName = JOptionPane.showInputDialog("Ingrese su Nombre");
        e1.lastName = JOptionPane.showInputDialog("Ingrese su Apellido");
        e1.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad"));
        e1.email =  JOptionPane.showInputDialog("Ingrese el correo");
        e1.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero Telefonico"));
        e1.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Salario"));
        e1.hiredate = JOptionPane.showInputDialog("Ingrese la fecha de contratación");
        
        
        e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
        e2.firstName = JOptionPane.showInputDialog("Ingrese su Nombre");
        e2.lastName = JOptionPane.showInputDialog("Ingrese su Apellido");
        e2.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad"));
        e2.email =  JOptionPane.showInputDialog("Ingrese el correo");
        e2.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero Telefonico"));
        e2.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Salario"));
        e2.hiredate = JOptionPane.showInputDialog("Ingrese la fecha de contratación");
        
        e1.getDetails();
        System.out.println("---------------------------");
        e2.getDetails();
    }
}
