package org.xmlet.htmlapi;

public class Ruby<Z extends Element> extends AbstractElement<Ruby<Z>, Z> implements CommonAttributeGroup<Ruby<Z>, Z>, RubyChoice0<Ruby<Z>, Z> {
   public Ruby() {
      super("ruby");
   }

   public Ruby(String name) {
      super(name);
   }

   public Ruby(Z parent) {
      super(parent, "ruby");
   }

   public Ruby(Z parent, String name) {
      super(parent, name);
   }

   public Ruby<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Ruby<Z> cloneElem() {
      return (Ruby)this.clone(new Ruby());
   }
}
