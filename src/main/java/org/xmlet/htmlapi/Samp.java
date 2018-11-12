package org.xmlet.htmlapi;

public class Samp<Z extends Element> extends AbstractElement<Samp<Z>, Z> implements CommonAttributeGroup<Samp<Z>, Z>, PhrasingContentChoice<Samp<Z>, Z> {
   public Samp() {
      super("samp");
   }

   public Samp(String name) {
      super(name);
   }

   public Samp(Z parent) {
      super(parent, "samp");
   }

   public Samp(Z parent, String name) {
      super(parent, name);
   }

   public Samp<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Samp<Z> cloneElem() {
      return (Samp)this.clone(new Samp());
   }
}
