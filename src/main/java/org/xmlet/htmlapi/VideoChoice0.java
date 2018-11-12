package org.xmlet.htmlapi;

public interface VideoChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Source<T> source() {
      return (Source)this.addChild(new Source(this.self()));
   }
}
