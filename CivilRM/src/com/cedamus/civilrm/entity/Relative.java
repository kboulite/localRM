package com.cedamus.civilrm.entity;
// Generated Feb 8, 2017 9:36:18 PM by Hibernate Tools 4.3.1



/**
 * Relative generated by hbm2java
 */
public class Relative  implements java.io.Serializable {


     private long id;
     private String code;
     private String label;

    public Relative() {
    }

	
    public Relative(long id) {
        this.id = id;
    }
    public Relative(long id, String code, String label) {
       this.id = id;
       this.code = code;
       this.label = label;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }




}

