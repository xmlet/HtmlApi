package org.xmlet.htmlapi;

public class Small<Z extends Element> extends AbstractElement<Small<Z>, Z> implements CommonAttributeGroup<Small<Z>, Z>, PhrasingContentChoice<Small<Z>, Z> {
   public Small() {
      super("small");
   }

   public Small(String name) {
      super(name);
   }

   public Small(Z parent) {
      super(parent, "small");
   }

   public Small(Z parent, String name) {
      super(parent, name);
   }

   public Small<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Small<Z> cloneElem() {
      return (Small)this.clone(new Small());
   }
}
