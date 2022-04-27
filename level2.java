

//  Müslim Yýlmaz - 150119566 && Yunus Kaya - 150119566 

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class level2 extends Application {
	
	 static Stage classStage = new Stage();
	 public double WIDTH = 400;
     public double HEIGHT = 400;
    
    public void start(Stage primaryStage) {
    	
    	classStage = primaryStage;
    	
    	
        

        GridPane gridPane = new GridPane();


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Rectangle rectangle = new Rectangle(i * WIDTH / 10,
                        j * HEIGHT / 10, WIDTH / 10, HEIGHT / 10);
                gridPane.add(rectangle,i,j);
                rectangle.setStroke(Color.BLACK);
                rectangle.setFill(Color.GRAY);



                Button wood = new Button();
                wood.setStyle("-fx-background-color: Plum;");
                wood.setMaxSize(50,50);
                wood.setOnAction (e -> {
                    int x = (int)(wood.getBoundsInParent().getMinX() / 46);
                    int y = (int)(wood.getBoundsInParent().getMinY() / 46);
                   

                    Button mirror = new Button();
                    mirror.setStyle("-fx-background-color: DeepSkyBlue;");
                    mirror.setMaxSize(50,50);
                    mirror.setOnAction(e1 -> {
                        Button empty = new Button();
                        empty.setStyle("-fx-background-color: White;");
                        empty.setMaxSize(50,50);

                        if (mirror.getStyle().equals("-fx-background-color: DeepSkyBlue;")) {
                            gridPane.getChildren().remove(mirror);
                            gridPane.getChildren().add(empty);
                            GridPane.setRowIndex(empty, y);
                            GridPane.setColumnIndex(empty, x);
                            
                            
                        }
                        
                        

                    });
                    
                    


                    if (wood.getStyle().equals("-fx-background-color: Plum;")) {
                        gridPane.getChildren().remove(wood);
                        gridPane.getChildren().add(mirror);
                        GridPane.setRowIndex(mirror, y);
                        GridPane.setColumnIndex(mirror, x);
                    }

                });

                Button mirror = new Button();
                mirror.setStyle("-fx-background-color: DeepSkyBlue;");
                mirror.setMaxSize(50,50);
                mirror.setOnMouseClicked(e -> {
                    int x = (int)(mirror.getBoundsInParent().getMinX() / 46);
                    int y = (int)(mirror.getBoundsInParent().getMinY() / 46);
                   
                   
                    Button empty = new Button();
                    empty.setStyle("-fx-background-color: White;");
                    empty.setMaxSize(50,50);

                    if (mirror.getStyle().equals("-fx-background-color: DeepSkyBlue;"))
                        gridPane.getChildren().remove(mirror);
                    gridPane.getChildren().add(empty);
                    GridPane.setRowIndex(empty, y);
                    GridPane.setColumnIndex(empty, x);


                });

                Button empty = new Button();
                empty.setStyle("-fx-background-color: white;");
                empty.setMaxSize(50,50);
                
         

                if ((i == 1 && j == 1) || (i == 8 && j == 8) || (i == 1 && j == 8) || (i == 8 && j == 1))
                    gridPane.add(empty, i, j);
                else if ((i == 1 && j == 4) || (i == 2 && j == 4) || (i == 3 && j == 4)
                		|| (i == 5 && j == 4) || (i == 6 && j == 4) || (i == 7 && j == 4) || ( i == 2 && j == 5)
                		|| (i == 3 && j == 5) || (i == 4 && j == 5) || ( i == 6 && j == 5)
                		|| (i == 7 && j == 5) || (i == 8 && j == 5))
                    gridPane.add(wood,i,j);
                else if ((i == 4 && j == 1) || (i == 4 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 5)
                		|| (i == 4 && j == 6) || (i == 4 && j == 7) || (i == 5 && j == 8) || ( i == 5 && j == 2) || (i == 5 && j == 5) 
                		|| (i == 5 && j == 3) || (i == 5 && j == 4) || (i == 5 && j == 6) || ( i == 5 && j == 7) || ( i == 4 && j == 4))
                		
                    gridPane.add(mirror,i,j);
          
            }
        }

        gridPane.setVgap(5.5);
        gridPane.setHgap(5.5);
        gridPane.setStyle("-fx-background-color: gray;");

        BorderPane pane = new BorderPane();
        pane.setCenter(gridPane);
        Button next = new Button("Next Level");
        next.setOnAction(e->{
        level3 lvl3 = new level3();
        lvl3.start(level3.classStage);
        Stage stage = (Stage) next.getScene().getWindow();
        stage.close();
        });
        pane.setBottom(next);
        pane.setTop(new Text("Level 2"));


        
        Scene scene = new Scene(pane, WIDTH + 65, HEIGHT + 95);
        primaryStage.setTitle("Game BOX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
