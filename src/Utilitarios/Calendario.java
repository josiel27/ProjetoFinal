/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author jejo
 */
public class Calendario {
    public String CalculaDataPromocao(){
        Date e = new Date();
        e.setDate(e.getDate()+7);
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        String  s = a.format(e);  
        return s;
    }
    public String PegaData(){
        Date i = new Date();
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        String  s = a.format(i);  
        return s;
    }
}
