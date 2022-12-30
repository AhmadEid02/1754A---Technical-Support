import java.io.File;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shape3 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		TextField tf1 = new TextField("");
		TextField tf2 = new TextField("");
		Button calculate = new Button("calculate");
		TextArea ta1 = new TextArea("output");
		ta1.setMaxSize(70, 70);
		ta1.setWrapText(true);
		ta1.setEditable(false);
		Label l1 = new Label("First number ");
		Label l2 = new Label("Second number ");
		Label l3 = new Label();
		
	
		
		
		
		
		GridPane gp = new GridPane();
		GridPane gp2 = new GridPane();
		gp.setVgap(10);
		gp.setHgap(3);
		gp.setAlignment(Pos.CENTER);
		
		
		gp.addColumn(0, gp2);
		gp2.addColumn(0, l1);
		gp2.addColumn(0, tf1);
		gp2.addColumn(0, l2);
		gp2.addColumn(0, tf2);
		gp2.addColumn(0, calculate);
		
		gp.addRow(0, ta1);
		gp.addColumn(0, l3);
		
		GridPane.setColumnSpan(l3, 2);
		//gp.setColumnSpan(l3, 2);
		// stage 2
		Stage st2 = new Stage();
		FlowPane gp3 = new FlowPane();
		gp3.setVgap(10);
		gp3.setHgap(3);
		Scene s2 = new Scene(gp3,500,500);
		st2.setScene(s2);
		st2.setTitle("Rectangle");
		
		// setting the button 
		calculate.setOnAction(e->{
		l3.setText("");	
		gp3.getChildren().clear();	
		try {
			int num1 = Integer.parseInt(tf1.getText());
			int num2 = Integer.parseInt(tf2.getText());
			int sum= num1+num2;
			ta1.setText("the sum is "+sum);
			for(int i=0; i<sum;i++) {
				if (sum%2==0)
				gp3.getChildren().add(new Rectangle(20,30,Color.BLUE));
				else 
					gp3.getChildren().add(new Rectangle(20,30,Color.RED));
			}
			st2.show();	
		} catch (Exception e2) {
			System.out.println(e2);
			l3.setText("please enter an Integer number "+e2.getMessage());
			l3.setTextFill(Color.RED);
		}
			
		});
		
		
		
		Scene s1 = new Scene(gp,500,500);
		arg0.setScene(s1);
		arg0.setTitle("Rectangle Calculator");
		arg0.show();
		
	}

}
