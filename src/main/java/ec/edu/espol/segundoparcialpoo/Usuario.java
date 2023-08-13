/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.segundoparcialpoo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author JOSUE
 */
public class Usuario {
   String nombreUsuario;
   String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
   
    public static void saveListToFileSer(String nombreArchivo, ArrayList<Usuario> usuarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
    }
}
   
     public static ArrayList<Usuario> readListFromFileSer(String nombreArchivo) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            usuarios = (ArrayList<Usuario>) ois.readObject();
        } catch (IOException e){} 
        catch (ClassNotFoundException h){}
        return usuarios;
    }
    
}
