package org.xmlet.htmlapi;

public interface ObjectChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Param<T> param() {
      return (Param)this.addChild(new Param(this.self()));
   }
}
