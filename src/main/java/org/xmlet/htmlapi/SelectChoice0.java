package org.xmlet.htmlapi;

public interface SelectChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Option<T> option() {
      return (Option)this.addChild(new Option(this.self()));
   }

   default Optgroup<T> optgroup() {
      return (Optgroup)this.addChild(new Optgroup(this.self()));
   }
}
