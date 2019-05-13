package kr.co.calc;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
	@FXML private TextField txtResult;
	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	@FXML private Button btnEq;
	@FXML private Button btnPlus;
	@FXML private Button btnMinus;
	@FXML private Button btnMul;
	@FXML private Button btnDiv;
	@FXML private Button btnClear;
	
	private int num1;
	private int num2;
	private int op;
	private String numFir="0";
	private String numSec="0";
	
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		btnClear.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				txtResult.setText("0");
				op=0;
				num1 = -1;
				num2 = -1;
				numFir ="0";
				numSec ="0";
			}
		});
		btn0.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				setNum(0);
			}
		});
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				setNum(1);
			}
		});
		btn2.setOnAction(event->btn2Action(event));
		btn3.setOnAction(event->btn3Action(event));
		btn4.setOnAction(event->btn4Action(event));
		btn5.setOnAction(event->btn5Action(event));
		btn6.setOnAction(event->btn6Action(event));
		btn7.setOnAction(event->btn7Action(event));
		btn8.setOnAction(event->btn8Action(event));
		btn9.setOnAction(event->btn9Action(event));
		btnPlus.setOnAction(event->btnPlusAction(event));
		btnMinus.setOnAction(event->btnMinusAction(event));
		btnMul.setOnAction(event->btnMulAction(event));
		btnDiv.setOnAction(event->btnDivAction(event));
		btnEq.setOnAction(event->btnEqAction(event));
	}//initialize end
	
	public void setNum(int n) {
		if(op ==0) {
			if(numFir=="0"){
				numFir = null;
				txtResult.setText(""+n);
				numFir = txtResult.getText();
				num1 = Integer.parseInt(numFir);
			}
			else {
				numFir += String.valueOf(n);
				txtResult.setText(""+numFir);
				num1 = Integer.parseInt(numFir);				
			}
		}else {
			if(numSec=="0"){
				numSec = null;
				txtResult.setText(""+n);
				numSec = txtResult.getText();
				num2 = Integer.parseInt(numSec);
			}
			else {
				numSec += String.valueOf(n);
				txtResult.setText(""+numSec);
				num2 = Integer.parseInt(numSec);				
			}
		}
	}
	public void btnPlusAction(ActionEvent event) {
		op = 1;
	}
	public void btnMinusAction(ActionEvent event) {
		op = 2;
	}
	public void btnMulAction(ActionEvent event) {
		op = 3;
	}
	public void btnDivAction(ActionEvent event) {
		op = 4;
	}
	public void btnEqAction(ActionEvent event) {
		int result = 0;
		switch (op) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;

		}
		txtResult.setText(""+result);
	}
	public void btn2Action(ActionEvent event) {
		setNum(2);
	}
	public void btn3Action(ActionEvent event) {
		setNum(3);
	}
	public void btn4Action(ActionEvent event) {
		setNum(4);
	}
	public void btn5Action(ActionEvent event) {
		setNum(5);
	}
	public void btn6Action(ActionEvent event) {
		setNum(6);
	}
	public void btn7Action(ActionEvent event) {
		setNum(7);
	}
	public void btn8Action(ActionEvent event) {
		setNum(8);
	}
	public void btn9Action(ActionEvent event) {
		setNum(9);
	}
}
