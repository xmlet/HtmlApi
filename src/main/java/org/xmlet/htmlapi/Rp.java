package org.xmlet.htmlapi;

public class Rp<Z extends Element> extends AbstractElement<Rp<Z>, Z> implements CommonAttributeGroup<Rp<Z>, Z>, PhrasingContentChoice<Rp<Z>, Z> {
   public Rp() {
      super("rp");
   }

   public Rp(String name) {
      super(name);
   }

   public Rp(Z parent) {
      super(parent, "rp");
   }

   public Rp(Z parent, String name) {
      super(parent, name);
   }

   public Rp<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Rp<Z> cloneElem() {
      return (Rp)this.clone(new Rp());
   }
}
