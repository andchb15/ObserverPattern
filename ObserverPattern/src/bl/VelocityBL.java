/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.util.ArrayList;
import observer.VelocityObserver;
import observer.VelocitySubject;

/**
 *
 * @author Christopher Andrä
 */
public class VelocityBL implements VelocitySubject
{
    

    private ArrayList<VelocityEntry> entries = new ArrayList();
    private ArrayList<VelocityObserver> observers = new ArrayList();

    public void add(VelocityEntry v)
    {
        entries.add(v);
        inform(v);
    }

    @Override
    public void register(VelocityObserver observer)
    {
        observers.add(observer);
    }

    @Override
    public void deregister(VelocityObserver observer)
    {
        observers.remove(observer);
    }

 

}
