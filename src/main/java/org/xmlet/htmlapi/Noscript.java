package org.xmlet.htmlapi;

public class Noscript<Z extends Element> extends AbstractElement<Noscript<Z>, Z> implements CommonAttributeGroup<Noscript<Z>, Z>, FlowContentChoice<Noscript<Z>, Z> {
   public Noscript() {
      super("noscript");
   }

   public Noscript(String name) {
      super(name);
   }

   public Noscript(Z parent) {
      super(parent, "noscript");
   }

   public Noscript(Z parent, String name) {
      super(parent, name);
   }

   public Noscript<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Noscript<Z> cloneElem() {
      return (Noscript)this.clone(new Noscript());
   }
}
