package org.xmlet.htmlapi;

public class P<Z extends Element> extends AbstractElement<P<Z>, Z> implements CommonAttributeGroup<P<Z>, Z>, PhrasingContentChoice<P<Z>, Z> {
   public P() {
      super("p");
   }

   public P(String name) {
      super(name);
   }

   public P(Z parent) {
      super(parent, "p");
   }

   public P(Z parent, String name) {
      super(parent, name);
   }

   public P<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public P<Z> cloneElem() {
      return (P)this.clone(new P());
   }
}
