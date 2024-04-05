import db.DB;
import db.DbException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            /*
            st = conn.prepareStatement(
                    "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS
            );
            st.setString(1, "Rodrigo");
            st.setString(2, "rodrigo@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("02/06/1998").getTime()));
            st.setDouble(4, 3000.00);
            st.setInt(5, 4);
            */

            st = conn.prepareStatement("INSERT INTO department (Name) VALUES ('D1'), ('D2')", Statement.RETURN_GENERATED_KEYS);
            // Quando é uma operação que vc vai alterar os dados vc chama o executeUpdate -> Numero inteiro indicando quantas linhas foram alteradas
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                // Pegando a id que foi gerado
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    // Pegando o valor da primeira coluna
                    int id = rs.getInt(1);
                    System.out.println("Rows affected: " + rowsAffected);
                    System.out.println("Done! ID: " + id);
                }
            } else {
                System.out.println("No rows affected");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }/* catch (ParseException e) {
            e.printStackTrace();
        } */ finally {
            DB.closeConnection();
            DB.closeStatement(st);
        }
    }
}