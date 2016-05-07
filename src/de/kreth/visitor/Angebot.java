package de.kreth.visitor;

import java.util.ArrayList;
import java.util.List;

public class Angebot implements Visitor {

   private double preis;
   private List<String> posten = new ArrayList<>();
   
   @Override
   public void addPreis(double preis) {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void buche(double preis, String name, String bedingung) {
      // TODO Auto-generated method stub
      
   }

}
