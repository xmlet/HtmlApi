package org.xmlet.htmlapi;

public class H6<Z extends Element> extends AbstractElement<H6<Z>, Z> implements CommonAttributeGroup<H6<Z>, Z>, PhrasingContentChoice<H6<Z>, Z> {
   public H6() {
      super("h6");
   }

   public H6(String name) {
      super(name);
   }

   public H6(Z parent) {
      super(parent, "h6");
   }

   public H6(Z parent, String name) {
      super(parent, name);
   }

   public H6<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public H6<Z> cloneElem() {
      return (H6)this.clone(new H6());
   }
}
