package org.xmlet.htmlapi;

public class Tr<Z extends Element> extends AbstractElement<Tr<Z>, Z> implements CommonAttributeGroup<Tr<Z>, Z>, TrChoice0<Tr<Z>, Z> {
   public Tr() {
      super("tr");
   }

   public Tr(String name) {
      super(name);
   }

   public Tr(Z parent) {
      super(parent, "tr");
   }

   public Tr(Z parent, String name) {
      super(parent, name);
   }

   public Tr<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Tr<Z> cloneElem() {
      return (Tr)this.clone(new Tr());
   }
}
