package org.xmlet.htmlapi;

public class Header<Z extends Element> extends AbstractElement<Header<Z>, Z> implements CommonAttributeGroup<Header<Z>, Z>, FlowContentChoice<Header<Z>, Z> {
   public Header() {
      super("header");
   }

   public Header(String name) {
      super(name);
   }

   public Header(Z parent) {
      super(parent, "header");
   }

   public Header(Z parent, String name) {
      super(parent, name);
   }

   public Header<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Header<Z> cloneElem() {
      return (Header)this.clone(new Header());
   }
}
