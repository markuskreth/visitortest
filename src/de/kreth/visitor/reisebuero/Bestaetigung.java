package de.kreth.visitor.reisebuero;

import java.text.DateFormat;
import java.util.Date;

public class Bestaetigung {
   private String format = "Wir bestätigen ihre Buchung vom %1s bis zum %2s";
   
   public String bucheLeistung(Date vom, Date bis) {
      return String.format(format, DateFormat.getDateInstance().format(vom), DateFormat.getDateInstance().format(bis));
   }
}
