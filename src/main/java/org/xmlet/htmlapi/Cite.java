package org.xmlet.htmlapi;

public class Cite<Z extends Element> extends AbstractElement<Cite<Z>, Z> implements CommonAttributeGroup<Cite<Z>, Z>, PhrasingContentChoice<Cite<Z>, Z> {
   public Cite() {
      super("cite");
   }

   public Cite(String name) {
      super(name);
   }

   public Cite(Z parent) {
      super(parent, "cite");
   }

   public Cite(Z parent, String name) {
      super(parent, name);
   }

   public Cite<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Cite<Z> cloneElem() {
      return (Cite)this.clone(new Cite());
   }
}
