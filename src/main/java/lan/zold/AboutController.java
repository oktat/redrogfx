/*
* File: AboutController.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-08
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AboutController {
    @FXML
    void onClickBackButton(ActionEvent event) {
      App.setRoot("mainScene");
    }
}
