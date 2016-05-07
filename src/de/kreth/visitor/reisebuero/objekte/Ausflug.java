package de.kreth.visitor.reisebuero.objekte;

import java.util.Date;

import de.kreth.visitor.reisebuero.Bestaetigung;
import de.kreth.visitor.reisebuero.Visitor;

public class Ausflug implements Visitable {

   private double preis;
   private Bestaetigung bestaetigung;
   private Date bis;
   private Date von;

   public Ausflug(double preis, Date von, Date bis) {
      super();
      this.preis = preis;
      this.von = von;
      this.bis = bis;
      bestaetigung = new Bestaetigung();
   }

   @Override
   public void calcPreis(Visitor v) {
      v.addPreis(preis);
   }

   @Override
   public void buche(Visitor v) {
      v.buche(preis, this.getClass().getSimpleName() + ": " + bestaetigung.bucheLeistung(von, bis), "");
   }

   @Override
   public String toString() {
      return getClass().getSimpleName();
   }
}
