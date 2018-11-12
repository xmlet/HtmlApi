package org.xmlet.htmlapi;

public interface TfootChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Tr<T> tr() {
      return (Tr)this.addChild(new Tr(this.self()));
   }
}
