package jj17.yubicycle.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import jj17.yubicycle.model.Bicycle;
import jj17.yubicycle.model.bicycleStatus;
import jj17.yubicycle.util.connect;
import jj17.yubicycle.view.numberController;

/**
 * 대여중,수리중,연체중 => 나타내는 컨트롤러
 * @author kkw
 *
 */

public class detailsBicycleController {

	// SimpleIntegerProperty SIP = new SimpleIntegerProperty();
	
	@FXML private Label selectedNumberLabel;
	@FXML private Label selectedStatus;
	private Bicycle tbc;

	/**
	 * 레이블이든 뭐든 FXML 요소를 쓰려면 반드시 생성자를 만들어야한다!!!!!!!!!!!!!!!!!!!
	 * 이거때문에 30분~1시간 내버림
	 */
	/**
	 *  1.대여가능     2.대여중     3.연체중     4.수리중
	 */
	public detailsBicycleController() {
	}
	
	@FXML
	private void initialize() throws SQLException {
		tbc = findBC(numberController.getCellText());
		selectedNumberLabel.setText(String.valueOf(numberController.getCellText()));  // setText가 바인딩하는것!
		//selectedNumberLabel.setText(String.valueOf(tbc.get));
		if(tbc.getBicycleStatus()==1) {
			selectedStatus.setText("대여 가능합니다.");
		}
		else if(tbc.getBicycleStatus()==2) {
			selectedStatus.setText("대여 중입니다.");
		}
		else if (tbc.getBicycleStatus()==3){
			selectedStatus.setText("연체 중입니다.");
		}
		else {
			selectedStatus.setText("수리 중입니다.");
		}
	}
	
	/**
	 * 클릭했을 때 자전거 번호를 알려주는 메소드
	 * @param bicycleNo
	 * @return
	 * @throws SQLException
	 */
	public Bicycle findBC(int selectedNumber) throws SQLException {
		
		//selectedNumberLabel.textProperty().bind(new SimpleIntegerProperty(selectedNumber).asString());
		
		//selectedNumberLabel.setText(Integer.toString(numberController.getCellText()));
		
		Connection conn = connect.connectToDB();
		PreparedStatement pstmt = null;
		Bicycle tbc = new Bicycle();
		ResultSet rset;
		String sql = "";

		try {
			sql = "select * from MainGateBikeData where bicycleNo=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, selectedNumber);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				tbc.setBicycleNo(rset.getInt(1));
				tbc.setBicycleStatus(rset.getInt(2));
				tbc.setCurrentRentPersonSID(rset.getInt(3));
				tbc.setCurrentBikeLatitude(rset.getDouble(4));
				tbc.setCurrentBikeLongitude(rset.getDouble(5));
			}
			return tbc;
		} catch (Exception e) {
			e.getMessage();
		}

		if (tbc.getBicycleNo() == 0) {
			System.out.println("해당 학생없음 !");
			return null;
		}
		return null;
	}
}
