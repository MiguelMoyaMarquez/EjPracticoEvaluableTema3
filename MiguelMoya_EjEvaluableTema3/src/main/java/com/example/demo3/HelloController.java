package com.example.demo3;

import com.example.demo3.model.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import lombok.Data;

public class HelloController {
    @FXML
    private Label welcomeText;

    private TextField correoTextField;
    private ChoiceBox plataformaChoiceBox;
    private Spinner versionSpinner;
    private CheckBox administradorCheckBox;

    @javafx.fxml.FXML
    private ListView<Usuario> lista;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void onLimpiarButton(){
        System.out.println("Ha pulsado el boton el limpiar");
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Eliminar Usuarios");
        alerta.setHeaderText("Vas a eliminar todos los usuarios de la tabla");
        alerta.setContentText("¿Estas seguro que quieres eliminar todos los usuarios?");
        alerta.showAndWait();
    }

    @FXML
    private void onAñadirButton(){
        System.out.println("Ha pulsado en añadir Usuario");
        System.out.println("Añadiendo Usuario...");
        String correo= correoTextField.getText();

        Usuario usuarioProvisional=new Usuario();
        //Añadimos el usuario con los datos registrados en los campos del formulario a una variable
        //Usuario usuario=new Usuario(correoTextField.getText(),plataformaChoiceBox.getAccessibleText(),versionSpinner.getAccessibleText(),administradorCheckBox.getText(),"");
        lista.getItems().add(usuarioProvisional);
    }
}