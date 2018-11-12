package org.xmlet.htmlapi;

public class Div<Z extends Element> extends AbstractElement<Div<Z>, Z> implements CommonAttributeGroup<Div<Z>, Z>, FlowContentChoice<Div<Z>, Z> {
   public Div() {
      super("div");
   }

   public Div(String name) {
      super(name);
   }

   public Div(Z parent) {
      super(parent, "div");
   }

   public Div(Z parent, String name) {
      super(parent, name);
   }

   public Div<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Div<Z> cloneElem() {
      return (Div)this.clone(new Div());
   }
}
