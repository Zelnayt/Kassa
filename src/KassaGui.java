import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class KassaGui
{
	private final Label bedragLabel, subtotaalLabel;
	private final TextField bedragVak, subtotaalVak;

	public KassaGui(GridPane pane)
	{
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setVgap(5);
		pane.setHgap(5);
		pane.setAlignment(Pos.CENTER);

		// Maak de labels
		bedragLabel = new Label("Voer bedrag in");
		subtotaalLabel = new Label("Subtotaal");

		// Maak de tekstvakken
		bedragVak = new TextField();
		bedragVak.setAlignment(Pos.CENTER_RIGHT);

		subtotaalVak = new TextField();

		// Zorg dat gebruiker niet kan wijzigen en lijn rechts uit
		subtotaalVak.setEditable(false);
		subtotaalVak.setAlignment(Pos.CENTER_RIGHT);

		// Event-handling
		bedragVak.setOnAction(event -> subtotaalBerekening());

		// Voeg de componenten toe aan het GridPane
		pane.add(bedragLabel, 0, 0);
		pane.add(bedragVak, 0, 1);
		pane.add(subtotaalLabel, 1, 0);
		pane.add(subtotaalVak, 1, 1);
	}

	private void subtotaalBerekening()
	{
		String invoer = bedragVak.getText();
		double invoerBedrag = Double.parseDouble(invoer);

		// even voor de test
		double st = invoerBedrag;

		subtotaalVak.setText(String.format("%.2f", st));

		// Maak invoervak leeg
		bedragVak.setText("");
	}

}
