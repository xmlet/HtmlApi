package org.xmlet.htmlapi;

public class Abbr<Z extends Element> extends AbstractElement<Abbr<Z>, Z> implements CommonAttributeGroup<Abbr<Z>, Z>, PhrasingContentChoice<Abbr<Z>, Z> {
   public Abbr() {
      super("abbr");
   }

   public Abbr(String name) {
      super(name);
   }

   public Abbr(Z parent) {
      super(parent, "abbr");
   }

   public Abbr(Z parent, String name) {
      super(parent, name);
   }

   public Abbr<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Abbr<Z> cloneElem() {
      return (Abbr)this.clone(new Abbr());
   }
}
