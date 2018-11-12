package org.xmlet.htmlapi;

public class I<Z extends Element> extends AbstractElement<I<Z>, Z> implements CommonAttributeGroup<I<Z>, Z>, PhrasingContentChoice<I<Z>, Z> {
   public I() {
      super("i");
   }

   public I(String name) {
      super(name);
   }

   public I(Z parent) {
      super(parent, "i");
   }

   public I(Z parent, String name) {
      super(parent, name);
   }

   public I<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public I<Z> cloneElem() {
      return (I)this.clone(new I());
   }
}
