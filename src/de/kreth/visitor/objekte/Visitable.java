package de.kreth.visitor.objekte;

import de.kreth.visitor.Visitor;

public interface Visitable {

   void calcPreis(Visitor v);
   void buche(Visitor v);
}
