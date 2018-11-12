package org.xmlet.htmlapi;

public interface UlChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Li<T> li() {
      return (Li)this.addChild(new Li(this.self()));
   }
}
