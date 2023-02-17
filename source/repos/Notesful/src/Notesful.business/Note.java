/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notesful;

/**
 *
 * @author Prise
 */
public class Note {
    
    private int NoteId;
    private String Title;
    private String Description;
    
    public int getNoteId() {
        return NoteId;
    }
    
    public String getTitle() {
        return Title;
    }
    
    public void setTitle(String Title) {
        this.Title = Title;
    }
    
    public String getDescription() {
        return Description;
    }
    
    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
