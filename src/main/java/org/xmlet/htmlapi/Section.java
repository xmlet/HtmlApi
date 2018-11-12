package org.xmlet.htmlapi;

public class Section<Z extends Element> extends AbstractElement<Section<Z>, Z> implements CommonAttributeGroup<Section<Z>, Z>, FlowContentChoice<Section<Z>, Z> {
   public Section() {
      super("section");
   }

   public Section(String name) {
      super(name);
   }

   public Section(Z parent) {
      super(parent, "section");
   }

   public Section(Z parent, String name) {
      super(parent, name);
   }

   public Section<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Section<Z> cloneElem() {
      return (Section)this.clone(new Section());
   }
}
