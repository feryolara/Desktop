package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Examen Uch Lara");
        GridPane grid = new GridPane();
        grid.setAlignment (Pos.CENTER);

        Label lbl1 = new Label();
        lbl1.setText("Ingresa el valor del tiempo: ");
        lbl1 .setFont(Font.font("Arial", FontWeight.BOLD , 18) ) ;
        grid.add(lbl1,0,1);

        TextField tiempo = new TextField();
        grid.add(tiempo,1,1);


        Label label2 = new Label();
        label2.setText("Ingresa el valor de la distancia: ");
        grid.add(label2,0,3);
        label2 .setFont(Font.font("Arial", FontWeight.BOLD , 18) ) ;

        TextField distancia = new TextField();
        grid.add(distancia,1,3);


        Label label3 = new Label();
        label3.setText("Calculo de la velocidad: ");
        grid.add(label3,0,4);
        label3 .setFont(Font.font("Arial", FontWeight.BOLD , 18) ) ;


        TextField velocidad = new TextField();
        grid.add(velocidad,1,4);


        Button boton = new Button("Calcular");
        boton.addEventFilter(MouseEvent.MOUSE_CLICKED,
                new EventHandler<MouseEvent>  () {
                    @Override
                    public void handle(MouseEvent event) {
                        if(tiempo.getText().length() == 0){
                            float distancia1 = Float.parseFloat(distancia.getText());
                            float velo = Float.parseFloat(velocidad.getText());

                            float result = distancia1/velo;

                            tiempo.setText(String.valueOf(result));
                        }
                        if(velocidad.getText().length() == 0){
                            float dist = Float.parseFloat(distancia.getText());
                            float time = Float.parseFloat(tiempo.getText());

                            float result = dist/time;

                            velocidad.setText(String.valueOf(result));
                        }
                        if(distancia.getText().length() == 0){
                            float dist = Float.parseFloat(velocidad.getText());
                            float tiempo1 = Float.parseFloat(tiempo.getText());

                            float result = dist*tiempo1;

                            distancia.setText(String.valueOf(result));
                        }


                    }
                });



        grid.add(boton,12,11);
        grid.setStyle("-fx-background-color: #C86A56;");
        Scene scene = new Scene(grid,600,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}