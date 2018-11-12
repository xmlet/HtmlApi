package org.xmlet.htmlapi;

public interface OptgroupChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Option<T> option() {
      return (Option)this.addChild(new Option(this.self()));
   }
}
