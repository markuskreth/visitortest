package de.kreth.visitor.objekte;

import de.kreth.visitor.Visitor;

public class HotelZimmer implements Visitable {

   private double preis;
   
   public HotelZimmer(double preis) {
      super();
      this.preis = preis;
   }

   @Override
   public void calcPreis(Visitor v) {
      v.addPreis(preis);
   }

   @Override
   public void buche(Visitor v) {
      v.buche(preis, this.getClass().getSimpleName(), "");
   }

}
