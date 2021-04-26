/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex6client;

import idk.ex6Client;
import java.util.Scanner;

/**
 *
 * @author kantanat
 */
public class Ex6client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ex6Client obj = new ex6Client();
    Scanner sc = new Scanner(System.in);
    System.out.print("radian = ");
    String rad = sc.nextLine();
    String xml =obj.getXml(rad);
    System.out.println(xml);
    }
    
}
