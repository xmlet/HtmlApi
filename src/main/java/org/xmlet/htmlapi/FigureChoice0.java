package org.xmlet.htmlapi;

public interface FigureChoice0<T extends Element<T, Z>, Z extends Element> extends FlowContentChoice<T, Z> {
   default Legend<T> legend() {
      return (Legend)this.addChild(new Legend(this.self()));
   }
}
