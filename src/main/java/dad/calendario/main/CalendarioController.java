package dad.calendario.main;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import dad.javafx.componentes.MonthCalendar;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class CalendarioController implements Initializable {

	@FXML
	private GridPane view;

	@FXML
	private MonthCalendar calendar1;

	@FXML
	private MonthCalendar calendar2;

	@FXML
	private MonthCalendar calendar3;

	@FXML
	private MonthCalendar calendar4;

	@FXML
	private MonthCalendar calendar5;

	@FXML
	private MonthCalendar calendar6;

	@FXML
	private MonthCalendar calendar7;

	@FXML
	private MonthCalendar calendar8;

	@FXML
	private MonthCalendar calendar9;

	@FXML
	private MonthCalendar calendar10;

	@FXML
	private MonthCalendar calendar11;

	@FXML
	private MonthCalendar calendar12;

	@FXML
	private Button atrasButton;

	@FXML
	private Button adelanteButton;

	@FXML
	private Label annioLabel;
	
	//model
	
	private IntegerProperty year = new SimpleIntegerProperty();
	
	public CalendarioController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalendarioView.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		year.addListener((o,ov,nv) -> onYearListener());
		year.set(LocalDate.now().getYear());
		calendar1.setMonth(0);
		calendar2.setMonth(1);
		calendar3.setMonth(2);
		calendar4.setMonth(3);
		calendar5.setMonth(4);
		calendar6.setMonth(5);
		calendar7.setMonth(6);
		calendar8.setMonth(7);
		calendar9.setMonth(8);
		calendar10.setMonth(9);
		calendar11.setMonth(10);
		calendar12.setMonth(11);
		annioLabel.textProperty().bind(yearProperty().asString());
	}

	private void onYearListener() {
		calendar1.setYear(getYear());
		calendar2.setYear(getYear());
		calendar3.setYear(getYear());
		calendar4.setYear(getYear());
		calendar5.setYear(getYear());
		calendar6.setYear(getYear());
		calendar7.setYear(getYear());
		calendar8.setYear(getYear());
		calendar9.setYear(getYear());
		calendar10.setYear(getYear());
		calendar11.setYear(getYear());
		calendar12.setYear(getYear());
	}

	@FXML
	void onAdelanteButton(ActionEvent event) {
		setYear(getYear()+1);
	}

	@FXML
	void onAtrasAction(ActionEvent event) {
		setYear(getYear()-1);
	}
	
	public GridPane getView() {
		return view;
	}

	public final IntegerProperty yearProperty() {
		return this.year;
	}
	

	public final int getYear() {
		return this.yearProperty().get();
	}
	

	public final void setYear(final int year) {
		this.yearProperty().set(year);
	}
	

}
