package org.xmlet.htmlapi;

public class Br<Z extends Element> extends AbstractElement<Br<Z>, Z> implements CommonAttributeGroup<Br<Z>, Z>, TextGroup<Br<Z>, Z> {
   public Br() {
      super("br");
   }

   public Br(String name) {
      super(name);
   }

   public Br(Z parent) {
      super(parent, "br");
   }

   public Br(Z parent, String name) {
      super(parent, name);
   }

   public Br<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Br<Z> cloneElem() {
      return (Br)this.clone(new Br());
   }
}
