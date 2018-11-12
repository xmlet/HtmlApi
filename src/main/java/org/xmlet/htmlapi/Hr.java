package org.xmlet.htmlapi;

public class Hr<Z extends Element> extends AbstractElement<Hr<Z>, Z> implements CommonAttributeGroup<Hr<Z>, Z>, TextGroup<Hr<Z>, Z> {
   public Hr() {
      super("hr");
   }

   public Hr(String name) {
      super(name);
   }

   public Hr(Z parent) {
      super(parent, "hr");
   }

   public Hr(Z parent, String name) {
      super(parent, name);
   }

   public Hr<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Hr<Z> cloneElem() {
      return (Hr)this.clone(new Hr());
   }
}
