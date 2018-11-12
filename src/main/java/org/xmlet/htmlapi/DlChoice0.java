package org.xmlet.htmlapi;

public interface DlChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Dd<T> dd() {
      return (Dd)this.addChild(new Dd(this.self()));
   }

   default Dt<T> dt() {
      return (Dt)this.addChild(new Dt(this.self()));
   }
}
