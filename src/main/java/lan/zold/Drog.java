/*
* File: Drog.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-08
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold;


/*
 * A Drogable osztály az adatokat tartalmazza
 * 
 */
public class Drog {
  /* Azonosító */
  Integer id;
  /* Neve */
  String name;
  /* A termék ára */ 
  Double price;
  /* Termekek száma */
  Integer quantity;
  /* Konstruktor */
  public Integer getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public Double getPrice() {
    return price;
  }
  public Integer getQuantity() {
    return quantity;
  }
  //A beállító metódusok következnek
}
