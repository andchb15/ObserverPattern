package packageMain;

import bl.VelocityBL;
import gui.VelocityTable;
import gui.VelocityTableColor;
import gui.VelocityTableInput;

/**
 *
 * @author Christopher Andrä
 */
public class Main
{

    public static void main(String[] args)
    {
        VelocityBL bl = new VelocityBL();
        VelocityTableColor color = new VelocityTableColor();
        VelocityTableInput input = new VelocityTableInput();
        VelocityTable table = new VelocityTable();

        bl.register(color);

        table.setVisible(true);
        color.setVisible(true);
        input.setVisible(true);
    }

}
