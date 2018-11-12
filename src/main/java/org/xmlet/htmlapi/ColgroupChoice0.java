package org.xmlet.htmlapi;

public interface ColgroupChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Col<T> col() {
      return (Col)this.addChild(new Col(this.self()));
   }
}
