package Notesful;

public class User {
    
    private long UserId;
    private String Username;
    private String Email;
    private String Password;
    private int Notes;
    
    public long getUserId() {
        return UserId;
    }
    
    public String getUsername() {
        return Username;
    }
    
    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public int getNotes() {
        return Notes;
    }
    
    public void setNotes(int Notes) {
        this.Notes = Notes;
    } 
}
