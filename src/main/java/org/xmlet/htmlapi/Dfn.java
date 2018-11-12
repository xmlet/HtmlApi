package org.xmlet.htmlapi;

public class Dfn<Z extends Element> extends AbstractElement<Dfn<Z>, Z> implements CommonAttributeGroup<Dfn<Z>, Z>, PhrasingContentChoice<Dfn<Z>, Z> {
   public Dfn() {
      super("dfn");
   }

   public Dfn(String name) {
      super(name);
   }

   public Dfn(Z parent) {
      super(parent, "dfn");
   }

   public Dfn(Z parent, String name) {
      super(parent, name);
   }

   public Dfn<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Dfn<Z> cloneElem() {
      return (Dfn)this.clone(new Dfn());
   }
}
