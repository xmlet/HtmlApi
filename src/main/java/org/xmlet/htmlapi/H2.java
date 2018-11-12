package org.xmlet.htmlapi;

public class H2<Z extends Element> extends AbstractElement<H2<Z>, Z> implements CommonAttributeGroup<H2<Z>, Z>, PhrasingContentChoice<H2<Z>, Z> {
   public H2() {
      super("h2");
   }

   public H2(String name) {
      super(name);
   }

   public H2(Z parent) {
      super(parent, "h2");
   }

   public H2(Z parent, String name) {
      super(parent, name);
   }

   public H2<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public H2<Z> cloneElem() {
      return (H2)this.clone(new H2());
   }
}
