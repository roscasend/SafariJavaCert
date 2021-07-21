package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Ex1 {
  void doStuff() throws SQLException {};
  void doStuff2() throws FileNotFoundException {};
  void tryStuff() throws SQLException, FileNotFoundException {
    try {
      doStuff();
      doStuff2();
      // MULTI-CATCH formal param is FINAL
//    } catch (SQLException | FileNotFoundException e) {
    } catch (Exception e) {
//      Exception f = e;
//      e = f;
//      throw f;
      throw e;
    }
  }
}
