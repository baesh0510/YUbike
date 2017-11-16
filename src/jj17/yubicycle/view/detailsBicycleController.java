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
 * �뿩��,������,��ü�� => ��Ÿ���� ��Ʈ�ѷ�
 * @author kkw
 *
 */

public class detailsBicycleController {

	// SimpleIntegerProperty SIP = new SimpleIntegerProperty();
	
	@FXML private Label selectedNumberLabel;
	@FXML private Label selectedStatus;
	private Bicycle tbc;

	/**
	 * ���̺��̵� ���� FXML ��Ҹ� ������ �ݵ�� �����ڸ� �������Ѵ�!!!!!!!!!!!!!!!!!!!
	 * �̰Ŷ����� 30��~1�ð� ������
	 */
	/**
	 *  1.�뿩����     2.�뿩��     3.��ü��     4.������
	 */
	public detailsBicycleController() {
	}
	
	@FXML
	private void initialize() throws SQLException {
		tbc = findBC(numberController.getCellText());
		selectedNumberLabel.setText(String.valueOf(numberController.getCellText()));  // setText�� ���ε��ϴ°�!
		//selectedNumberLabel.setText(String.valueOf(tbc.get));
		if(tbc.getBicycleStatus()==1) {
			selectedStatus.setText("�뿩 �����մϴ�.");
		}
		else if(tbc.getBicycleStatus()==2) {
			selectedStatus.setText("�뿩 ���Դϴ�.");
		}
		else if (tbc.getBicycleStatus()==3){
			selectedStatus.setText("��ü ���Դϴ�.");
		}
		else {
			selectedStatus.setText("���� ���Դϴ�.");
		}
	}
	
	/**
	 * Ŭ������ �� ������ ��ȣ�� �˷��ִ� �޼ҵ�
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
			System.out.println("�ش� �л����� !");
			return null;
		}
		return null;
	}
}
