package org.xmlet.htmlapi;

public class Span<Z extends Element> extends AbstractElement<Span<Z>, Z> implements CommonAttributeGroup<Span<Z>, Z>, PhrasingContentChoice<Span<Z>, Z> {
   public Span() {
      super("span");
   }

   public Span(String name) {
      super(name);
   }

   public Span(Z parent) {
      super(parent, "span");
   }

   public Span(Z parent, String name) {
      super(parent, name);
   }

   public Span<Z> self() {
      return this;
   }

   public void accept(ElementVisitor visitor) {
      visitor.visit(this);
   }

   public Span<Z> cloneElem() {
      return (Span)this.clone(new Span());
   }
}
