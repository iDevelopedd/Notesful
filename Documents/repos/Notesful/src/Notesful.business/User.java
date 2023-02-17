package Notesful;

public class User {
    
    private int UserId;
    private String Username;
    private String Email;
    private String Password;
    private int Notes;
    
    public User(String Username, String Email, String Password, int Notes)
    {
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Notes = 0;
    }
    
    public int getUserId() {
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
