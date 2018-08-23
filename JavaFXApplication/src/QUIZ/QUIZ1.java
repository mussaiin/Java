/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/*
 * @author Nurlybek
 */
public class QUIZ1 extends Application {
    int fnum = 0;
    int player1 = 0, player2 = 0;
    Label field = new Label("0");    
    Label winlist = new Label("Player1: "+player1+"            Player2: "+player2);
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn11 = new Button("1");
        Button btn12 = new Button("2");
        Button btn13 = new Button("3");
        btn1.setMinSize(75, 75);btn2.setMinSize(75, 75);btn3.setMinSize(75, 75);
        field.setMinSize(75, 75);
        field.setAlignment(Pos.CENTER);
        btn11.setMinSize(75, 75);btn12.setMinSize(75, 75);btn13.setMinSize(75, 75);  
        btn1.setOnAction((ActionEvent event) -> {
            fnum+=1;
            field.setText(fnum+"");  
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn11.setVisible(true);
            btn12.setVisible(true);
            btn13.setVisible(true);
            if(fnum==21){
                player1+=1;
                fnum=0;
                field.setText("Player1 won.");
                winlist.setText("Player1: "+player1+"            Player2: "+player2);
                btn1.setVisible(true);
                btn2.setVisible(true);
                btn3.setVisible(true);
                btn11.setVisible(true);
                btn12.setVisible(true);
                btn13.setVisible(true);                
            }
            if(fnum>21){
                fnum-=21;
            }
        });
        btn2.setOnAction((ActionEvent event) -> {
            fnum+=2;
            field.setText(fnum+"");
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn11.setVisible(true);
            btn12.setVisible(true);
            btn13.setVisible(true);
            if(fnum==21){
                player1+=1;
                fnum=0;
                field.setText("Player1 won.");
                winlist.setText("Player1: "+player1+"            Player2: "+player2);
                btn1.setVisible(true);
                btn2.setVisible(true);
                btn3.setVisible(true);
                btn11.setVisible(true);
                btn12.setVisible(true);
                btn13.setVisible(true);                
            }
            if(fnum>21){
                fnum-=21;
            }
        });
        btn3.setOnAction((ActionEvent event) -> {
            fnum+=3;
            field.setText(fnum+"");
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn3.setVisible(false);
            btn11.setVisible(true);
            btn12.setVisible(true);
            btn13.setVisible(true);
            if(fnum==21){
                player1+=1;
                fnum=0;
                field.setText("Player1 won.");
                winlist.setText("Player1: "+player1+"            Player2: "+player2);
                btn1.setVisible(true);
                btn2.setVisible(true);
                btn3.setVisible(true);
                btn11.setVisible(true);
                btn12.setVisible(true);
                btn13.setVisible(true);               
            }
            if(fnum>21){
                fnum-=21;
            }
        });        
        btn11.setOnAction((ActionEvent event) -> {
            fnum+=1;
            field.setText(fnum+"");
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn11.setVisible(false);
            btn12.setVisible(false);
            btn13.setVisible(false);
            if(fnum==21){
                player2+=1;
                fnum=0;
                field.setText("Player2 won.");
                winlist.setText("Player1: "+player1+"            Player2: "+player2);
                btn1.setVisible(true);
                btn2.setVisible(true);
                btn3.setVisible(true);
                btn11.setVisible(true);
                btn12.setVisible(true);
                btn13.setVisible(true);                
            }
            if(fnum>21){
                fnum-=21;
            }
        });
        btn12.setOnAction((ActionEvent event) -> {
            fnum+=2;
            field.setText(fnum+"");
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn11.setVisible(false);
            btn12.setVisible(false);
            btn13.setVisible(false);
            if(fnum==21){
                player2+=1;
                fnum=0;
                field.setText("Player2 won.");
                winlist.setText("Player1: "+player1+"            Player2: "+player2);
                btn1.setVisible(true);
                btn2.setVisible(true);
                btn3.setVisible(true);
                btn11.setVisible(true);
                btn12.setVisible(true);
                btn13.setVisible(true);                
            }
            if(fnum>21){
                fnum-=21;
            }
        });
        btn13.setOnAction((ActionEvent event) -> {
            fnum+=3;
            field.setText(fnum+"");
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn11.setVisible(false);
            btn12.setVisible(false);
            btn13.setVisible(false);
            if(fnum==21){
                player2+=1;
                fnum=0;
                field.setText("Player2 won.");
                winlist.setText("Player1: "+player1+"            Player2: "+player2);
                btn1.setVisible(true);
                btn2.setVisible(true);
                btn3.setVisible(true);
                btn11.setVisible(true);
                btn12.setVisible(true);
                btn13.setVisible(true);
            }
            if(fnum>21){
                fnum-=21;
            }
        });
        root.add(winlist, 0, 0, 3, 1); 
        root.add(btn1, 0, 1);root.add(btn2, 1, 1);root.add(btn3, 2, 1);
        root.add(field, 1, 2);
        root.add(btn11, 0, 3);root.add(btn12, 1, 3);root.add(btn13, 2, 3);
        
        Scene scene = new Scene(root, 250, 250);
        
        primaryStage.setTitle("21");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
