/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedamus.civilrm.utils;

/**
 *
 * @author Khalid
 */
public class Tools {

    static java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N

    public static String getLabel(String key) {
        String result=null;
        try {
             result= bundle.getString(key);
        } catch (Exception er) {
           
        }
        if (result==null) result = "no key";
        return result;
    }

}
