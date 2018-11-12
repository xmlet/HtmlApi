package org.xmlet.htmlapi;

public class Dd<Z extends Element> extends AbstractElement<Dd<Z>, Z> implements CommonAttributeGroup<Dd<Z>, Z>, FlowContentChoice<Dd<Z>, Z> {
   public Dd() {
      super("dd");
   }

   public Dd(String name) {
      super(name);
   }

   public Dd(Z parent) {
      super(parent, "dd");
   }

   public Dd(Z parent, String name) {
      super(parent, name);
   }

   public Dd<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Dd<Z> cloneElem() {
      return (Dd)this.clone(new Dd());
   }
}
