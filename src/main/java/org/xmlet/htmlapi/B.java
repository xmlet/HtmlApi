package org.xmlet.htmlapi;

public class B<Z extends Element> extends AbstractElement<B<Z>, Z> implements CommonAttributeGroup<B<Z>, Z>, PhrasingContentChoice<B<Z>, Z> {
   public B() {
      super("b");
   }

   public B(String name) {
      super(name);
   }

   public B(Z parent) {
      super(parent, "b");
   }

   public B(Z parent, String name) {
      super(parent, name);
   }

   public B<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public B<Z> cloneElem() {
      return (B)this.clone(new B());
   }
}
