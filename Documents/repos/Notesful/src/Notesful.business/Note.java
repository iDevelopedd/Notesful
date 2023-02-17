package Notesful;

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
