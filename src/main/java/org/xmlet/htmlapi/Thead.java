package org.xmlet.htmlapi;

public class Thead<Z extends Element> extends AbstractElement<Thead<Z>, Z> implements CommonAttributeGroup<Thead<Z>, Z>, TheadChoice0<Thead<Z>, Z> {
   public Thead() {
      super("thead");
   }

   public Thead(String name) {
      super(name);
   }

   public Thead(Z parent) {
      super(parent, "thead");
   }

   public Thead(Z parent, String name) {
      super(parent, name);
   }

   public Thead<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Thead<Z> cloneElem() {
      return (Thead)this.clone(new Thead());
   }
}
