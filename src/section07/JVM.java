package section07;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.Statement;

public class JVM {

    public static void main(String[] args) {
        //객체 주소값 출력하기

        Connection con;
        Statement stmt;
        ResultSet rs;




        Car car1 = new Car(), car2 = new Car();

        System.out.println(System.identityHashCode(car1));
    }
}
