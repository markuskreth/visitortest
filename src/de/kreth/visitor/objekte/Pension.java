package de.kreth.visitor.objekte;

import de.kreth.visitor.Visitor;

public class Pension implements Visitable {

   private double preis;
   
   public Pension(double preis) {
      super();
      this.preis = preis;
   }

   @Override
   public void calcPreis(Visitor v) {
      v.addPreis(preis);
   }

   @Override
   public void buche(Visitor v) {
      v.buche(preis, getClass().getSimpleName(), "");
   }

}
