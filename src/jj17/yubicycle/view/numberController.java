package jj17.yubicycle.view;

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
import jj17.yubicycle.util.getRFIDvalue;


public class numberController {

	private Stage dialogStage;

	@FXML
	private GridPane gridPane;

	private MainApp mainApp;

	private static String text;

	@FXML
	private void initialize() {
	}

	@FXML
	public void showNumberDialog() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/numberDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			Stage dialogStage = new Stage();
			dialogStage.setTitle("select bicycle");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			//dialogStage.initOwner();
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			dialogStage.showAndWait();


			//Node source = (Node)e.getSource();
			//Integer colIndex = GridPane.getColumnIndex(source);
			//Integer rowIndex = GridPane.getRowIndex(source);
			//System.out.printf("Mouse entered cell [%d, %d]%n", colIndex.intValue(), rowIndex.intValue());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@FXML
	public void getCell(MouseEvent e) {
		//Node source = (Node)e.getSource(); // 이놈은 버튼의 소스를 가져온다! 고로 버튼값으로 유추해야
		text = ((Button)e.getSource()).getText();
//		try {
//			for( Node node: gridPane.getChildren()) {
//
//	            if( node instanceof Button) {
//	                if( node.getBoundsInParent().contains(e.getSceneX(),  e.getSceneY())) {
//	                    System.out.println( "Node: " + node + " at " + GridPane.getRowIndex( node) + "/" + GridPane.getColumnIndex( node));
//	                }
//	            }
//	        }
//		} catch(Exception ex) {
//			ex.printStackTrace();
//		}
		System.out.println(text);
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
}