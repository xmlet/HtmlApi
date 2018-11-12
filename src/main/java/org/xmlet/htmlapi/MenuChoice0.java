package org.xmlet.htmlapi;

public interface MenuChoice0<T extends Element<T, Z>, Z extends Element> extends FlowContentChoice<T, Z> {
   default Li<T> li() {
      return (Li)this.addChild(new Li(this.self()));
   }
}
