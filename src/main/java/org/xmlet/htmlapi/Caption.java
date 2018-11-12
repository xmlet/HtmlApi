package org.xmlet.htmlapi;

public class Caption<Z extends Element> extends AbstractElement<Caption<Z>, Z> implements CommonAttributeGroup<Caption<Z>, Z>, FlowContentChoice<Caption<Z>, Z> {
   public Caption() {
      super("caption");
   }

   public Caption(String name) {
      super(name);
   }

   public Caption(Z parent) {
      super(parent, "caption");
   }

   public Caption(Z parent, String name) {
      super(parent, name);
   }

   public Caption<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Caption<Z> cloneElem() {
      return (Caption)this.clone(new Caption());
   }
}
