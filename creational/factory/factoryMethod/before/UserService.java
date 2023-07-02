package before;

public class UserService {
    Database db;

    public UserService(Database db){
        this.db = db;
    }
    void registerUser(){
        Query query;
        if(db.getType().equals(DatabaseType.MYSQL)){
            query = new MySQLQuery();
        }
        else if(db.getType().equals(DatabaseType.MONGODB)){
            query = new MongoDBQuery();
        }
    }
}
