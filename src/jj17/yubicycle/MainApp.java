package jj17.yubicycle;

import jj17.yubicycle.util.getRFIDvalue;
import jj17.yubicycle.view.loginController;
import jj17.yubicycle.view.mainstageController;
import jj17.yubicycle.view.numberController;
import jj17.yubicycle.view.registerController;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private String tuid;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("The YU Bicycle rental system");

		initRootLayout();

		showMainPage();
	}

	public void initRootLayout() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/rootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showMainPage() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/mainstage.fxml"));
			AnchorPane mainpage = (AnchorPane) loader.load();

			rootLayout.setCenter(mainpage);

			mainstageController controller = loader.getController();
			controller.setMainApp(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showLoginDialog() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/loginDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			Stage dialogStage = new Stage();
			dialogStage.setTitle("login");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);

	        loginController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        
	        dialogStage.showAndWait();

			getRFIDvalue rfid = new getRFIDvalue();
			tuid = rfid.getUid();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showRegisterDialog() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RegisterDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			Stage dialogStage = new Stage();
			dialogStage.setTitle("register");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);

	        registerController controller = loader.getController();
	        controller.setDialogStage(dialogStage);

	        dialogStage.showAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
