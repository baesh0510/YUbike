package jj17.yubicycle.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import jj17.yubicycle.MainApp;
import jj17.yubicycle.model.Bicycle;
import jj17.yubicycle.model.Student;
import jj17.yubicycle.util.connect;
import jj17.yubicycle.util.getRFIDvalue;


public class numberController {
	Student tst = new Student();
	
	@FXML private Button btn1; 	@FXML private Button btn2; 	@FXML private Button btn3; 	@FXML private Button btn4; 	@FXML private Button btn5;@FXML private Button btn6; @FXML private Button btn7; @FXML private Button btn8; @FXML private Button btn9; @FXML private Button btn10;
	@FXML private Button btn11; @FXML private Button btn12; @FXML private Button btn13; @FXML private Button btn14; @FXML private Button btn15;@FXML private Button btn16; @FXML private Button btn17; @FXML private Button btn18; @FXML private Button btn19; @FXML private Button btn20;
	@FXML private Button btn21; @FXML private Button btn22; @FXML private Button btn23; @FXML private Button btn24; @FXML private Button btn25;@FXML private Button btn26; @FXML private Button btn27; @FXML private Button btn28; @FXML private Button btn29; @FXML private Button btn30;
	@FXML private Button btn31; @FXML private Button btn32; @FXML private Button btn33; @FXML private Button btn34; @FXML private Button btn35;@FXML private Button btn36; @FXML private Button btn37; @FXML private Button btn38; @FXML private Button btn39; @FXML private Button btn40;
	@FXML private Button btn41; @FXML private Button btn42; @FXML private Button btn43; @FXML private Button btn44; @FXML private Button btn45;@FXML private Button btn46; @FXML private Button btn47; @FXML private Button btn48; @FXML private Button btn49; @FXML private Button btn50;
	@FXML private Button btn51; @FXML private Button btn52; @FXML private Button btn53; @FXML private Button btn54; @FXML private Button btn55;@FXML private Button btn56; @FXML private Button btn57; @FXML private Button btn58; @FXML private Button btn59; @FXML private Button btn60;
	@FXML private Button btn61; @FXML private Button btn62; @FXML private Button btn63; @FXML private Button btn64; @FXML private Button btn65;@FXML private Button btn66; @FXML private Button btn67; @FXML private Button btn68; @FXML private Button btn69; @FXML private Button btn70;
	@FXML private Button btn71; @FXML private Button btn72; @FXML private Button btn73; @FXML private Button btn74; @FXML private Button btn75;@FXML private Button btn76; @FXML private Button btn77; @FXML private Button btn78; @FXML private Button btn79; @FXML private Button btn80;  
	
	
	private Stage dialogStage;

	@FXML
	private GridPane gridPane;

	private MainApp mainApp;

	private static String text;

	@FXML
	private void initialize() {
		
	}

	/**
	 * 특정 버튼 눌렀을 때 로드하는 메소드.
	 * 
	 */
	@FXML
	public void showNumberDialog() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/detailsBicycle.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			Stage dialogStage = new Stage();
			dialogStage.setTitle("select bicycle");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			//dialogStage.initOwner();
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			dialogStage.showAndWait();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 클릭한 좌표의 숫자를 가져오는 메소드
	 * @param e
	 */
	@FXML
	public void getCell(MouseEvent e) {
		text = ((Button)e.getSource()).getText();
		System.out.println(text);
	}
	
	public static int getCellText() {
		return Integer.parseInt(text);
	}
	
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
}