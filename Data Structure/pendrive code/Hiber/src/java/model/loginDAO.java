/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import org.hibernate.cfg.*;
import org.hibernate.*;        

/**
 *
 * @author Sahil
 */
public class loginDAO {
    public boolean search(login l)
    {
        login l1 = null;
        
        try
        {
        
        Configuration cf = new Configuration();
        
        cf.configure("hibercfg/hibernate.cfg.xml");
        
        SessionFactory sf = cf.buildSessionFactory();
        
        Session s = sf.openSession();
        
        l1 = (login)s.get(login.class,l.getUsername());
        
        s.close();
        
        
        sf.close();
        
         }
        catch(Exception e)
        {
            System.out.print(e);
        }
        
       
        if(l1 == null)
            return false;
        if(l1.equals(l))
           return true;
        else
           return false; 
           }
    
}
