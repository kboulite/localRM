package com.cedamus.civilrm;

import com.cedamus.civilrm.ui.MainForm;

import com.cedamus.civilrm.ui.liste;


public class MainApp  {

 

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          liste form = new liste();
        form.setVisible(true);
    }

}
