package org.xmlet.htmlapi;

public class H1<Z extends Element> extends AbstractElement<H1<Z>, Z> implements CommonAttributeGroup<H1<Z>, Z>, PhrasingContentChoice<H1<Z>, Z> {
   public H1() {
      super("h1");
   }

   public H1(String name) {
      super(name);
   }

   public H1(Z parent) {
      super(parent, "h1");
   }

   public H1(Z parent, String name) {
      super(parent, name);
   }

   public H1<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public H1<Z> cloneElem() {
      return (H1)this.clone(new H1());
   }
}
