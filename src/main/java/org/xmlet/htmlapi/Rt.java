package org.xmlet.htmlapi;

public class Rt<Z extends Element> extends AbstractElement<Rt<Z>, Z> implements CommonAttributeGroup<Rt<Z>, Z>, PhrasingContentChoice<Rt<Z>, Z> {
   public Rt() {
      super("rt");
   }

   public Rt(String name) {
      super(name);
   }

   public Rt(Z parent) {
      super(parent, "rt");
   }

   public Rt(Z parent, String name) {
      super(parent, name);
   }

   public Rt<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Rt<Z> cloneElem() {
      return (Rt)this.clone(new Rt());
   }
}
