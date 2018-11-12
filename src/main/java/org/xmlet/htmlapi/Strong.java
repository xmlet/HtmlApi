package org.xmlet.htmlapi;

public class Strong<Z extends Element> extends AbstractElement<Strong<Z>, Z> implements CommonAttributeGroup<Strong<Z>, Z>, PhrasingContentChoice<Strong<Z>, Z> {
   public Strong() {
      super("strong");
   }

   public Strong(String name) {
      super(name);
   }

   public Strong(Z parent) {
      super(parent, "strong");
   }

   public Strong(Z parent, String name) {
      super(parent, name);
   }

   public Strong<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Strong<Z> cloneElem() {
      return (Strong)this.clone(new Strong());
   }
}
