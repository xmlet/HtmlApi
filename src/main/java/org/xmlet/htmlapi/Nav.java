package org.xmlet.htmlapi;

public class Nav<Z extends Element> extends AbstractElement<Nav<Z>, Z> implements CommonAttributeGroup<Nav<Z>, Z>, FlowContentChoice<Nav<Z>, Z> {
   public Nav() {
      super("nav");
   }

   public Nav(String name) {
      super(name);
   }

   public Nav(Z parent) {
      super(parent, "nav");
   }

   public Nav(Z parent, String name) {
      super(parent, name);
   }

   public Nav<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Nav<Z> cloneElem() {
      return (Nav)this.clone(new Nav());
   }
}
