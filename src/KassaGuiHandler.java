import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class KassaGuiHandler
{
    private final Button exitKnop, knop1,knop2,knop3,knop4,knop5,knop6,knop7,knop8,knop9;

    public KassaGuiHandler(GridPane pane)
    {
        exitKnop = new Button("Exit");
        exitKnop.setOnAction(event -> System.exit(0));
        exitKnop.setMinSize(150, 50);
        pane.add(exitKnop, 1, 3);
        
        knop1 = new Button("knop");
        knop1.setMinSize(150, 100);
        pane.add(knop1, 0, 0);
        
        knop2 = new Button("knop");
        knop2.setMinSize(150, 100);
        pane.add(knop2, 1, 0);
        
        knop3 = new Button("knop");
        knop3.setMinSize(150, 100);
        pane.add(knop3, 2, 0);
        
        knop4 = new Button("knop");
        knop4.setMinSize(150, 100);
        pane.add(knop4, 0, 1);
        
        knop5 = new Button("knop");
        knop5.setMinHeight(80);
        knop5.setMinSize(150, 100);
        pane.add(knop5, 1, 1);
        
        knop6 = new Button("knop");
        knop6.setMinSize(150, 100);
        pane.add(knop6, 2, 1);
        
        knop7 = new Button("knop");
        knop7.setMinSize(150, 100);
        pane.add(knop7, 0, 2);
        
        knop8 = new Button("knop");
        knop8.setMinSize(150, 100);
        pane.add(knop8, 1, 2);
        
        knop9 = new Button("knop");
        knop9.setMinSize(150, 100);
        pane.add(knop9, 2, 2);
    }

}
