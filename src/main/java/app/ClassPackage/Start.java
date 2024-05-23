/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.ClassPackage;

import app.FileHandling.FileReader;
import app.FormPackage.Login;

/**
 *
 * @author Anon
 */
public class Start {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
}
