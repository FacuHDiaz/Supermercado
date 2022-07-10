package Usuarios;

import java.util.*;
import java.sql.*;

public class signIn {
	
	
	public Connection conn;
	public Statement stmt;
	
	
	static Scanner t= new Scanner(System.in);

	
		// TODO Auto-generated method stub
 public void AgregarUsuario() {
		System.out.println("---Bienvenido a Supermark---");
		System.out.println("Para registrarse llene los siguientes campos:");
		System.out.println("---Datos De Usuario---");
		System.out.print("Nombre Completo: ");
		String nombre= t.nextLine();
		System.out.print("\nApellido: ");
		String apellido = t.nextLine();
		System.out.print("\norreo electronico: ");
		String correo = t.nextLine();
		System.out.println("---Direccion---");
		System.out.print("Ciudad: ");
		String ciudad = t.nextLine();
		System.out.print("Calle: ");
		String calle = t.nextLine();
		System.out.print("\nNumero: ");
		String numCalle = t.nextLine();
		System.out.print("\nContraseña");
		String password = t.nextLine();
		System.out.print("\nConfirmar contraseña:");
		String aux = t.nextLine();
		
		
		while(password != aux) {
			
			System.out.println("---Las contraseñas no coinciden---");
			System.out.print("\nContraseña");
			password = t.nextLine();
			System.out.print("\nConfirmar contraseña:");
			aux = t.nextLine();
		}
		
		ArrayList<String> datos= new ArrayList();
		ArrayList<String> direccion = new ArrayList();
		
		datos.add(nombre);
		datos.add(apellido);
		datos.add(correo);
		datos.add();
		
		stmt= conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		String sql="insert into Usuario (Nombre,Apellido,dni,correo,pass,EsFrecuente,idRol,idDomicilio) "+
				" values (?,?,?,?,?,?,?,?)";
		
		
 }
	
		public static void main(String[] args) {
	
			
	}

	
}
