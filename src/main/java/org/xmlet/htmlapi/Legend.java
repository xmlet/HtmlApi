package org.xmlet.htmlapi;

public class Legend<Z extends Element> extends AbstractElement<Legend<Z>, Z> implements CommonAttributeGroup<Legend<Z>, Z>, LegendChoice0<Legend<Z>, Z> {
   public Legend() {
      super("legend");
   }

   public Legend(String name) {
      super(name);
   }

   public Legend(Z parent) {
      super(parent, "legend");
   }

   public Legend(Z parent, String name) {
      super(parent, name);
   }

   public Legend<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Legend<Z> cloneElem() {
      return (Legend)this.clone(new Legend());
   }
}
