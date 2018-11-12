package org.xmlet.htmlapi;

public class Code<Z extends Element> extends AbstractElement<Code<Z>, Z> implements CommonAttributeGroup<Code<Z>, Z>, PhrasingContentChoice<Code<Z>, Z> {
   public Code() {
      super("code");
   }

   public Code(String name) {
      super(name);
   }

   public Code(Z parent) {
      super(parent, "code");
   }

   public Code(Z parent, String name) {
      super(parent, name);
   }

   public Code<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Code<Z> cloneElem() {
      return (Code)this.clone(new Code());
   }
}
