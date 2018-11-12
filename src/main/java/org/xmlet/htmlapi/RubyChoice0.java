package org.xmlet.htmlapi;

public interface RubyChoice0<T extends Element<T, Z>, Z extends Element> extends PhrasingContentChoice<T, Z> {
   default Rt<T> rt() {
      return (Rt)this.addChild(new Rt(this.self()));
   }

   default Rp<T> rp() {
      return (Rp)this.addChild(new Rp(this.self()));
   }
}
