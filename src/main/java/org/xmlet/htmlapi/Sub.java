package org.xmlet.htmlapi;

public class Sub<Z extends Element> extends AbstractElement<Sub<Z>, Z> implements CommonAttributeGroup<Sub<Z>, Z>, PhrasingContentChoice<Sub<Z>, Z> {
   public Sub() {
      super("sub");
   }

   public Sub(String name) {
      super(name);
   }

   public Sub(Z parent) {
      super(parent, "sub");
   }

   public Sub(Z parent, String name) {
      super(parent, name);
   }

   public Sub<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Sub<Z> cloneElem() {
      return (Sub)this.clone(new Sub());
   }
}
