package org.xmlet.htmlapi;

public class Dt<Z extends Element> extends AbstractElement<Dt<Z>, Z> implements CommonAttributeGroup<Dt<Z>, Z>, PhrasingContentChoice<Dt<Z>, Z> {
   public Dt() {
      super("dt");
   }

   public Dt(String name) {
      super(name);
   }

   public Dt(Z parent) {
      super(parent, "dt");
   }

   public Dt(Z parent, String name) {
      super(parent, name);
   }

   public Dt<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Dt<Z> cloneElem() {
      return (Dt)this.clone(new Dt());
   }
}
