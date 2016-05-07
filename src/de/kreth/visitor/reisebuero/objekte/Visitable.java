package de.kreth.visitor.reisebuero.objekte;

import de.kreth.visitor.reisebuero.Visitor;

public interface Visitable {

   void calcPreis(Visitor v);
   void buche(Visitor v);
}
