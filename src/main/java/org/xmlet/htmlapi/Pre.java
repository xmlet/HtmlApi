package org.xmlet.htmlapi;

public class Pre<Z extends Element> extends AbstractElement<Pre<Z>, Z> implements CommonAttributeGroup<Pre<Z>, Z>, PhrasingContentChoice<Pre<Z>, Z> {
   public Pre() {
      super("pre");
   }

   public Pre(String name) {
      super(name);
   }

   public Pre(Z parent) {
      super(parent, "pre");
   }

   public Pre(Z parent, String name) {
      super(parent, name);
   }

   public Pre<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Pre<Z> cloneElem() {
      return (Pre)this.clone(new Pre());
   }
}
