/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notesful.db;

/**
 *
 * @author Prise
 */
@SuppressWarnings("serial")
public class DBException extends Exception {
    
    public DBException (){}
    
    public DBException (Exception e){
        super(e);
    }
    
}
