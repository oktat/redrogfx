/*
* File: StoreFile.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-08
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class em {
  public static void writeDrog(Drog drog) {
    try {
      tryWriteDrog(drog);
    } catch (FileNotFoundException e) {
      System.err.println("Hiba! A fájl nem található!");
      System.err.println(e.getMessage());
    }
  }
  public static void tryWriteDrog(Drog drog) throws FileNotFoundException {
    FileOutputStream fos = new FileOutputStream("drogs.txt", true);
    PrintWriter pw = new PrintWriter(fos);
    pw.print(drog.id + ":");
    pw.print(drog.name + ":");
    pw.print(drog.price + ":");
    pw.println(drog.quantity);
    pw.close();
  }
}
