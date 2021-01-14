package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Controller {
    @FXML
    private Label nombre1;
    @FXML
    private Label vida1;
    @FXML
    private Label nivel1;
    @FXML
    private Label nombre2;
    @FXML
    private Label vida2;
    @FXML
    private Label nivel2;
    @FXML
    private Label nombre3;
    @FXML
    private Label vida3;
    @FXML
    private Label nivel3;
    @FXML
    private Label nombre4;
    @FXML
    private Label vida4;
    @FXML
    private Label nivel4;
    @FXML
    private Label nombre5;
    @FXML
    private Label vida5;
    @FXML
    private Label nivel5;
    @FXML
    private Label nombre6;
    @FXML
    private Label vida6;
    @FXML
    private Label nivel6;
    @FXML
    private AnchorPane ap1;
    @FXML
    private AnchorPane ap2;
    @FXML
    private AnchorPane ap3;
    @FXML
    private AnchorPane ap4;
    @FXML
    private AnchorPane ap5;
    @FXML
    private AnchorPane ap6;

    Pokemon pokemon1=new Pokemon("Umbreon",100,394);
    Pokemon pokemon2=new Pokemon("Gengar",100,394);
    Pokemon pokemon3=new Pokemon("Flygon",100,364);
    Pokemon pokemon4=new Pokemon("Infernape",100,356);
    Pokemon pokemon5=new Pokemon("Gyarados",100,394);
    Pokemon pokemon6=new Pokemon("Lucario",100,344);
    public void initialize(){
        rellenar(nombre1,nivel1,vida1,pokemon1);
        rellenar(nombre2,nivel2,vida2,pokemon2);
        rellenar(nombre3,nivel3,vida3,pokemon3);
        rellenar(nombre4,nivel4,vida4,pokemon4);
        rellenar(nombre5,nivel5,vida5,pokemon5);
        rellenar(nombre6,nivel6,vida6,pokemon6);
    }

    public void onImagen1clicked(){
        seleccionado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen2clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        seleccionado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen3clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        seleccionado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen4clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        seleccionado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen5clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        seleccionado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen6clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        seleccionado(nombre6,nivel6,vida6,ap6);
    }

    public static void rellenar(Label nombre,Label nivel,Label vida,Pokemon poke){
        nombre.setText(poke.nombre);
        nivel.setText("Nv."+poke.nivel);
        vida.setText(poke.vida+"/"+ poke.vida);
    }

    public static void predeterminado(Label nombre,Label nivel,Label vida,AnchorPane ap){
        nombre.setStyle("-fx-text-fill:#fff;");
        vida.setStyle("-fx-text-fill:#fff;");
        nivel.setStyle("-fx-text-fill:#fff;");
        ap.setStyle("-fx-background-color: #5F5F5F; -fx-border-color: black;");

    }

    public static void seleccionado(Label nombre,Label nivel,Label vida,AnchorPane ap){
        nombre.setStyle("-fx-text-fill:#00C1FF;");
        vida.setStyle("-fx-text-fill:#00C1FF;");
        nivel.setStyle("-fx-text-fill:#00C1FF;");
        ap.setStyle("-fx-background-color: #D8D8D8; -fx-border-color: white;");

    }

}


