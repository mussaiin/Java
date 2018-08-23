package QUIZ;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class QUIZ extends Application {
    Label n1 , op, n2, ans;
    int c;
    Label nra;
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        HBox lbl = new HBox(); lbl.setAlignment(Pos.CENTER);
        lbl.setPadding(new Insets(20));
        Label label = new Label("Welcome to the Mad Math Skillz:");
        lbl.getChildren().add(label);
        
        
        HBox esep = new HBox(); esep.setAlignment(Pos.CENTER); esep.setSpacing(20);
        n1 = new Label(""+(int)(Math.random()*100));
        op = new Label("+");
        n2 = new Label(""+(int)(Math.random()*100));
        ans = new Label(" = ?");
        esep.getChildren().addAll(n1, op, n2, ans);
        
        HBox hb = new HBox(); hb.setSpacing(15);
        hb.setAlignment(Pos.CENTER);
        hb.setPadding(new Insets(20));
        Label ans = new Label("Answer:");
        TextField tf = new TextField();tf.setPrefColumnCount(10);
        Button btn = new Button("Next");
        
        hb.getChildren().addAll(ans, tf, btn);
        
        btn.setOnAction(e ->{
            if(op.getText().equals("+")){
                if(Integer.parseInt(n1.getText())+Integer.parseInt(n2.getText())==Integer.parseInt(tf.getText())){
                    c++;
                    esep.getChildren().removeAll(n1,op,n2,ans);
                    if(((int)(Math.random()*10))<=5)
                        op.setText("-");
                    else
                        op.setText("+");
                    n1.setText(""+(int)(Math.random()*100));
                    n2.setText(""+(int)(Math.random()*100));
                    esep.getChildren().addAll(n1,op,n2,ans);                    
                }
                else{
                    esep.getChildren().removeAll(n1,op,n2,ans);
                    nra = new Label("You answered wrong and failed!\nYour score is "+c);
                    esep.getChildren().add(nra);
                    btn.setDisable(true);
                }
            }
            else if(op.getText().equals("-")){
               if(Integer.parseInt(n1.getText())-Integer.parseInt(n2.getText())==Integer.parseInt(tf.getText())){
                    c++;
                    esep.getChildren().removeAll(n1,op,n2,ans);
                    if(((int)(Math.random()*10))<=5)
                        op.setText("-");
                    else
                        op.setText("+");
                    n1.setText(""+(int)(Math.random()*100));
                    n2.setText(""+(int)(Math.random()*100));
                    esep.getChildren().addAll(n1,op,n2,ans);
                    
                }
                else{
                    esep.getChildren().removeAll(n1,op,n2,ans);
                    nra = new Label("You answered wrong and failed!\nYour score is "+c);
                    esep.getChildren().add(nra);
                    btn.setDisable(true);
                }
            } 

        });
                
        root.setCenter(esep);
        root.setBottom(hb);
        root.setTop(lbl);
        
        Scene scene = new Scene(root, 350, 170);
        
        primaryStage.setTitle("Quiz");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
