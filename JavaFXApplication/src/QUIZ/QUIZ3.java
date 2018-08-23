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
public class QUIZ3 extends Application {
    int fnum = 0;
    int player1 = 0, player2 = 0; 
    Label lbl = new Label("X's turn");
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        Button btn1 = new Button("");
        Button btn2 = new Button("");
        Button btn3 = new Button("");
        Button btn11 = new Button("");
        Button btn12 = new Button("");
        Button btn13 = new Button("");
        Button btn21 = new Button("");
        Button btn22 = new Button("");
        Button btn23 = new Button("");
        
        btn1.setMinSize(75, 75);btn2.setMinSize(75, 75);btn3.setMinSize(75, 75);
        btn11.setMinSize(75, 75);btn12.setMinSize(75, 75);btn13.setMinSize(75, 75);  
        btn21.setMinSize(75, 75);btn22.setMinSize(75, 75);btn23.setMinSize(75, 75);  

        btn1.setOnAction((ActionEvent event) -> {
            if(fnum%2==0){
                btn1.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn1.setText("O");
                lbl.setText("X's turn");
            }
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
                
            fnum+=1;
        });
        btn2.setOnAction((ActionEvent event) -> {
            if(fnum%2==0){
                btn2.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn2.setText("O");
                lbl.setText("X's turn");
            }
            
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });
        btn3.setOnAction((ActionEvent event) -> {
            if(fnum%2==0){
                btn3.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn3.setText("O");
                lbl.setText("X's turn");
            }
            
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });        
        btn11.setOnAction((ActionEvent event) -> {
            if(fnum%2==0){
                btn11.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn11.setText("O");
                lbl.setText("X's turn");
            }
            
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });
        btn12.setOnAction((ActionEvent event) -> {
            if(fnum%2==0){
                btn12.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn12.setText("O");
                lbl.setText("X's turn");
            }
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });
        btn13.setOnAction((ActionEvent event) -> {
           if(fnum%2==0){
                btn13.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn13.setText("O");
                lbl.setText("X's turn");
            }
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });
                
        btn21.setOnAction((ActionEvent event) -> {
            if(fnum%2==0){
                btn21.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn21.setText("O");
                lbl.setText("X's turn");
            }
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });
        btn22.setOnAction((ActionEvent event) -> {
            if(fnum%2==0){
                btn22.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn22.setText("O");
                lbl.setText("X's turn");
            }
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });
        btn23.setOnAction((ActionEvent event) -> {
           if(fnum%2==0){
                btn23.setText("X");
                lbl.setText("O's turn");
            }
            else{
                btn23.setText("O");
                lbl.setText("X's turn");
            }
            if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn11.getText() == "X" && btn12.getText() == "X" && btn13.getText() == "X") {
                lbl.setText("X won");
            }
            else if (btn21.getText() == "X" && btn22.getText() == "X" && btn23.getText() == "X") {
                lbl.setText("X won");
            } 
            else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn11.getText() == "O" && btn12.getText() == "O" && btn13.getText() == "O") {
                lbl.setText("O won");
            }
            else if (btn21.getText() == "O" && btn22.getText() == "O" && btn23.getText() == "O") {
                lbl.setText("O won");
            } 
            else if(btn1.getText() == "O" && btn12.getText() == "O" && btn23.getText() == "O"){
                lbl.setText("O won");
            }   
            else if(btn1.getText() == "X" && btn12.getText() == "X" && btn23.getText() == "X"){
                lbl.setText("X won");
            }
             
            fnum+=1;
        });
        root.add(lbl, 0, 0, 3, 1); 
        root.add(btn1, 0, 1);root.add(btn2, 1, 1);root.add(btn3, 2, 1);
        root.add(btn11, 0, 2);root.add(btn12, 1, 2);root.add(btn13, 2, 2);
        root.add(btn21, 0, 3);root.add(btn22, 1, 3);root.add(btn23, 2, 3);
        Scene scene = new Scene(root, 375, 375);
        
        primaryStage.setTitle("TicTacToe");
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
