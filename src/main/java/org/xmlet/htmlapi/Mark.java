package org.xmlet.htmlapi;

public class Mark<Z extends Element> extends AbstractElement<Mark<Z>, Z> implements CommonAttributeGroup<Mark<Z>, Z>, PhrasingContentChoice<Mark<Z>, Z> {
   public Mark() {
      super("mark");
   }

   public Mark(String name) {
      super(name);
   }

   public Mark(Z parent) {
      super(parent, "mark");
   }

   public Mark(Z parent, String name) {
      super(parent, name);
   }

   public Mark<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Mark<Z> cloneElem() {
      return (Mark)this.clone(new Mark());
   }
}
