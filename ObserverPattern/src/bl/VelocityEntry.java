/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;


import packageMain.Strasse;

/**
 *
 * @author Christopher Andrä
 */
public class VelocityEntry
{

    private int velo;
    private Strasse comboStrasse;

    public VelocityEntry(int velo, Strasse comboStrasse)
    {
        this.velo = velo;
        this.comboStrasse = comboStrasse;
    }

    public Strasse getComboStrasse()
    {
        return comboStrasse;
    }

    public void setComboStrasse(Strasse comboStrasse)
    {
        this.comboStrasse = comboStrasse;
    }

    public int getVelo()
    {
        return velo;
    }

    public void setVelo(int velo)
    {
        this.velo = velo;
    }

}
