package org.xmlet.htmlapi;

public class Svg<Z extends Element> extends AbstractElement<Svg<Z>, Z> implements CommonAttributeGroup<Svg<Z>, Z>, TextGroup<Svg<Z>, Z> {
   public Svg() {
      super("svg");
   }

   public Svg(String name) {
      super(name);
   }

   public Svg(Z parent) {
      super(parent, "svg");
   }

   public Svg(Z parent, String name) {
      super(parent, name);
   }

   public Svg<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Svg<Z> cloneElem() {
      return (Svg)this.clone(new Svg());
   }
}
