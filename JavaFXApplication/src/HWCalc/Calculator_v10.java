package HWCalc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculator_v10 extends Application {
    String lines = "", oper = "";
    Label lbl = new Label();
    int num = -1, res = -1;
    Boolean in = true;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator_v1.0");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(35, 35, 35, 35));
        
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3.");
        
        b1.setMinSize(30, 30);
        b2.setMinSize(30, 30);
        b3.setMinSize(30, 30);
        
        b1.setStyle("-fx-background-color: grey;");
        b2.setStyle("-fx-background-color: grey;");
        b3.setStyle("-fx-background-color: grey;");
        
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        
        b4.setMinSize(30, 30);
        b5.setMinSize(30, 30);
        b6.setMinSize(30, 30);
        
        b4.setStyle("-fx-background-color: grey;");
        b5.setStyle("-fx-background-color: grey;");
        b6.setStyle("-fx-background-color: grey;");
        
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        
        b7.setMinSize(30, 30);
        b8.setMinSize(30, 30);
        b9.setMinSize(30, 30);
        
        b7.setStyle("-fx-background-color: grey;");
        b8.setStyle("-fx-background-color: grey;");
        b9.setStyle("-fx-background-color: grey;");
        
        
        Button b0 = new Button("0");
        Button bdot = new Button(".");
        Button beq = new Button("=");
        Button bplus = new Button("+");
        Button bminus = new Button("-");
        Button bdiv = new Button("/");
        Button bmult = new Button("*");
        
        b0.setStyle("-fx-background-color: grey;");
        
        b0.setMinSize(30, 30);
        bdot.setMinSize(30, 30);
        beq.setMinSize(30, 30);
        bplus.setMinSize(30, 30);
        bminus.setMinSize(30, 30);
        bdiv.setMinSize(30, 30);
        bmult.setMinSize(30, 30);
        
        Button bcos = new Button("cos");
        Button bsqr = new Button("sqr");
        Button bmod = new Button("mod");
        Button bclr = new Button("clr");
        
        bcos.setStyle("-fx-font-size: 10;");
        bsqr.setStyle("-fx-font-size: 10;");
        bmod.setStyle("-fx-font-size: 8;");
        
        bcos.setMaxSize(30, 30);
        bsqr.setMaxSize(30, 30);
        bmod.setMaxSize(30, 30);
        bclr.setMaxSize(30, 30);
        
        //Text txt = new Text("lllllllllll");
        lbl.setMinSize(135, 40);
        lbl.setFont(new Font("Arial", 25));
        lbl.setStyle("-fx-border-color: black;");
        lbl.setStyle("-fx-stroke-width: 5px;");
        lbl.setStyle("-fx-border-style: solid;");
        lbl.setStyle("-fx-background-color: blue;");
        
        //lbl.setVisible(true);
        //lbl.setText("lorem ipdslfs");
        grid.add(lbl, 0, 0, 3, 1);
      
        grid.add(bcos, 0, 1);
        grid.add(bsqr, 1, 1);
        grid.add(bmod, 2, 1);
        grid.add(bclr, 3, 1);
        
        grid.add(b7, 0, 2);
        grid.add(b8, 1, 2);
        grid.add(b9, 2, 2);
        grid.add(bdiv, 3, 2);
        
        grid.add(b4, 0, 3);
        grid.add(b5, 1, 3);
        grid.add(b6, 2, 3);
        grid.add(bmult, 3, 3);
        
        grid.add(b1, 0, 4);
        grid.add(b2, 1, 4);
        grid.add(b3, 2, 4);
        grid.add(bminus, 3, 4);
        
        grid.add(bdot, 0, 5);
        grid.add(b0, 1, 5);
        grid.add(beq, 2, 5);
        grid.add(bplus, 3, 5);
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "1";
                lbl.setText(lines);
            }
        });
        
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "2";
                lbl.setText(lines);
            }
        });
        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "3";
                lbl.setText(lines);
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "4";
                lbl.setText(lines);
            }
        });
        
        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "5";
                lbl.setText(lines);
            }
        });
        
        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "6";
                lbl.setText(lines);
            }
        });
        
        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "7";
                lbl.setText(lines);
            }
        });
        
        b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "8";
                lbl.setText(lines);
            }
        });
        
        b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (in) {
                    lines = "";
                    in = false;
                }
                lines += "9";
                lbl.setText(lines);
            }
        });
        
        bplus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!in) {
                    num = Integer.parseInt(lines);
                } 
                if (oper.length() != 0) {
                    if (oper.equals("+")) res += num;
                    else if (oper.equals("-")) res -= num;
                    else if (oper.equals("*")) res *= num;
                    else if (oper.equals("/")) res /= num;
                    else if (oper.equals("%")) res %= num;
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                num = 0;
                oper = "+";
                in = true;
                lbl.setText(lines);
            }
        });
        
        bminus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!in) {
                    num = Integer.parseInt(lines);
                }  
                if (oper.length() != 0) {
                    if (oper.equals("+")) res += num;
                    else if (oper.equals("-")) res -= num;
                    else if (oper.equals("*")) res *= num;
                    else if (oper.equals("/")) res /= num;
                    else if (oper.equals("%")) res %= num;
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                
                num = 0;
                oper = "-";
                in = true;
                lbl.setText(lines);
            }
        });
        
        bdiv.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!in) {
                    num = Integer.parseInt(lines);
                }  
                if (oper.length() != 0) {
                    if (oper.equals("+")) res += num;
                    else if (oper.equals("-")) res -= num;
                    else if (oper.equals("*")) res *= num;
                    else if (oper.equals("/")) res /= num;
                    else if (oper.equals("%")) res %= num;
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                
                num = 0;
                oper = "/";
                in = true;
                lbl.setText(lines);
            }
        });
        
        bmult.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!in) {
                    num = Integer.parseInt(lines);
                }  
                if (oper.length() != 0) {
                    if (oper.equals("+")) res += num;
                    else if (oper.equals("-")) res -= num;
                    else if (oper.equals("*")) res *= num;
                    else if (oper.equals("/")) res /= num;
                    else if (oper.equals("%")) res %= num;
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                
                num = 0;
                oper = "*";
                in = true;
                lbl.setText(lines);
            }
        });
        
        beq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!in) {
                    num = Integer.parseInt(lines);
                }
                if (oper.length() != 0) {
                    if (oper.equals("+")) res += num;
                    else if (oper.equals("-")) res -= num;
                    else if (oper.equals("*")) res *= num;
                    else if (oper.equals("/")) res /= num;
                    else if (oper.equals("%")) res %= num;
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                
                num = 0;
                oper = "=";
                in = true;
                lbl.setText(lines);
            }
        });
        
        bclr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                num = 0;
                oper = "";
                in = true;
                lines = "";
                lbl.setText(lines);
            }
        });
        
        bmod.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!in) {
                    num = Integer.parseInt(lines);
                }  
                if (oper.length() != 0) {
                    if (oper.equals("+")) res += num;
                    else if (oper.equals("-")) res -= num;
                    else if (oper.equals("*")) res *= num;
                    else if (oper.equals("/")) res /= num;
                    else if (oper.equals("%")) res %= num;
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                
                num = 0;
                oper = "%";
                in = true;
                lbl.setText(lines);
            }
        });
        
        
        
        primaryStage.setScene(new Scene(grid, 150, 250));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
