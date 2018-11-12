package org.xmlet.htmlapi;

public class Kbd<Z extends Element> extends AbstractElement<Kbd<Z>, Z> implements CommonAttributeGroup<Kbd<Z>, Z>, PhrasingContentChoice<Kbd<Z>, Z> {
   public Kbd() {
      super("kbd");
   }

   public Kbd(String name) {
      super(name);
   }

   public Kbd(Z parent) {
      super(parent, "kbd");
   }

   public Kbd(Z parent, String name) {
      super(parent, name);
   }

   public Kbd<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Kbd<Z> cloneElem() {
      return (Kbd)this.clone(new Kbd());
   }
}
