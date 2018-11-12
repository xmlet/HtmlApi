package org.xmlet.htmlapi;

public class Sup<Z extends Element> extends AbstractElement<Sup<Z>, Z> implements CommonAttributeGroup<Sup<Z>, Z>, PhrasingContentChoice<Sup<Z>, Z> {
   public Sup() {
      super("sup");
   }

   public Sup(String name) {
      super(name);
   }

   public Sup(Z parent) {
      super(parent, "sup");
   }

   public Sup(Z parent, String name) {
      super(parent, name);
   }

   public Sup<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Sup<Z> cloneElem() {
      return (Sup)this.clone(new Sup());
   }
}
