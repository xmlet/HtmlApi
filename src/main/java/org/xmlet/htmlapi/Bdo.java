package org.xmlet.htmlapi;

public class Bdo<Z extends Element> extends AbstractElement<Bdo<Z>, Z> implements CommonAttributeGroup<Bdo<Z>, Z>, PhrasingContentChoice<Bdo<Z>, Z> {
   public Bdo() {
      super("bdo");
   }

   public Bdo(String name) {
      super(name);
   }

   public Bdo(Z parent) {
      super(parent, "bdo");
   }

   public Bdo(Z parent, String name) {
      super(parent, name);
   }

   public Bdo<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Bdo<Z> cloneElem() {
      return (Bdo)this.clone(new Bdo());
   }
}
