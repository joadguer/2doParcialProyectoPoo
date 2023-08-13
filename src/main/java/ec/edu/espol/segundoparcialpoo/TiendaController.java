/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.segundoparcialpoo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author JOSUE
 */
public class TiendaController implements Initializable {

    @FXML
    private TextField Usuario;
    @FXML
    private PasswordField clave;
    @FXML
    private ImageView imgUser;
    @FXML
    private ImageView ImgPass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void iniciosesion(MouseEvent event) {
        try {
        String username = Usuario.getText();
        String password = clave.getText();
            
        ArrayList<Usuario>  usuarios = Usuario.readListFromFileSer("usuarios.ser");
        Boolean verdadero = true;
        for(Usuario user: usuarios){
           
                if(user.getNombreUsuario().equals(username) && user.getContraseña().equals(password) ){
                            Alert a = new Alert(Alert.AlertType.INFORMATION, "Usuario correcto");
                            a.show();
                            verdadero = false;
                }
            }
        if(verdadero){
            Alert a = new Alert(Alert.AlertType.ERROR, "Usuario Incorrecto");
            a.show();
        }
        
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
                
                
    }
    
}
