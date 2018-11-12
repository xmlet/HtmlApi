package org.xmlet.htmlapi;

public class Var<Z extends Element> extends AbstractElement<Var<Z>, Z> implements CommonAttributeGroup<Var<Z>, Z>, PhrasingContentChoice<Var<Z>, Z> {
   public Var() {
      super("var");
   }

   public Var(String name) {
      super(name);
   }

   public Var(Z parent) {
      super(parent, "var");
   }

   public Var(Z parent, String name) {
      super(parent, name);
   }

   public Var<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Var<Z> cloneElem() {
      return (Var)this.clone(new Var());
   }
}
