

//  Müslim Yýlmaz - 150119566 && Yunus Kaya - 150119566 


import java.time.Duration;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class game extends Application {

    Button m71 = new Button();
    Button m81 = new Button();
    Button m82 = new Button();
    Button m17 = new Button();
    Button m18 = new Button();
    Button m28 = new Button();
    Button w17 = new Button();
    Button w18 = new Button();
    Button w28 = new Button();
    
    
    
 // Game screen  width and game screen height
   
    public double WIDTH = 400;     
    public double HEIGHT = 400;    


    public void start(Stage primaryStage) {
    	
       
    	// Creating girdPane for game interface
        
    	GridPane gridPane = new GridPane();   


    	// Creating 10x10 rectangle with two dimensional array and  width,height values.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Rectangle rectangle = new Rectangle(i * WIDTH / 10,   // 
                        j * HEIGHT / 10, WIDTH / 10, HEIGHT / 10);
                gridPane.add(rectangle,i,j);
                
                
                // Adjusting the color and stroke of rectangles
                rectangle.setStroke(Color.BLACK);
                rectangle.setFill(Color.GRAY);

                // Creating empty button and adjusting size
                Button empty = new Button();
                empty.setStyle("-fx-background-color: White;");
                empty.setMaxSize(50,50);

                // Locate each empty button  specific coordinates 
                if ((i == 4 && j == 4) || (i == 5 && j == 5) || (i == 4 && j == 5) || (i == 5 && j == 4))
                    gridPane.add(empty, i, j);
                
                // Adding some buttons 
               
                else if (i == 1 && j == 7){
                    w17.setStyle("-fx-background-color: Plum;");
                    w17.setMaxSize(50,50);
                    gridPane.add(w17,i,j);
                }
                else if (i == 1 && j == 8){
                    w18.setStyle("-fx-background-color: Plum;");
                    w18.setMaxSize(50,50);
                    gridPane.add(w18,i,j);
                }
                else if (i == 2 && j == 8){
                    w28.setStyle("-fx-background-color: Plum;");
                    w28.setMaxSize(50,50);
                    gridPane.add(w28,i,j);
                }
                else if   (i == 7 && j == 1)  {

                    m71.setStyle("-fx-background-color: DeepSkyBlue;");
                    m71.setMaxSize(50,50);
                    gridPane.add(m71,i,j);

                }
                else if  (i == 8 && j == 1) {
                    m81.setStyle("-fx-background-color: DeepSkyBlue;");
                    m81.setMaxSize(50,50);
                    gridPane.add(m81,i,j);

                }
                else if (i == 8 && j == 2) {
                    m82.setStyle("-fx-background-color: DeepSkyBlue;");
                    m82.setMaxSize(50,50);
                    gridPane.add(m82,i,j);

                }

                w17.setOnAction(e->{
                    m17.setStyle("-fx-background-color: DeepSkyBlue;");
                    m17.setMaxSize(50,50);
                    m18.setStyle("-fx-background-color: DeepSkyBlue;");
                    m18.setMaxSize(50,50);
                    m28.setStyle("-fx-background-color: DeepSkyBlue;");
                    m28.setMaxSize(50,50);

                    gridPane.getChildren().remove(w17);
                    gridPane.getChildren().add(m17);
                    GridPane.setRowIndex(m17,GridPane.getRowIndex(w17) );
                    GridPane.setColumnIndex(m17, GridPane.getColumnIndex(w17));

                    gridPane.getChildren().remove(w18);
                    gridPane.getChildren().add(m18);
                    GridPane.setRowIndex(m18,GridPane.getRowIndex(w18) );
                    GridPane.setColumnIndex(m18, GridPane.getColumnIndex(w18));

                    w28.setOnAction(e1->{
                        Button empty20 = new Button();
                        empty20.setStyle("-fx-background-color: White;");
                        empty20.setMaxSize(50,50);

                        gridPane.getChildren().remove(w28);
                        gridPane.getChildren().add(m28);
                        GridPane.setRowIndex(m28,GridPane.getRowIndex(w28) );
                        GridPane.setColumnIndex(m28, GridPane.getColumnIndex(w28));

                        gridPane.getChildren().remove(m18);
                        gridPane.getChildren().add(empty20);
                        GridPane.setRowIndex(empty20,GridPane.getRowIndex(w18) );
                        GridPane.setColumnIndex(empty20, GridPane.getColumnIndex(w18));

                        m28.setOnAction(e2->{
                            Button empty24 = new Button();
                            empty24.setStyle("-fx-background-color: White;");
                            empty24.setMaxSize(50,50);

                            gridPane.getChildren().remove(m28);
                            gridPane.getChildren().add(empty24);
                            GridPane.setRowIndex(empty24,GridPane.getRowIndex(m28) );
                            GridPane.setColumnIndex(empty24, GridPane.getColumnIndex(m28));
                        });

                    });

                    m17.setOnAction(e1->{
                        gridPane.getChildren().remove(m17);
                        gridPane.getChildren().remove(m18);

                        Button empty7 = new Button();
                        empty7.setStyle("-fx-background-color: White;");
                        empty7.setMaxSize(50,50);

                        Button empty8 = new Button();
                        empty8.setStyle("-fx-background-color: White;");
                        empty8.setMaxSize(50,50);

                        gridPane.getChildren().add(empty7);
                        GridPane.setColumnIndex(empty7,1);
                        GridPane.setRowIndex(empty7,7);

                        gridPane.getChildren().add(empty8);
                        GridPane.setColumnIndex(empty8,1);
                        GridPane.setRowIndex(empty8,8);

                        w28.setOnAction(e2->{
                            gridPane.getChildren().remove(w28);
                            gridPane.getChildren().add(m28);
                            GridPane.setRowIndex(m28,GridPane.getRowIndex(w28) );
                            GridPane.setColumnIndex(m28, GridPane.getColumnIndex(w28));

                            m28.setOnAction(e3->{
                                Button empty14 = new Button();
                                empty14.setStyle("-fx-background-color: White;");
                                empty14.setMaxSize(50,50);

                                gridPane.getChildren().remove(m28);
                                gridPane.getChildren().add(empty14);
                                GridPane.setRowIndex(empty14,GridPane.getRowIndex(w28) );
                                GridPane.setColumnIndex(empty14, GridPane.getColumnIndex(w28));
                            });
                        });
                    });

                    m18.setOnAction(e1->{
                        Button empty17 = new Button();
                        empty17.setStyle("-fx-background-color: White;");
                        empty17.setMaxSize(50,50);

                        Button empty18 = new Button();
                        empty18.setStyle("-fx-background-color: White;");
                        empty18.setMaxSize(50,50);

                        gridPane.getChildren().remove(m18);
                        gridPane.getChildren().add(empty17);
                        GridPane.setRowIndex(empty17,GridPane.getRowIndex(w18) );
                        GridPane.setColumnIndex(empty17, GridPane.getColumnIndex(w18));

                        gridPane.getChildren().remove(m17);
                        gridPane.getChildren().add(empty18);
                        GridPane.setRowIndex(empty18,GridPane.getRowIndex(w17) );
                        GridPane.setColumnIndex(empty18, GridPane.getColumnIndex(w17));

                        gridPane.getChildren().remove(w28);
                        gridPane.getChildren().add(m28);
                        GridPane.setRowIndex(m28,GridPane.getRowIndex(w28) );
                        GridPane.setColumnIndex(m28, GridPane.getColumnIndex(w28));

                        m28.setOnAction(e2->{
                            Button empty19 = new Button();
                            empty19.setStyle("-fx-background-color: White;");
                            empty19.setMaxSize(50,50);

                            gridPane.getChildren().remove(m28);
                            gridPane.getChildren().add(empty19);
                            GridPane.setRowIndex(empty19,GridPane.getRowIndex(m28) );
                            GridPane.setColumnIndex(empty19, GridPane.getColumnIndex(m28));
                        });
                    });

                });

                w18.setOnAction(e->{
                    m17.setStyle("-fx-background-color: DeepSkyBlue;");
                    m17.setMaxSize(50,50);
                    m18.setStyle("-fx-background-color: DeepSkyBlue;");
                    m18.setMaxSize(50,50);
                    m28.setStyle("-fx-background-color: DeepSkyBlue;");
                    m28.setMaxSize(50,50);

                    gridPane.getChildren().remove(w18);
                    gridPane.getChildren().add(m18);
                    GridPane.setRowIndex(m18,GridPane.getRowIndex(w18) );
                    GridPane.setColumnIndex(m18, GridPane.getColumnIndex(w18));

                    gridPane.getChildren().remove(w17);
                    gridPane.getChildren().add(m17);
                    GridPane.setRowIndex(m17,GridPane.getRowIndex(w17) );
                    GridPane.setColumnIndex(m17, GridPane.getColumnIndex(w17));

                    gridPane.getChildren().remove(w28);
                    gridPane.getChildren().add(m28);
                    GridPane.setRowIndex(m28,GridPane.getRowIndex(w28) );
                    GridPane.setColumnIndex(m28, GridPane.getColumnIndex(w28));

                    m28.setOnAction(e1->{
                        Button empty21 = new Button();
                        empty21.setStyle("-fx-background-color: White;");
                        empty21.setMaxSize(50,50);

                        Button empty22 = new Button();
                        empty22.setStyle("-fx-background-color: White;");
                        empty22.setMaxSize(50,50);

                        gridPane.getChildren().remove(m28);
                        gridPane.getChildren().add(empty21);
                        GridPane.setRowIndex(empty21,GridPane.getRowIndex(m28) );
                        GridPane.setColumnIndex(empty21, GridPane.getColumnIndex(m28));

                        gridPane.getChildren().remove(m18);
                        gridPane.getChildren().add(empty22);
                        GridPane.setRowIndex(empty22,GridPane.getRowIndex(m18) );
                        GridPane.setColumnIndex(empty22, GridPane.getColumnIndex(m18));

                        m17.setOnAction(e2->{
                            Button empty23 = new Button();
                            empty23.setStyle("-fx-background-color: White;");
                            empty23.setMaxSize(50,50);

                            gridPane.getChildren().remove(m17);
                            gridPane.getChildren().add(empty23);
                            GridPane.setRowIndex(empty23,GridPane.getRowIndex(m17) );
                            GridPane.setColumnIndex(empty23, GridPane.getColumnIndex(m17));
                        });

                    });

                    m17.setOnAction(e1->{
                        gridPane.getChildren().remove(m17);
                        gridPane.getChildren().remove(m18);

                        Button empty12 = new Button();
                        empty12.setStyle("-fx-background-color: White;");
                        empty12.setMaxSize(50,50);

                        Button empty13 = new Button();
                        empty13.setStyle("-fx-background-color: White;");
                        empty13.setMaxSize(50,50);

                        gridPane.getChildren().add(empty12);
                        GridPane.setColumnIndex(empty12,1);
                        GridPane.setRowIndex(empty12,7);

                        gridPane.getChildren().add(empty13);
                        GridPane.setColumnIndex(empty13,1);
                        GridPane.setRowIndex(empty13,8);

                        m18.setOnAction(e2->{
                            gridPane.getChildren().remove(m17);
                            gridPane.getChildren().remove(m18);
                            gridPane.getChildren().remove(m28);

                            Button empty9 = new Button();
                            empty9.setStyle("-fx-background-color: White;");
                            empty9.setMaxSize(50,50);

                            Button empty10 = new Button();
                            empty10.setStyle("-fx-background-color: White;");
                            empty10.setMaxSize(50,50);

                            Button empty11 = new Button();
                            empty11.setStyle("-fx-background-color: White;");
                            empty11.setMaxSize(50,50);

                            gridPane.getChildren().add(empty11);
                            GridPane.setColumnIndex(empty11,1);
                            GridPane.setRowIndex(empty11,7);

                            gridPane.getChildren().add(empty9);
                            GridPane.setColumnIndex(empty9,1);
                            GridPane.setRowIndex(empty9,8);

                            gridPane.getChildren().add(empty10);
                            GridPane.setColumnIndex(empty10,2);
                            GridPane.setRowIndex(empty10,8);
                        });

                        m28.setOnAction(e3->{
                            Button empty14 = new Button();
                            empty14.setStyle("-fx-background-color: White;");
                            empty14.setMaxSize(50,50);

                            gridPane.getChildren().remove(m28);
                            gridPane.getChildren().add(empty14);
                            GridPane.setRowIndex(empty14,GridPane.getRowIndex(m28) );
                            GridPane.setColumnIndex(empty14, GridPane.getColumnIndex(m28));
                        });

                        });
                    m18.setOnAction(e2-> {
                        Button empty15 = new Button();
                        empty15.setStyle("-fx-background-color: White;");
                        empty15.setMaxSize(50, 50);

                        Button empty16 = new Button();
                        empty16.setStyle("-fx-background-color: White;");
                        empty16.setMaxSize(50, 50);

                        Button empty17 = new Button();
                        empty17.setStyle("-fx-background-color: White;");
                        empty17.setMaxSize(50, 50);

                        gridPane.getChildren().remove(m18);
                        gridPane.getChildren().add(empty15);
                        GridPane.setRowIndex(empty15, GridPane.getRowIndex(m18));
                        GridPane.setColumnIndex(empty15, GridPane.getColumnIndex(m18));

                        gridPane.getChildren().remove(m17);
                        gridPane.getChildren().add(empty16);
                        GridPane.setRowIndex(empty16, GridPane.getRowIndex(m17));
                        GridPane.setColumnIndex(empty16, GridPane.getColumnIndex(m17));

                        gridPane.getChildren().remove(m28);
                        gridPane.getChildren().add(empty17);
                        GridPane.setRowIndex(empty17, GridPane.getRowIndex(m28));
                        GridPane.setColumnIndex(empty17, GridPane.getColumnIndex(m28));
                    });

                });

                w28.setOnAction(e->{
                    m17.setStyle("-fx-background-color: DeepSkyBlue;");
                    m17.setMaxSize(50,50);
                    m18.setStyle("-fx-background-color: DeepSkyBlue;");
                    m18.setMaxSize(50,50);
                    m28.setStyle("-fx-background-color: DeepSkyBlue;");
                    m28.setMaxSize(50,50);

                    gridPane.getChildren().remove(w28);
                    gridPane.getChildren().add(m28);
                    GridPane.setRowIndex(m28, GridPane.getRowIndex(w28));
                    GridPane.setColumnIndex(m28, GridPane.getColumnIndex(w28));

                    gridPane.getChildren().remove(w18);
                    gridPane.getChildren().add(m18);
                    GridPane.setRowIndex(m18, GridPane.getRowIndex(w18));
                    GridPane.setColumnIndex(m18, GridPane.getColumnIndex(w18));

                    m28.setOnAction(e1->{
                        Button empty25 = new Button();
                        empty25.setStyle("-fx-background-color: White;");
                        empty25.setMaxSize(50, 50);

                        Button empty26 = new Button();
                        empty26.setStyle("-fx-background-color: White;");
                        empty26.setMaxSize(50, 50);

                        gridPane.getChildren().remove(m28);
                        gridPane.getChildren().add(empty25);
                        GridPane.setRowIndex(empty25, GridPane.getRowIndex(m28));
                        GridPane.setColumnIndex(empty25, GridPane.getColumnIndex(m28));

                        gridPane.getChildren().remove(m18);
                        gridPane.getChildren().add(empty26);
                        GridPane.setRowIndex(empty26, GridPane.getRowIndex(m18));
                        GridPane.setColumnIndex(empty26, GridPane.getColumnIndex(m18));

                        w17.setOnAction(e2->{
                            gridPane.getChildren().remove(w17);
                            gridPane.getChildren().add(m17);
                            GridPane.setRowIndex(m17, GridPane.getRowIndex(w17));
                            GridPane.setColumnIndex(m17, GridPane.getColumnIndex(w17));

                            m17.setOnAction(e3->{
                                Button empty27 = new Button();
                                empty27.setStyle("-fx-background-color: White;");
                                empty27.setMaxSize(50, 50);

                                gridPane.getChildren().remove(m17);
                                gridPane.getChildren().add(empty27);
                                GridPane.setRowIndex(empty27, GridPane.getRowIndex(m17));
                                GridPane.setColumnIndex(empty27, GridPane.getColumnIndex(m17));
                            });
                        });

                    });
                    m18.setOnAction(e1->{
                        Button empty28 = new Button();
                        empty28.setStyle("-fx-background-color: White;");
                        empty28.setMaxSize(50,50);

                        Button empty29 = new Button();
                        empty29.setStyle("-fx-background-color: White;");
                        empty29.setMaxSize(50,50);

                        gridPane.getChildren().remove(m18);
                        gridPane.getChildren().add(empty28);
                        GridPane.setRowIndex(empty28,GridPane.getRowIndex(w18) );
                        GridPane.setColumnIndex(empty28, GridPane.getColumnIndex(w18));

                        gridPane.getChildren().remove(m28);
                        gridPane.getChildren().add(empty29);
                        GridPane.setRowIndex(empty29,GridPane.getRowIndex(w28) );
                        GridPane.setColumnIndex(empty29, GridPane.getColumnIndex(w28));

                        gridPane.getChildren().remove(w17);
                        gridPane.getChildren().add(m17);
                        GridPane.setRowIndex(m17,GridPane.getRowIndex(w17) );
                        GridPane.setColumnIndex(m17, GridPane.getColumnIndex(w17));

                        m17.setOnAction(e2->{
                            Button empty30 = new Button();
                            empty30.setStyle("-fx-background-color: White;");
                            empty30.setMaxSize(50,50);

                            gridPane.getChildren().remove(m28);
                            gridPane.getChildren().add(empty30);
                            GridPane.setRowIndex(empty30,GridPane.getRowIndex(m17) );
                            GridPane.setColumnIndex(empty30, GridPane.getColumnIndex(m17));
                        });
                    });

                    w17.setOnAction(e1->{
                        Button empty31 = new Button();
                        empty31.setStyle("-fx-background-color: White;");
                        empty31.setMaxSize(50,50);

                        gridPane.getChildren().remove(w17);
                        gridPane.getChildren().add(m17);
                        GridPane.setRowIndex(m17,GridPane.getRowIndex(w17) );
                        GridPane.setColumnIndex(m17, GridPane.getColumnIndex(w17));

                        gridPane.getChildren().remove(m18);
                        gridPane.getChildren().add(empty31);
                        GridPane.setRowIndex(empty31,GridPane.getRowIndex(m18) );
                        GridPane.setColumnIndex(empty31, GridPane.getColumnIndex(m18));

                        m17.setOnAction(e2->{
                            Button empty32 = new Button();
                            empty32.setStyle("-fx-background-color: White;");
                            empty32.setMaxSize(50,50);

                            gridPane.getChildren().remove(m17);
                            gridPane.getChildren().add(empty32);
                            GridPane.setRowIndex(empty32,GridPane.getRowIndex(m17) );
                            GridPane.setColumnIndex(empty32, GridPane.getColumnIndex(m17));
                        });
                        m28.setOnAction(e2->{
                            Button empty33 = new Button();
                            empty33.setStyle("-fx-background-color: White;");
                            empty33.setMaxSize(50,50);

                            gridPane.getChildren().remove(m28);
                            gridPane.getChildren().add(empty33);
                            GridPane.setRowIndex(empty33,GridPane.getRowIndex(m28) );
                            GridPane.setColumnIndex(empty33, GridPane.getColumnIndex(m28));
                        });

                    });

                });

                m81.setOnAction(e -> {
                	
                	
                	
                    
                    gridPane.getChildren().remove(m82);
                    gridPane.getChildren().remove(m71);
                    gridPane.getChildren().remove(m81);
                    

                    gridPane.getChildren().add(empty);
                    GridPane.setRowIndex(empty,GridPane.getRowIndex(m81) );
                    GridPane.setColumnIndex(empty, GridPane.getColumnIndex(m81));


                    Button empty1 = new Button();
                    empty1.setStyle("-fx-background-color: White;");
                    empty1.setMaxSize(50,50);

                    gridPane.getChildren().add(empty1);
                    GridPane.setColumnIndex(empty1,7);
                    GridPane.setRowIndex(empty1,1);

                    Button empty2 = new Button();
                    empty2.setStyle("-fx-background-color: White;");
                    empty2.setMaxSize(50,50);

                    gridPane.getChildren().add(empty2);
                    GridPane.setColumnIndex(empty2,8);
                    GridPane.setRowIndex(empty2,2);


                });

                m71.setOnAction(e1->{

                    Button empty3 = new Button();
                    empty3.setStyle("-fx-background-color: White;");
                    empty3.setMaxSize(50,50);


                    gridPane.getChildren().remove(m71);
                    gridPane.getChildren().add(empty3);
                    GridPane.setColumnIndex(empty3,7);
                    GridPane.setRowIndex(empty3,1);

                    Button empty4 = new Button();
                    empty4.setStyle("-fx-background-color: White;");
                    empty4.setMaxSize(50,50);

                    gridPane.getChildren().remove(m81);
                    gridPane.getChildren().add(empty4);
                    GridPane.setColumnIndex(empty4,8);
                    GridPane.setRowIndex(empty4,1);



                });

                m82.setOnAction(e2 ->{

                    gridPane.getChildren().remove(m82);
                    Button empty5 = new Button();
                    empty5.setStyle("-fx-background-color: White;");
                    empty5.setMaxSize(50,50);

                    gridPane.getChildren().add(empty5);
                    GridPane.setColumnIndex(empty5, 8);
                    GridPane.setRowIndex(empty5, 2);

                    Button empty6 = new Button();
                    empty6.setStyle("-fx-background-color: White;");
                    empty6.setMaxSize(50,50);

                    gridPane.getChildren().remove(m81);
                    gridPane.getChildren().add(empty6);
                    GridPane.setColumnIndex(empty6,8);
                    GridPane.setRowIndex(empty6,1);

                });


            }
        }

        gridPane.setVgap(5.5);
        gridPane.setHgap(5.5);
        gridPane.setStyle("-fx-background-color: gray;");

        BorderPane pane = new BorderPane();
        pane.setCenter(gridPane);

        Button next = new Button("Next Level");
        next.setOnAction(e->{
            level2 lvl2 = new level2();
            lvl2.start(level2.classStage);
            Stage stage = (Stage) next.getScene().getWindow();
            stage.close();
        });

        pane.setBottom(next);
        Label score = new Label("Level 1");
        
       
        pane.setTop(score);


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, WIDTH + 65, HEIGHT + 105);
        primaryStage.setTitle("Game BOX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }


    public static void main(String[] args) {
        launch(args);
    }


}
