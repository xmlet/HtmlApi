package org.xmlet.htmlapi;

public class Em<Z extends Element> extends AbstractElement<Em<Z>, Z> implements CommonAttributeGroup<Em<Z>, Z>, PhrasingContentChoice<Em<Z>, Z> {
   public Em() {
      super("em");
   }

   public Em(String name) {
      super(name);
   }

   public Em(Z parent) {
      super(parent, "em");
   }

   public Em(Z parent, String name) {
      super(parent, name);
   }

   public Em<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Em<Z> cloneElem() {
      return (Em)this.clone(new Em());
   }
}
