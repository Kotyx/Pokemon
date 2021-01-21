package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import java.util.Optional;
import java.util.Random;

public class BatallaController {
    @FXML
    private Button batacar;
    @FXML
    private Button bcurar;
    @FXML
    private Button bseguro;
    @FXML
    private Button barriesgado;
    @FXML
    private Button bmarriesgado;
    @FXML
    private Button bcancelar;
    @FXML
    private ProgressBar pbaliado;
    @FXML
    private ProgressBar pbenemigo;
    @FXML
    private Label lnivelaliado;
    @FXML
    private Label lnivelenemigo;
    @FXML
    private Label lnombrealiado;
    @FXML
    private Label lnombreenemigo;
    @FXML
    private Label lpsaliado;
    @FXML
    private Label lpsenemigo;
    @FXML
    private ImageView ivaliado;
    @FXML
    private ImageView ivenemigo;

    Pokemon enemigo=new Pokemon("Darkrai",100,344,"\\pokemon\\darkrai.png");
    int total=0;
    Pokemon comprobacion;
    Controller controller;

    public void transpaso(Pokemon pokemon){
        comprobacion=pokemon;
        lnivelaliado.setText("Nv."+pokemon.nivel);
        lnombrealiado.setText(pokemon.nombre);
        Image imagenespalda=new Image(pokemon.imagen);
        ivaliado.setImage(imagenespalda);
        lnivelenemigo.setText("Nv."+enemigo.nivel);
        lnombreenemigo.setText(enemigo.nombre);
        Image imagenenemigo=new Image(enemigo.imagen);
        ivenemigo.setImage(imagenenemigo);
        total= pokemon.vida;
        lpsaliado.setText(pokemon.vida+"/"+total);
        lpsenemigo.setText(enemigo.vida+"/"+ enemigo.vida);
    }

    @FXML
    public void onBatacarClicked(){
        batacar.setVisible(false);
        bcurar.setVisible(false);
        bseguro.setVisible(true);
        barriesgado.setVisible(true);
        bmarriesgado.setVisible(true);
        bcancelar.setVisible(true);
    }

    @FXML
    public void onBcancelarClicked(){
        batacar.setVisible(true);
        bcurar.setVisible(true);
        bseguro.setVisible(false);
        barriesgado.setVisible(false);
        bmarriesgado.setVisible(false);
        bcancelar.setVisible(false);
    }

    @FXML
    public void onBseguroClicked(){
        pbenemigo.setProgress(pbenemigo.getProgress()-0.2);
        pbaliado.setProgress(pbaliado.getProgress()-0.2);
        restavida(0.2);
        comprobar();
    }

    @FXML
    public void onBarriesgadoClicked(){
        Random r = new Random();
        double dañoa=r.nextInt(15)+10;
        double dañoe=r.nextInt(15)+10;
        dañoa=dañoa/100;
        dañoe=dañoe/100;
        restavida(dañoa);
        pbenemigo.setProgress(pbenemigo.getProgress()-dañoe);
        pbaliado.setProgress(pbaliado.getProgress()-dañoa);
        comprobar();
    }

    @FXML
    public void onBmarriesgadoClicked(){
        Random r = new Random();
        double dañoa=r.nextInt(50);
        double dañoe=r.nextInt(50);
        dañoa=dañoa/100;
        dañoe=dañoe/100;
        restavida(dañoa);
        pbenemigo.setProgress(pbenemigo.getProgress()-dañoe);
        pbaliado.setProgress(pbaliado.getProgress()-dañoa);
        comprobar();
    }

    @FXML
    public void onBcurarClicked(){
        Random r = new Random();
        double curaa=r.nextInt(50)+25;
        double curae=r.nextInt(50)+25;
        curaa=curaa/100;
        curae=curae/100;
        curarvida(curaa);
        pbenemigo.setProgress(pbenemigo.getProgress()+curae);
        pbaliado.setProgress(pbaliado.getProgress()+curaa);
    }

    @FXML
    public void comprobar(){
        if(pbenemigo.getProgress()<=0 || pbaliado.getProgress()<=0){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Salida");
            Optional<ButtonType> resultado = alert.showAndWait();
            if(resultado.isEmpty()){
                System.out.println("El usuario ha cerrado con la x");
            }else{
                if(resultado.get()==ButtonType.OK){
                    System.exit(0);
                }else if (resultado.get() == ButtonType.CANCEL){
                    comprobacion.vida= Integer.parseInt(lpsaliado.getText());
                    Double pb=pbaliado.getProgress();
                    controller.recivir(comprobacion,pb);
                    Stage stage = (Stage) bcancelar.getScene().getWindow();
                    stage.close();
                }else{
                    System.out.println("El usuario ha dicho otra cosa");
                }
            }

        }

    }

    public void restavida(Double daño){
        Double vida=comprobacion.vida*daño;
        comprobacion.vida=(int) (comprobacion.vida-vida);
    }
    public void curarvida(Double cura) {
        int vidatotal = comprobacion.vida;
        Double vida = comprobacion.vida * cura;
        if (vida > comprobacion.vida) {
            comprobacion.vida = vidatotal;
        } else {
            comprobacion.vida = (int) (comprobacion.vida - vida);

        }
    }
}
