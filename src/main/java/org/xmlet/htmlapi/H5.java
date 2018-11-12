package org.xmlet.htmlapi;

public class H5<Z extends Element> extends AbstractElement<H5<Z>, Z> implements CommonAttributeGroup<H5<Z>, Z>, PhrasingContentChoice<H5<Z>, Z> {
   public H5() {
      super("h5");
   }

   public H5(String name) {
      super(name);
   }

   public H5(Z parent) {
      super(parent, "h5");
   }

   public H5(Z parent, String name) {
      super(parent, name);
   }

   public H5<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public H5<Z> cloneElem() {
      return (H5)this.clone(new H5());
   }
}
