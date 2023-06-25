package after;

public class UserService {
    Database db;

    public UserService(Database db){
        this.db = db;
    }
    void registerUser(){
        Query query = db.createQuery();
    }
}
