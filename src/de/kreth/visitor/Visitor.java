package de.kreth.visitor;


public interface Visitor {
   void addPreis(double preis);
   void buche(double preis, String name, String bedingung);
   
}
