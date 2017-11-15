package jj17.yubicycle.view;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import jj17.yubicycle.util.getRFIDvalue;

/**
 * 회원가입창 컨트롤러. 회원가입창 내에서 무슨동작을 할지 여기서 구현해야함.
 * @author Administrator
 *
 */
public class registerController {

	private Stage dialogStage;
	private boolean isClickedOK = false;

	@FXML
	private void initialize() {
	}

	/**
	 * 메인에서 불러올 스테이지.
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}

	/**
	 * 새 창 띄우고 그담에 컨트롤러 이어붙이기 가능하지싶음.
	 * 그걸 여기서 구현하도록 해야함.
	 * 여기에서 showNextDialog() 하는 식으로 하면되는가?
	 */
	@FXML
	private void handleAgree() {
		System.out.println("agree button clicked!");
		dialogStage.close();
	}

	@FXML
	private void handleExit() {
		dialogStage.close();
	}
}