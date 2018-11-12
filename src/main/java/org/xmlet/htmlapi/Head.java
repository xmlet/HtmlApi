package org.xmlet.htmlapi;

public class Head<Z extends Element> extends AbstractElement<Head<Z>, Z> implements CommonAttributeGroup<Head<Z>, Z>, MetadataContentChoice<Head<Z>, Z> {
   public Head() {
      super("head");
   }

   public Head(String name) {
      super(name);
   }

   public Head(Z parent) {
      super(parent, "head");
   }

   public Head(Z parent, String name) {
      super(parent, name);
   }

   public Head<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Head<Z> cloneElem() {
      return (Head)this.clone(new Head());
   }
}
