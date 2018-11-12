package org.xmlet.htmlapi;

public interface TrChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Th<T> th() {
      return (Th)this.addChild(new Th(this.self()));
   }

   default Td<T> td() {
      return (Td)this.addChild(new Td(this.self()));
   }
}
