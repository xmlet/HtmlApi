package org.xmlet.htmlapi;

public class Aside<Z extends Element> extends AbstractElement<Aside<Z>, Z> implements CommonAttributeGroup<Aside<Z>, Z>, FlowContentChoice<Aside<Z>, Z> {
   public Aside() {
      super("aside");
   }

   public Aside(String name) {
      super(name);
   }

   public Aside(Z parent) {
      super(parent, "aside");
   }

   public Aside(Z parent, String name) {
      super(parent, name);
   }

   public Aside<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Aside<Z> cloneElem() {
      return (Aside)this.clone(new Aside());
   }
}
