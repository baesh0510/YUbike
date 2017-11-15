package jj17.yubicycle.view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import jj17.yubicycle.MainApp;
import jj17.yubicycle.model.bicycleStatus;

/**
 * 筌롫뗄�뵥占쎌넅筌롳옙 �뚢뫂�뱜嚥▲끇�쑎. 筌롫뗄�뵥占쎌넅筌롫똻肉됵옙苑� �눧�똻�뮣占쎈짗占쎌삂占쎌뱽 占쎈막筌욑옙 占쎈연疫꿸퀣苑� �뤃�뗭겱占쎈퉸占쎈튊占쎈맙.
 * @author Administrator
 *
 * TODO: gridpane  占쎌뒄占쎈꺖 筌뤿돃苡뀐옙�뱽 占쎈땭占쏙옙占쎈뮉筌욑옙 占쎌쁽占쎈짗占쎌몵嚥∽옙 占쎌뵥占쎈뻼占쎈릭野껓옙 占쎈릭疫뀐옙! (占쎄쉐�⑨옙)
 */
public class mainstageController {
	@FXML
	private Label okRentalLabel;

	@FXML
	private GridPane gridPane;

	private MainApp mainApp;
	private numberController numberCtrl;

	public mainstageController() {
	}

	@FXML
	private void initialize() {

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private void handleLoginButton() {
		mainApp.showLoginDialog();
	}

	@FXML
	private void handleRegisterButton() {
		mainApp.showRegisterDialog();
	}

	@FXML
	private void handleNumberClicked() {
		numberCtrl.showNumberDialog();
	}
	
	@FXML
	private void close() {
		return;
	}
	
}