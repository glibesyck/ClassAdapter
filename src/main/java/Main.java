import adapter.Authorization;
import adapter.DataBase;


import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();
        if (authorization.authorizationing(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
