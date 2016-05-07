package de.kreth.visitor.reisebuero;

import java.util.ArrayList;
import java.util.List;

public class Angebot implements Visitor {

   private double preis;
   private List<String> posten = new ArrayList<>();
   
   @Override
   public void addPreis(double preis) {
      this.preis += preis;
   }

   @Override
   public void buche(double preis, String name, String bedingung) {
      posten.add(name);
   }

}
