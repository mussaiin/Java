/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWCalc;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Nurlybek
 */
public class Calc extends Application {

    String op = "", lines = "";
    Double res = -1.0, num=-1.0;
    Boolean oldop = true;
    Label field = new Label();
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.setHgap(5);
        root.setVgap(5);

        Button b1 = new Button(); b1.setText("   1   ");
        Button b2 = new Button(); b2.setText("   2   ");
        Button b3 = new Button(); b3.setText("   3   ");
        Button b4 = new Button(); b4.setText("   4   ");
        Button b5 = new Button(); b5.setText("   5   ");
        Button b6 = new Button(); b6.setText("   6   ");
        Button b7 = new Button(); b7.setText("   7   ");
        Button b8 = new Button(); b8.setText("   8   ");
        Button b9 = new Button(); b9.setText("   9   ");
        Button b0 = new Button(); b0.setText("   0   ");
        Button C = new Button(); C.setText("   C   ");
        Button sin = new Button(); sin.setText(" sinx ");
        Button cos = new Button(); cos.setText(" cosx");
        Button rootButton = new Button(); rootButton.setText(" root");
        

        Button plus = new Button(); plus.setText("   +   ");
        Button minus = new Button(); minus.setText("   -   ");
        Button mult = new Button(); mult.setText("   *   ");
        Button div = new Button(); div.setText("   /   ");
        Button equal = new Button(); equal.setText("   =   ");
        Button bdot = new Button(); bdot.setText("   .   ");

        root.add(field, 0, 0, 4, 1);
        root.add(C, 0, 1);root.add(sin, 1, 1);root.add(cos, 2, 1);root.add(rootButton, 3, 1);
        root.add(b7, 0, 2);root.add(b8, 1, 2);root.add(b9, 2, 2);root.add(plus, 3, 2);
        root.add(b4, 0, 3);root.add(b5, 1, 3);root.add(b6, 2, 3);root.add(minus, 3, 3);
        root.add(b1, 0, 4);root.add(b2, 1, 4);root.add(b3, 2, 4);root.add(mult, 3, 4);
        root.add(b0, 0, 5);root.add(bdot, 1, 5);root.add(equal, 2, 5);root.add(div, 3, 5);

        b0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                }
                lines+="0";
                field.setText(lines);
            }
        });
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="1";
                field.setText(lines);
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="2";
                field.setText(lines);
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="3";
                field.setText(lines);
            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="4";
                field.setText(lines);
            }
        });
        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="5";
                field.setText(lines);
            }
        });
        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="6";
                field.setText(lines);
            }
        });
        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="7";
                field.setText(lines);
            }
        });
        b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="8";
                field.setText(lines);
            }
        });
        b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                lines+="9";
                field.setText(lines);
            }
        });
        C.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                num = 0.0;
                op = "";
                oldop = true;
                lines = "";
                field.setText(lines);
            }
        });
        bdot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (oldop) {
                    lines = "";
                    oldop = false;
                } 
                else if(!lines.contains(".")){
                    lines+=".";
                    field.setText(lines);
                }
                else{
                    lines+="";
                    field.setText(lines);
                }
            }
        });
        sin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                } 
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = (Math.sin(Math.toRadians(num)));
                    else if(op.equals("cos")) res = (Math.cos(Math.toRadians(num)));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                } 
                else {
                    res = num;
                    lines = String.valueOf(res);
                }
                num = 0.0;
                op = "sin";
                oldop = true;
                field.setText(lines);
            }
        });
        cos.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                } 
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                    else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                } 
                else {
                    res = num;
                    lines = String.valueOf(res);
                }
                num = 0.0;
                op = "cos";
                oldop = true;
                field.setText(lines);
            }
        });
        rootButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                } 
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                    else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                }
                num = 0.0;
                op = "root";
                oldop = true;
                field.setText(lines);
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                } 
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                    else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                } 
                else {
                    res = num;
                    lines = String.valueOf(res);
                }
                num = 0.0;
                op = "+";
                oldop = true;
                field.setText(lines);
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                }  
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                    else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                
                num = 0.0;
                op = "-";
                oldop = true;
                field.setText(lines);
            }
        });
        mult.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                }  
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                    else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                } 
                else {
                    res = num;
                    lines = String.valueOf(res);
                }
                num = 0.0;
                op = "*";
                oldop = true;
                field.setText(lines);
            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                }  
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                    else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                num = 0.0;
                op = "/";
                oldop = true;
                field.setText(lines);
            }
        });
        equal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!oldop) {
                    num = Double.parseDouble(lines);
                }
                if (op.length() != 0) {
                    if (op.equals("+")) res += num;
                    else if (op.equals("-")) res -= num;
                    else if (op.equals("*")) res *= num;
                    else if (op.equals("/")) res /= num;
                    else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                    else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                    else if(op.equals("root")) res = Math.sqrt(num);
                    lines = String.valueOf(res);
                } else {
                    res = num;
                    lines = String.valueOf(res);
                }
                
                num = 0.0;
                op = "=";
                oldop = true;
                field.setText(lines);
            }
        });

        root.setOnKeyPressed(new EventHandler<KeyEvent>(){
            public void handle(KeyEvent e){
                switch(e.getCode()){
                    case DIGIT0:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="0";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT1:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="1";
                        field.setText(lines);
                        break;
                    }  
                    case DIGIT2:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="2";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT3:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="3";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT4:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="4";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT5:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="5";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT6:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="6";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT7:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="7";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT8:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="8";
                        field.setText(lines);
                        break;
                    }
                    case DIGIT9:{ 
                        if (oldop) {
                            lines = "";
                            oldop = false;
                        }
                        lines+="9";
                        field.setText(lines);
                        break;
                    }
                    case BACK_SPACE:{
                        num = 0.0;
                        op = "";
                        oldop = true;
                        lines = "";
                        field.setText(lines);
                        break;
                    }
                    case ENTER:{
                        if (!oldop){
                            num = Double.parseDouble(lines);
                        }
                        if (op.length() != 0) {
                            if (op.equals("+")) res += num;
                            else if (op.equals("-")) res -= num;
                            else if (op.equals("*")) res *= num;
                            else if (op.equals("/")) res /= num;
                            else if(op.equals("sin")) res = Math.sin(Math.toRadians(num));
                            else if(op.equals("cos")) res = Math.cos(Math.toRadians(num));
                            else if(op.equals("root")) res = Math.sqrt(num);
                            lines = String.valueOf(res);
                        } 
                        else {
                            res = num;
                            lines = String.valueOf(res);
                        }
                        num = 0.0;
                        op = "=";
                        oldop = true;
                        field.setText(lines);
                    }   
                    default: break;
                }
            }
        });
        Scene scene = new Scene(root, 270, 220);

        primaryStage.setTitle("Calculator");
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
