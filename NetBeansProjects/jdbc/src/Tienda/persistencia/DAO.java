
package Tienda.persistencia;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;


/**
 *
 * @author Ale y Choy
 */
public abstract class DAO {
    
    protected Connection conexion=null;
    protected ResultSet resultado=null;
    protected Statement setencia=null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "";
}
