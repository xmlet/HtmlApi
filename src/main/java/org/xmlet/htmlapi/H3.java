package org.xmlet.htmlapi;

public class H3<Z extends Element> extends AbstractElement<H3<Z>, Z> implements CommonAttributeGroup<H3<Z>, Z>, PhrasingContentChoice<H3<Z>, Z> {
   public H3() {
      super("h3");
   }

   public H3(String name) {
      super(name);
   }

   public H3(Z parent) {
      super(parent, "h3");
   }

   public H3(Z parent, String name) {
      super(parent, name);
   }

   public H3<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public H3<Z> cloneElem() {
      return (H3)this.clone(new H3());
   }
}
