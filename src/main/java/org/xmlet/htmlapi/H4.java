package org.xmlet.htmlapi;

public class H4<Z extends Element> extends AbstractElement<H4<Z>, Z> implements CommonAttributeGroup<H4<Z>, Z>, PhrasingContentChoice<H4<Z>, Z> {
   public H4() {
      super("h4");
   }

   public H4(String name) {
      super(name);
   }

   public H4(Z parent) {
      super(parent, "h4");
   }

   public H4(Z parent, String name) {
      super(parent, name);
   }

   public H4<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public H4<Z> cloneElem() {
      return (H4)this.clone(new H4());
   }
}
