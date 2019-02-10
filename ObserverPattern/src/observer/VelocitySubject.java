/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import bl.VelocityEntry;

/**
 *
 * @author Christopher Andrä
 */
public interface VelocitySubject
{
    public void register(VelocityObserver observer);
    
    public void deregister(VelocityObserver observer);
    
    public void inform(VelocityEntry e);
        
}
