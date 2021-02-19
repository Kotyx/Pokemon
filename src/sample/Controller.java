package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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
    @FXML
    private Button bsiguiente;
    @FXML
    private ImageView ivpokemon1;
    @FXML
    private ImageView ivpokemon2;
    @FXML
    private ImageView ivpokemon3;
    @FXML
    private ImageView ivpokemon4;
    @FXML
    private ImageView ivpokemon5;
    @FXML
    private ImageView ivpokemon6;
    @FXML
    private ProgressBar pb1;
    @FXML
    private ProgressBar pb2;
    @FXML
    private ProgressBar pb3;
    @FXML
    private ProgressBar pb4;
    @FXML
    private ProgressBar pb5;
    @FXML
    private ProgressBar pb6;


    Pokemon pokemon1=new Pokemon("Umbreon",100,394,"\\pokemon\\umbreon.png");
    Pokemon pokemon2=new Pokemon("Gengar",100,394,"\\pokemon\\gengar.png");
    Pokemon pokemon3=new Pokemon("Flygon",100,364,"\\pokemon\\flygon.png");
    Pokemon pokemon4=new Pokemon("Infernape",100,356,"\\pokemon\\infernape.png");
    Pokemon pokemon5=new Pokemon("Gyarados",100,394,"\\pokemon\\gyarados.png");
    Pokemon pokemon6=new Pokemon("Lucario",100,344,"\\pokemon\\lucario.png");

    int dañopk1=0;
    int dañoen1=0;
    int dañopk2=0;
    int dañoen2=0;
    int dañopk3=0;
    int dañoen3=0;
    int dañopk4=0;
    int dañoen4=0;
    int dañopk5=0;
    int dañoen5=0;
    int dañopk6=0;
    int dañoen6=0;
    int dañomostrar=0;
    int dañoemostrar=0;
    int cont1=0;
    int cont2=0;
    int cont3=0;
    int cont4=0;
    int cont5=0;
    int cont6=0;


    Pokemon transpasop;


    public void initialize(){
        rellenar(nombre1,nivel1,vida1,ivpokemon1,pokemon1);
        rellenar(nombre2,nivel2,vida2,ivpokemon2,pokemon2);
        rellenar(nombre3,nivel3,vida3,ivpokemon3,pokemon3);
        rellenar(nombre4,nivel4,vida4,ivpokemon4,pokemon4);
        rellenar(nombre5,nivel5,vida5,ivpokemon5,pokemon5);
        rellenar(nombre6,nivel6,vida6,ivpokemon6,pokemon6);
    }

    public void onImagen1clicked(){
        seleccionado(nombre1,nivel1,vida1,ap1);
        pokemon1.imagen="\\pokemon\\umbreonespalda.png";
        transpasop=pokemon1;
        dañomostrar=dañopk1;
        dañoemostrar=dañoen1;
        cont1=cont1+1;
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen2clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        seleccionado(nombre2,nivel2,vida2,ap2);
        pokemon2.imagen="\\pokemon\\gengarespalda.png";
        transpasop=pokemon2;
        dañomostrar=dañopk2;
        dañoemostrar=dañoen2;
        cont2=cont2+1;
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen3clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        seleccionado(nombre3,nivel3,vida3,ap3);
        pokemon3.imagen="\\pokemon\\flygonespalda.png";
        transpasop=pokemon3;
        dañomostrar=dañopk3;
        dañoemostrar=dañoen3;
        cont3=cont3+1;
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen4clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        seleccionado(nombre4,nivel4,vida4,ap4);
        pokemon4.imagen="\\pokemon\\infernapeespalda.png";
        transpasop=pokemon4;
        dañomostrar=dañopk4;
        dañoemostrar=dañoen4;
        cont4=cont4+1;
        predeterminado(nombre5,nivel5,vida5,ap5);
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen5clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        seleccionado(nombre5,nivel5,vida5,ap5);
        pokemon5.imagen="\\pokemon\\gyaradosespalda.png";
        transpasop=pokemon5;
        dañomostrar=dañopk5;
        dañoemostrar=dañoen5;
        cont5=cont5+1;
        predeterminado(nombre6,nivel6,vida6,ap6);
    }
    public void onImagen6clicked(){
        predeterminado(nombre1,nivel1,vida1,ap1);
        predeterminado(nombre2,nivel2,vida2,ap2);
        predeterminado(nombre3,nivel3,vida3,ap3);
        predeterminado(nombre4,nivel4,vida4,ap4);
        predeterminado(nombre5,nivel5,vida5,ap5);
        seleccionado(nombre6,nivel6,vida6,ap6);
        pokemon6.imagen="\\pokemon\\lucarioespalda.png";
        transpasop=pokemon6;
        dañomostrar=dañopk6;
        dañoemostrar=dañoen6;
        cont6=cont6+1;
    }

    public static void rellenar(Label nombre,Label nivel,Label vida,ImageView imagen,Pokemon poke){
        nombre.setText(poke.nombre);
        nivel.setText("Nv."+poke.nivel);
        vida.setText(poke.vida+"/"+ poke.vida);
        Image image=new Image(poke.imagen);
        imagen.setImage(image);
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

    public void onBsiguienteClicked(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Batalla.fxml"));
            GridPane root = (GridPane) loader.load();
            Scene scene = new Scene(root, 500, 441);
            stage.setScene(scene);
            // Oculta los botones de cerrar/minimizar/maximizar
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            BatallaController controller = loader.getController();
            controller.transpaso(transpasop);
            controller.setventana1(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recibir(Pokemon poke,Double pb,int dañoaliado,int dañoenemigo){
        if(poke.nombre.equals(pokemon1.nombre)){
            vida1.setText(poke.vida+"/"+ pokemon1.vida);
            pb1.setProgress(pb);
            dañopk1=dañoaliado;
            dañoen1=dañoenemigo;
        }
        if(poke.nombre.equals(pokemon2.nombre)){
            vida2.setText(poke.vida+"/"+ pokemon2.vida);
            pb2.setProgress(pb);
            dañopk2=dañoaliado;
            dañoen2=dañoenemigo;
        }
        if(poke.nombre.equals(pokemon3.nombre)){
            vida3.setText(poke.vida+"/"+ pokemon3.vida);
            pb3.setProgress(pb);
            dañopk3=dañoaliado;
            dañoen3=dañoenemigo;
        }
        if(poke.nombre.equals(pokemon4.nombre)){
            vida4.setText(poke.vida+"/"+ pokemon4.vida);
            pb4.setProgress(pb);
            dañopk4=dañoaliado;
            dañoen4=dañoenemigo;
        }
        if(poke.nombre.equals(pokemon5.nombre)){
            vida5.setText(poke.vida+"/"+ pokemon5.vida);
            pb5.setProgress(pb);
            dañopk5=dañoaliado;
            dañoen5=dañoenemigo;
        }
        if(poke.nombre.equals(pokemon6.nombre)){
            vida6.setText(poke.vida+"/"+ pokemon6.vida);
            pb6.setProgress(pb);
            dañopk6=dañoaliado;
            dañoen6=dañoenemigo;
        }
    }
    public void onBestadisticasClicked() {
        Stage stage = new Stage();
        Stage stage2 = new Stage();
        Scene scene = new Scene(new Group());

        stage.setTitle("Imported Fruits");
        stage.setWidth(500);
        stage.setHeight(500);
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Daño aliado", dañomostrar),
                        new PieChart.Data("Daño enemigo", dañoemostrar)
                        );
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Estadisticas daño");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Veces seleccionados");
        xAxis.setLabel("Pokemon");
        yAxis.setLabel("Veces seleccionado");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2003");
        series1.getData().add(new XYChart.Data(pokemon1.nombre, cont1));
        series1.getData().add(new XYChart.Data(pokemon2.nombre, cont2));
        series1.getData().add(new XYChart.Data(pokemon3.nombre, cont3));
        series1.getData().add(new XYChart.Data(pokemon4.nombre, cont4));
        series1.getData().add(new XYChart.Data(pokemon5.nombre, cont5));
        series1.getData().add(new XYChart.Data(pokemon6.nombre, cont6));

        Scene scene2 = new Scene(bc,860,600);
        bc.getData().addAll(series1);
        stage2.setScene(scene2);

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
        stage2.show();
    }


}


