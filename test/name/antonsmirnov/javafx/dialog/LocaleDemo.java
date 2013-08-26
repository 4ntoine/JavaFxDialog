package name.antonsmirnov.javafx.dialog;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.util.Locale;

public class LocaleDemo extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Locale.setDefault(Locale.FRENCH);
    Dialog.buildConfirmation("", "").addYesButton(new EventHandler() {
      @Override
      public void handle(Event event) {
        //nothing to do
      }
    }).build().show();
  }
}
