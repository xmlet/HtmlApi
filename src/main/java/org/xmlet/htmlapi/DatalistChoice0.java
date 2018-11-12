package org.xmlet.htmlapi;

public interface DatalistChoice0<T extends Element<T, Z>, Z extends Element> extends PhrasingContentChoice<T, Z> {
   default Option<T> option() {
      return (Option)this.addChild(new Option(this.self()));
   }
}
