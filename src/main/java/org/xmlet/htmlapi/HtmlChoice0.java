package org.xmlet.htmlapi;

public interface HtmlChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Body<T> body() {
      return (Body)this.addChild(new Body(this.self()));
   }

   default Head<T> head() {
      return (Head)this.addChild(new Head(this.self()));
   }
}
