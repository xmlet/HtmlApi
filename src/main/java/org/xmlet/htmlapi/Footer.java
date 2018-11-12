package org.xmlet.htmlapi;

public class Footer<Z extends Element> extends AbstractElement<Footer<Z>, Z> implements CommonAttributeGroup<Footer<Z>, Z>, FlowContentChoice<Footer<Z>, Z> {
   public Footer() {
      super("footer");
   }

   public Footer(String name) {
      super(name);
   }

   public Footer(Z parent) {
      super(parent, "footer");
   }

   public Footer(Z parent, String name) {
      super(parent, name);
   }

   public Footer<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Footer<Z> cloneElem() {
      return (Footer)this.clone(new Footer());
   }
}
