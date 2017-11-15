package jj17.yubicycle.view;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import jj17.yubicycle.util.getRFIDvalue;

/**
 * 濡쒓렇�씤李� 而⑦듃濡ㅻ윭. 濡쒓렇�씤 李� �궡�뿉�꽌 臾댁뒯 �룞�옉�쓣 �븷吏�瑜� �뿬湲곗꽌 援ы쁽�빐�빞�븿.
 */
public class loginController {

	private Stage dialogStage;
	private boolean okClicked = false;
	

	@FXML
	private void initialize() {
		
	}

	/**
	 * 硫붿씤�뿉�꽌 遺덈윭�삱 �뒪�뀒�씠吏�.
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	@FXML
	private void handleExit() {
		dialogStage.close();
	}
}